package com.wzc.javase.about.desginModel.strategyModel;

/**
 * 类描述:
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
