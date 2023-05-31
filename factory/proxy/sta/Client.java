package com.thylovecode.factory.proxy.sta;

/**
 * @Description: 客户端代码
 * @author: thy
 * @date: 2023年05月31日 22:16
 */

public class Client {
    public static void main(String[] args) {
        ITeacherDao iTeacherDao = new ITeacherDao();
        ITeacherDaoProxy iTeacherDaoProxy = new ITeacherDaoProxy(iTeacherDao);
        iTeacherDaoProxy.teach();
    }
}
