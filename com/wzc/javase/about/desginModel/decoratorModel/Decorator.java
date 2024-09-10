package com.wzc.javase.about.desginModel.decoratorModel;

/**
 * 类描述:
 *
 * @author 吴智聪
 * @version 1.0
 * @date 2023/6/5 18:16
 */
public abstract class Decorator implements Component {
    private Component component = null;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        this.component.operate();
    }

}