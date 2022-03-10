package com.wzc.javase.about.desginModel.observerModel;

/**
 * 类描述: 规则
 *
 * @author 吴智聪
 * @version 1.0
 * @date 2022/3/10 16:00
 */
public interface Subject {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyAllObserver();

    void operate();

}
