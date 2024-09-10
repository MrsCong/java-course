package com.wzc.javase.about.desginModel.adapterModel.model1;

/**
 * 类描述:
 *
 * @author 吴智聪
 * @version 1.0
 * @date 2023/6/5 19:24
 */
public class Rule2Parse implements ProParse{

    @Override
    public String parse(String hex) {
        System.out.println("do parse hex:"+hex);
        return "rule2 parse";
    }
}