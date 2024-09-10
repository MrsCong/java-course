package com.wzc.javase.about.desginModel.dutyChainModel;

/**
 * 类描述:
 *
 * @author 吴智聪
 * @version 1.0
 * @date 2023/6/5 17:53
 */
public class HandlerSon1 extends Handler{

    @Override
    public Integer getLevel() {
        return 1;
    }

    @Override
    public Response doSomeThing() {
        return new Response("handler1 处理");
    }
}