package com.wzc.javase.about.desginModel.dutyChainModel;

/**
 * 类描述:
 *
 * @author 吴智聪
 * @version 1.0
 * @date 2023/6/5 17:45
 */
public abstract class Handler {

    private Handler nextHandler;

    public Response handlerMsg(Request request) {
        if (getLevel().equals(request.getLevel())) {
            return doSomeThing();
        } else {
            if (this.nextHandler != null) {
                return this.nextHandler.handlerMsg(request);
            }
        }
        return null;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract Integer getLevel();

    public abstract Response doSomeThing();
}