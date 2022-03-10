package com.wzc.javase.about.desginModel.strategyModel;

/**
 * 类描述:
 *
 * @author 吴智聪
 * @version 1.0
 * @date 2022/3/10 15:54
 */
public class CommonContext {

    private CommonOperate commonOperate;

    public CommonContext(CommonOperate commonOperate) {
        this.commonOperate = commonOperate;
    }

    public CommonOperate getCommonOperate() {
        return this.commonOperate;
    }

    public void setCommonOperate(CommonOperate commonOperate) {
        this.commonOperate = commonOperate;
    }

    public void invokeCommonOperate() {
        this.commonOperate.operate();
    }

}
