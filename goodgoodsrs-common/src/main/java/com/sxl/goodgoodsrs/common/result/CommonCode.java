package com.sxl.goodgoodsrs.common.result;

import lombok.ToString;


@ToString
public enum CommonCode implements ResultCode {

    SUCCESS(true, 200, "操作成功！"),
    FAIL(false, 400, "操作失败！"),
    SERVER_ERROR(false, 500, "抱歉，系统繁忙，请稍后重试！"),
    UNAUTHENTICATED(false, 501, "此操作需要登陆系统！"),
    UNAUTHORISE(false, 502, "权限不足，无权操作！");
    //    private static ImmutableMap<Integer, CommonCode> codes ;
    //操作是否成功
    boolean success;
    //操作代码
    int code;
    //提示信息
    String message;

    private CommonCode(boolean success, int code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    @Override
    public boolean success() {
        return success;
    }

    @Override
    public int code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }


}
