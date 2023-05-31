package com.thylovecode.proxy.dynamic;

/**
 * @Description:
 * @author: thy
 * @date: 2023年05月31日 23:24
 */

public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        ITeacherDao iTeacherDao = (ITeacherDao)teacherDaoProxy.getProxyObjects();
//        iTeacherDao.teach();
        iTeacherDao.say("张三");
    }
}
