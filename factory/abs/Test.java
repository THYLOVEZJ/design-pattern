package com.thylovecode.factory.abs;

/**
 * @Description:
 * @author: thy
 * @date: 2023年03月29日 18:21
 */

public class Test {
    public static void main(String[] args) {
        WeiXiangFactory weiXiangFactory = new WeiXiangFactory();
        Paper paper = weiXiangFactory.createPaper();
        paper.display();
    }
}
