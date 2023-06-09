package com.thylovecode.observer;

/**
 * @Description:
 * @author: thy
 * @date: 2023年03月24日 23:15
 */

public class Observer1 implements Observer{
    private Subject subject;

    public Observer1(Subject subject)
    {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg)
    {
        System.out.println("observer1 得到 3D 号码  -->" + msg + ", 我要记下来。");
    }

}
