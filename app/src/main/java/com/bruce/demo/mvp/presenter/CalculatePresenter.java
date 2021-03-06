/*
 * BruceHurrican
 * Copyright (c) 2016.
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *    This document is Bruce's individual learning the android demo, wherein the use of the code from the Internet, only to use as a learning exchanges.
 *   And where any person can download and use, but not for commercial purposes.
 *   Author does not assume the resulting corresponding disputes.
 *   If you have good suggestions for the code, you can contact BurrceHurrican@foxmail.com
 *   本文件为Bruce's个人学习android的demo, 其中所用到的代码来源于互联网，仅作为学习交流使用。
 *   任和何人可以下载并使用, 但是不能用于商业用途。
 *   作者不承担由此带来的相应纠纷。
 *   如果对本代码有好的建议，可以联系BurrceHurrican@foxmail.com
 */

package com.bruce.demo.mvp.presenter;

import com.bruce.demo.mvp.model.CalculateTwoNumbers;
import com.bruce.demo.mvp.view.IResult;
import com.bruceutils.utils.LogUtils;

/**
 * Created by BruceHurrican on 16-3-23.
 */
public class CalculatePresenter implements ICalculate {
    private IResult iResult;
    private CalculateTwoNumbers calculateTwoNumbers;

    public CalculatePresenter(IResult iResult) {
        this.iResult = iResult;
        calculateTwoNumbers = new CalculateTwoNumbers();
    }

    public void initUser(int n1, int n2) {
        calculateTwoNumbers.n1 = n1;
        calculateTwoNumbers.n2 = n2;
        mathAdd();
        mathSubtract();
        mathMultiply();
        if (n2 != 0) {
            mathDivide();
        } else {
            LogUtils.e("数据格式错误");
            calculateTwoNumbers.n2 = 1;
            mathDivide();
        }
    }

    @Override
    public void mathAdd() {
        if (iResult != null) {
            iResult.showAdd(calculateTwoNumbers.addResult());
        }
    }

    @Override
    public void mathSubtract() {
        if (iResult != null) {
            iResult.showSubtract(calculateTwoNumbers.subtractResult());
        }
    }

    @Override
    public void mathMultiply() {
        if (iResult != null) {
            iResult.showMultiply(calculateTwoNumbers.multiplyResult());
        }
    }

    @Override
    public void mathDivide() {
        if (iResult != null) {
            iResult.showDivide(calculateTwoNumbers.divideResult());
        }
    }

    @Override
    public void clear() {
        if (iResult != null) {
            iResult = null;
        }
    }
}
