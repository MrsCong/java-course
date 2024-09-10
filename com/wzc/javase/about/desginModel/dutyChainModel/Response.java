package com.wzc.javase.about.desginModel.dutyChainModel;

/**
 * 类描述:
 *
 * @author 吴智聪
 * @version 1.0
 * @date 2023/6/5 17:48
 */
public class Response {

    private String msg;

    public Response(String msg) {
        this.msg = msg;
    }

    public void rep() {
        System.out.println(this.msg);
    }

}