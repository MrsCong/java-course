package com.wzc.javase.about.desginModel.adapterModel;

/**
 * 类描述:
 *
 * @author 吴智聪
 * @version 1.0
 * @date 2022/3/10 15:31
 */
public class Client {

    public static void main(String[] args) {
        TargetInterFace targetInterFace = new ClassAdapter();
        targetInterFace.hello();
        TargetInterFace targetInterFace1 = new ObjAdapter(new Adaptee());
        targetInterFace.hello();
    }

}
