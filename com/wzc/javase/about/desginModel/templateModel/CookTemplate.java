package com.wzc.javase.about.desginModel.templateModel;

/**
 * 模板方法模式定义:
 * 定义一个操作中的算法的框架，而将一些步骤延迟到子类中。使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤
 */
public abstract class CookTemplate {

    public abstract void cookBefore();

    public abstract void cookIng();

    public abstract void cookAfter();


    public void cook() {
        this.cookBefore();
        this.cookIng();
        this.cookAfter();
    }

}
