package com.ay.test.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 日志类Handler
 */
public class MyLoggerHandler implements InvocationHandler {
    // 原始对象
    private Object objOriginal;
    // 创建一个对象类实现
    private MyLogger myLogger = new  MyLoggerImpl();

    public MyLoggerHandler(Object obj) {
        super();
        this.objOriginal = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        // 日志类的方法,保存进入方法的时间
        myLogger.saveIntoMethodTime(method);
        // 调用代理类方法
        result = method.invoke(this.objOriginal, args);
        // 日志类的方法,保存退出方法的时间
        myLogger.saveOutMethodTime(method);
        return result;
    }
}
