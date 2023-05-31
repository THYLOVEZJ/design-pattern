package com.thylovecode.factory.simple;

/**
 * @Description:
 * @author: thy
 * @date: 2023年03月29日 16:39
 */

public abstract class Book {
    protected String name;

    public void prepare() {
        System.out.println("准备纸张");
    }

    public void printWord() {
        System.out.println("印刷");
    }

    public void pack() {
        System.out.println("装订");
    }
}
