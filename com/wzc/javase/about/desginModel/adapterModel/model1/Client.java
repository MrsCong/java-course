package com.wzc.javase.about.desginModel.adapterModel.model1;

/**
 * 类描述:
 *
 * @author 吴智聪
 * @version 1.0
 * @date 2023/6/5 19:27
 */
public class Client {

    public static void main(String[] args) {
        String hex = "xxx";
        //计算hex对应的type
        MsgAdapter adapter = new MsgAdapter(RuleType.getRuleByType(2));
        System.out.println(adapter.parse(hex));
    }
}