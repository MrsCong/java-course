package com.wzc.javase.about.desginModel.adapterModel.model1;

/**
 * 类描述:
 *
 * @author 吴智聪
 * @version 1.0
 * @date 2023/6/5 19:25
 */
public class MsgAdapter implements ProParse{

    private ProParse proParse;

    public MsgAdapter(ProParse proParse) {
        this.proParse = proParse;
    }

    @Override
    public String parse(String hex) {
        return proParse.parse(hex);
    }
}