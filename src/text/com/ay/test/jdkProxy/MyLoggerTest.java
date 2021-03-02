package com.ay.test.jdkProxy;

import java.lang.reflect.Proxy;


/*
    Proxy.newProxyInstance(ClassLoader loader,Class<?>[] interfaces,reflect.InvocationHandler h),
    放回代理类的一个实例,返回后的代理可以当成代理类使用
    ClassLoader loader 类加载器,service.getClass().getClassLoader() 通过这个字节码对象可以获取到该类的类加载器
    Class<?>[] interfaces 接口信息,service.getClass().getInterfaces() 通过这个字节码对象可以获取到该类的所有的实现接口
    InvocationHandler h handler对象, 通过这个代理类可以给方法增强
 */
/**
 * 测试类
 */
public class MyLoggerTest {

    public static void main(String[] args) throws Exception{
        // 实例化真实项目中业务类
        BusinessClassService service = new BusinessClassServiceImpl();
        // 日志类的Handler
        MyLoggerHandler myLoggerHandler = new MyLoggerHandler(service);
        // 获得代理类的对象
        BusinessClassService businessClass = (BusinessClassService) Proxy.newProxyInstance(
                service.getClass().getClassLoader(), service.getClass().getInterfaces(), myLoggerHandler);
        // 执行代理类方法
        businessClass.doSomeThing();
    }
}
