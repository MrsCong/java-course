package com.wzc.javase.about.desginModel.decoratorModel;

/**
 * 类描述:
 *
 * @author 吴智聪
 * @version 1.0
 * @date 2023/6/5 18:15
 */
public class ConcreteComponent implements Component{

    @Override
    public void operate() {
        System.out.println("doSomeTing1...");
    }
}