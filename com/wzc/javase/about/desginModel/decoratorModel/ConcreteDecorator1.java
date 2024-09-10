package com.wzc.javase.about.desginModel.decoratorModel;

/**
 * 类描述:
 *
 * @author 吴智聪
 * @version 1.0
 * @date 2023/6/5 18:19
 */
public class ConcreteDecorator1 extends Decorator{

    public ConcreteDecorator1(Component component) {
        super(component);
    }

    public void operateBefore() {
        System.out.println("operate before...");
    }

    @Override
    public void operate() {
        operateBefore();
        super.operate();
    }
}