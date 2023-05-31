package com.thylovecode.factory.proxy.sta;

/**
 * @Description:
 * @author: thy
 * @date: 2023年05月31日 22:14
 */

public class ITeacherDaoProxy implements ITeacher {

    private ITeacher target;

    public ITeacherDaoProxy(ITeacher iTeacher) {
        this.target = iTeacher;
    }

    @Override
    public void teach() {
        System.out.println("开始代理....");
        target.teach();
        System.out.println("结束代理....");
    }
}
