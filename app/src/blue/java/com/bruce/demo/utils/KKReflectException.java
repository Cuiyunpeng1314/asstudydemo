/*
 * Copyright (c) 2011-2016, Data Geekery GmbH (http://www.datageekery.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bruce.demo.utils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

/**
 * 自定义反射工具类-异常
 * <p>
 * These exceptions are
 * <ul>
 * <li> {@link ClassNotFoundException}</li>
 * <li> {@link IllegalAccessException}</li>
 * <li> {@link IllegalArgumentException}</li>
 * <li> {@link InstantiationException}</li>
 * <li> {@link InvocationTargetException}</li>
 * <li> {@link NoSuchMethodException}</li>
 * <li> {@link NoSuchFieldException}</li>
 * <li> {@link SecurityException}</li>
 * </ul>
 * Created by BruceHurrican on 17/1/16.
 */

public class KKReflectException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = -8354020044237792559L;

    public KKReflectException(String message) {
        super(message);
    }

    public KKReflectException(String message, Throwable cause) {
        super(message, cause);
    }

    public KKReflectException() {
        super();
    }

    public KKReflectException(Throwable cause) {
        super(cause);
    }
}
