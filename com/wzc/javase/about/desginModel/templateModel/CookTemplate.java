package com.wzc.javase.about.desginModel.templateModel;

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
