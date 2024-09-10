package com.wzc.javase.about.desginModel.adapterModel;

/**
 * 适配器模式定义:将一个类的接口变换成客户端所期待的另一种接口，从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作
 *
 * @author 吴智聪
 * @version 1.0
 * @date 2022/3/10 15:31
 */
public class Client {

    public static void main(String[] args) {
        //1.通过集成需适配的类的方式进行适配
        TargetInterFace targetInterFace = new ClassAdapter();
        targetInterFace.hello();
        //2.通过将需适配的类初始化给适配类的成员变量
        TargetInterFace objAdapter = new ObjAdapter(new Adaptee());
        objAdapter.hello();
    }

}
