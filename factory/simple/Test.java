package com.thylovecode.factory.simple;

/**
 * @Description:
 * @author: thy
 * @date: 2023年03月29日 16:59
 */

public class Test {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        Book book = bookStore.sellBook("历史");
    }
}
