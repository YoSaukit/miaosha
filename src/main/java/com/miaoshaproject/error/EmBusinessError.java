package com.miaoshaproject.error;

public enum EmBusinessError implements CommonError{
    //通过错误类型00001
    PARAMETER_VALIDATION_ERROR(00001,"参数不合法"),
    UNKNOWN_ERROR(00002,"未知错误"),

    //10000开头为用户信息相关错误定义
    USER_NOT_EXIST(10001,"用户不存在")
    ;

    private EmBusinessError(int errCode, String errMsg){
        this.errMsg = errMsg;
        this.errCode = errCode;
    }
    //java的枚举可以有全员变量的属性,本质上是一个面向对象的类
    private int errCode;
    private String errMsg;
    @Override
    public int getErrCode() {
        return this.errCode;
    }

    @Override
    public String getErrMsg() {
        return this.errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
}
