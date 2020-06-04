package com.cyf.javatest.responsesuit;

public class R {
    public static Result success(String message, Object data) {
        Result Result = new Result();
        Result.success = true;
        Result.message = message;
        Result.data = data;
        return Result;
    }

    public static Result error(String message) {
        Result Result = new Result();
        Result.success = false;
        Result.message = message;
        Result.data = null;
        return Result;
    }

    public static Result exception(String message, Object data) {
        Result Result = new Result();
        Result.success = false;
        Result.message = message;
        Result.data = data;
        return Result;
    }
}
