package com.wzc.javase.about.desginModel.decoratorModel;

/**
 * 类描述: 装饰者模式定义:动态地给一个对象添加一些额外的职责。就增加功能来说，装饰模式相比生成子类更为灵活。
 *
 * @author 吴智聪
 * @version 1.0
 * @date 2023/6/5 18:20
 */
public class client {

    public static void main(String[] args) {
        Decorator decorator = new ConcreteDecorator1(new ConcreteComponent());
        decorator.operate();
    }

}