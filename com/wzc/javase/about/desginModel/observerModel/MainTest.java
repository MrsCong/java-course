package com.wzc.javase.about.desginModel.observerModel;

/**
 * 类描述:
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
