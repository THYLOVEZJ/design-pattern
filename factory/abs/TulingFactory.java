package com.thylovecode.factory.abs;

/**
 * @Description:
 * @author: thy
 * @date: 2023年03月29日 18:20
 */

public class TulingFactory extends BookFactory{
    @Override
    public Book createBook() {
        return new MathBook();
    }

    @Override
    public Paper createPaper() {
        return new MathPaper();
    }
}
