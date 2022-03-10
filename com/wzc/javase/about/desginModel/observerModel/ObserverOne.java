package com.wzc.javase.about.desginModel.observerModel;

/**
 * 类描述:
 *
 * @author 吴智聪
 * @version 1.0
 * @date 2022/3/10 16:05
 */
public class ObserverOne implements Observer {
    @Override
    public void update() {
        System.out.println("update one");
    }
}
