package com.thylovecode.factory.abs;

/**
 * @Description:
 * @author: thy
 * @date: 2023年03月29日 18:11
 */

public class WeiXiangFactory extends BookFactory{
    @Override
    public Book createBook() {
        return new HistoryBook();
    }

    @Override
    public Paper createPaper() {
        return new HistoryPaper();
    }
}
