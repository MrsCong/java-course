package com.wzc.javase.about.desginModel.commandModel;

/**
 * 命令模式定义：将一个请求封装成一个对象，从而让你使用不同的请求把客户端参数化，对请求排队或者记录请求日志，可以提供命令的撤销和恢复功能
 *
 * @author 吴智聪
 * @version 1.0
 * @date 2023/6/5 17:32
 */
public class Client {

    public static void main(String[] args) {
        Receiver receiver = new Receiver1();
        Command command = new CommandImpl1(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.action();
    }

}