package com.thylovecode.factory.proxy.sta;

/**
 * @Description:
 * @author: thy
 * @date: 2023年05月31日 22:13
 */

public class ITeacherDao implements ITeacher {
    @Override
    public void teach() {
        System.out.println("teach");
    }
}
