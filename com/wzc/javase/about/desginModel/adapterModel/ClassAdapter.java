package com.wzc.javase.about.desginModel.adapterModel;

/**
 * 类描述: 设配器角色(类适配  使用的是继承)
 *
 * @author 吴智聪
 * @version 1.0
 * @date 2022/3/10 15:34
 */
public class ClassAdapter extends Adaptee implements TargetInterFace{

    /**
    * 功能描述: 通过类适配的操作，通过修改具体适配的内容就可完成 源功能和目标功能的适配
    *
    * @param
    * @return void
    * @author 吴智聪
    * @date 2022/3/10 15:36
    */
    @Override
    public void hello() {
        super.greet();
    }

    @Override
    public void world() {

    }
}
