package com.thylovecode.factory.simple;

/**
 * @Description:
 * @author: thy
 * @date: 2023年03月29日 16:38
 */

public class BookStore {
    private SimpleBookFactory simpleBookFactory;

    public BookStore() {
        this.simpleBookFactory = new SimpleBookFactory();
    }

    public Book sellBook(String type) {
        Book book = simpleBookFactory.createBook(type);
        book.prepare();
        book.printWord();
        book.pack();
        return book;
    }
}
