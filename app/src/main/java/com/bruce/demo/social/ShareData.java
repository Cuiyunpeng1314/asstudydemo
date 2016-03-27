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

package com.bruce.demo.social;

import java.util.ArrayList;

/**
 * 分享数据包括标题,url,图片等
 * Created by BruceHurrican on 2016/3/27.
 */
public class ShareData {
    /**
     * 分享标题
     */
    public String title;
    /**
     * 分享内容
     */
    public String content;
    /**
     * 用户点击后跳转的URL
     */
    public String targetUrl;
    /**
     * 单个图片url,适用于QQ分享
     */
    public String imgUrl;
    /**
     * 图片url集合,适用于QQ空间分享,分享的图片在QQ空间上只显示imgList.get(0)的其余不显示
     */
    public ArrayList<String> imgList;
}
