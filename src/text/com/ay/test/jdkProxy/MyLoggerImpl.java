package com.ay.test.jdkProxy;

import java.lang.reflect.Method;

/**
 * 日志实现类
 */
public class MyLoggerImpl implements MyLogger{
    @Override
    public void saveIntoMethodTime(Method method) {
        System.out.println("进入"+ method.getName() +
                "方法的时间: " + System.currentTimeMillis());
    }

    @Override
    public void saveOutMethodTime(Method method) {
        System.out.println("退出"+ method.getName() +
                "方法的时间: " + System.currentTimeMillis());
    }
}
