package com.wzc.javase.about.desginModel.adapterModel.model1;

public enum RuleType {

    RULE1(1,new Rule1Parse()),
    RULE2(2,new Rule2Parse())
    ;


    private Integer type;

    private ProParse proParse;

    RuleType(Integer type, ProParse proParse) {
        this.type = type;
        this.proParse = proParse;
    }

    public static ProParse getRuleByType(Integer type) {
        for (RuleType ruleType : RuleType.values()) {
            if (type.equals(ruleType.type)) {
                return ruleType.proParse;
            }
        }
        return null;
    }
}
