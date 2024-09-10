package com.wzc.javase.about.desginModel.dutyChainModel;

/**
 * 责任链模式定义：使多个对象都有机会处理请求，从而避免了请求的发送者和接受者之间的耦合关系。将这些对象连成一条链，并沿着这条链传递该请求，直到有
 * 对象处理它为止。
 *
 * @author 吴智聪
 * @version 1.0
 * @date 2023/6/5 17:54
 */
public class Client {

    public static void main(String[] args) {
        Handler handler1 = new HandlerSon1();
        Handler handler2 = new HandlerSon2();
        handler1.setNextHandler(handler2);
        Request request1 = new Request(1);
        Request request2 = new Request(2);
        handler1.handlerMsg(request1).rep();
        handler1.handlerMsg(request2).rep();
    }

}