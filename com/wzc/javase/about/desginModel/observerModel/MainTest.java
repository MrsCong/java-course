package com.wzc.javase.about.desginModel.observerModel;

/**
 * 观察者模式定义：定义对象间一种一对多的依赖关系，使得每当一个对象改变状态，则所有依赖于它的对象都会得到通知并被自动更新
 *
 * @author 吴智聪
 * @version 1.0
 * @date 2022/3/10 16:06
 */
public class MainTest {

    public static void main(String[] args) {
        Subject subject = new SubjectImpl();
        subject.addObserver(new ObserverOne());
        subject.addObserver(new ObserverTwo());
        subject.operate();
    }
}
