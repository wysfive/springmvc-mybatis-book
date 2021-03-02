package com.ay.test.jdkProxy;

import java.lang.reflect.Method;

/**
 * 日志类接口
 */
public interface MyLogger {
    /**
     * 记录进入方法的时间
     */
    void saveIntoMethodTime(Method method);

    /**
     * 记录退出方法的时间
     */
    void saveOutMethodTime(Method method);
}
