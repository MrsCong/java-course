package com.wzc.javase.about.desginModel.commandModel;

/**
 * 类描述:
 *
 * @author 吴智聪
 * @version 1.0
 * @date 2023/6/5 17:28
 */
public class CommandImpl1 implements Command {

    private Receiver receiver;

    public CommandImpl1(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doSomeTing();
    }
}