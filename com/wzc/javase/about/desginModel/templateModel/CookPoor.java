package com.wzc.javase.about.desginModel.templateModel;

public class CookPoor extends CookTemplate{
    @Override
    public void cookBefore() {
        System.out.println("喜喜豬肉");
    }

    @Override
    public void cookIng() {
        System.out.println("燒烤豬肉");
    }

    @Override
    public void cookAfter() {
        System.out.println("上菜端盘");
    }
}
