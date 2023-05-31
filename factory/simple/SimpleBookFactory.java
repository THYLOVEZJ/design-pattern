package com.thylovecode.factory.simple;

/**
 * @Description:
 * @author: thy
 * @date: 2023年03月29日 16:47
 */

public class SimpleBookFactory {
    public Book createBook(String type) {
        Book book = null;
        if (type.equals("历史")) {
            book = new HistoryBook();
        } else if (type.equals("计算机")) {
            book = new ComputerBook();
        }
        return book;
    }
}
