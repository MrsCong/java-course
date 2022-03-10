package com.wzc.javase.about.desginModel.adapterModel;

/**
 * 类描述:
 *
 * @author 吴智聪
 * @version 1.0
 * @date 2022/3/10 15:39
 */
public class ObjAdapter implements TargetInterFace {

    private Adaptee adaptee;

    public ObjAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void hello() {
        adaptee.greet();
    }

    @Override
    public void world() {
        adaptee.world();
    }
}
