package com.wzc.javase.about.desginModel.strategyModel;

/**
 * 策略模式定义:定义一组算法，将每个算法都封装起来，并且使它们之间可以互换
 *
 * @author 吴智聪
 * @version 1.0
 * @date 2022/3/10 15:56
 */
public class MainTest {

    public static void main(String[] args) {
        CommonContext context = new CommonContext(new Person());
        context.invokeCommonOperate();
        context.setCommonOperate(new Fish());
        context.invokeCommonOperate();
        context.setCommonOperate(new Trigger());
        context.invokeCommonOperate();
    }
}
