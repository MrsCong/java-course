package com.wzc.javase.about.desginModel.strategyModel;

/**
 * 类描述:
 *
 * @author 吴智聪
 * @version 1.0
 * @date 2022/3/10 15:49
 */
public class Person implements CommonOperate{
    @Override
    public void operate() {
        System.out.println("人类会走路");
    }
}
