package com.thylovecode.proxy.dynamic;

/**
 * @Description:
 * @author: thy
 * @date: 2023年05月31日 23:17
 */

public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("讲课中....");
    }

    @Override
    public void say(String name) {
        System.out.println("起来回答问题：" + name);
    }

}
