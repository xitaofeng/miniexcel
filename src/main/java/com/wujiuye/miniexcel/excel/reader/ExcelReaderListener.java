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
package com.wujiuye.miniexcel.excel.reader;

/**
 * @author wujiuye
 * @version 1.0 on 2019/4/13 {描述：}
 */
public interface ExcelReaderListener {

    /**
     * 出异常时被调用
     */
    default void onError(Exception error) {

    }

    /**
     * 开始读取该Sheet
     *
     * @param sheetName sheet名
     */
    void onReadSheetStart(String sheetName);

    /**
     * 处理读取列标题
     *
     * @param cellNumber
     * @param cellTitle
     */
    void onReadSheetTitle(int cellNumber, String cellTitle);

    /**
     * 处理读取一行
     *
     * @param data       当前（行，列）的数据
     * @param rowNumber  当前行号
     * @param cellNumber 当前列号
     * @return
     */
    void onReadRow(Object data, int rowNumber, int cellNumber);

}
