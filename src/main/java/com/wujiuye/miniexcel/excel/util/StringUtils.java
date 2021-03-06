/**
 * Copyright [2019-2020] [wujiuye]
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wujiuye.miniexcel.excel.util;

/**
 * @author wujiuye
 * @version 1.0 on 2019/5/6 {描述：}
 */
public class StringUtils {

    /**
     * 判断字符串是否为空
     *
     * @param str 字符串
     * @return true: 空串，false: 非空串
     */
    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }


    /**
     * 判断一个字符串是否是数字
     *
     * @param srt 字符串
     * @return
     */
    public static boolean isNumber(String srt) {
        if (isEmpty(srt)) {
            return false;
        }
        for (char ch : srt.toCharArray()) {
            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }

}
