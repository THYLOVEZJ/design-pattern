package com.thylovecode.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author: thy
 * @date: 2023年03月24日 23:10
 */

public class ObjectFor3D implements Subject {
    List<Observer> observers = new ArrayList<>();

    private String msg;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }

    /**
     * 主题更新消息
     *
     * @param msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
        notifyObservers();
    }

}
