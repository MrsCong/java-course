package com.wzc.javase.about.desginModel.commandModel;

/**
 *
 * @author 吴智聪
 * @version 1.0
 * @date 2023/6/5 17:33
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void action() {
        this.command.execute();
    }

}