package com.wzc.javase.about.desginModel.observerModel;

import java.util.ArrayList;
import java.util.List;

/**
 * 类描述:
 *
 * @author 吴智聪
 * @version 1.0
 * @date 2022/3/10 16:02
 */
public class SubjectImpl implements Subject {

    List<Observer> list = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        for (Observer observer : list) {
            observer.update();
        }
    }

    public void operate() {
        System.out.println("执行操作完毕");
        notifyAllObserver();
    }
}
