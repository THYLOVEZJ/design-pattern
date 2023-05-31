package com.thylovecode.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description:
 * @author: thy
 * @date: 2023年05月31日 23:18
 */

public class TeacherDaoProxy {
    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao iTeacherDao) {
        this.target = iTeacherDao;
    }

    /**
     * public static Object newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h)
     * ClassLoader:被代理对象的类加载器
     *
     * @return
     */

    public Object getProxyObjects() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代理方法执行......");
                        method.invoke(target,args);
                        return proxy;
                    }
                });
    }
}
