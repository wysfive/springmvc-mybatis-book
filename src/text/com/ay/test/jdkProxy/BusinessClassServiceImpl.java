package com.ay.test.jdkProxy;

import java.util.concurrent.TimeUnit;

/**
 * 业务实现类
 */
public class BusinessClassServiceImpl implements BusinessClassService{
    /**
     * 处理业务
     */
    @Override
    public void doSomeThing() throws InterruptedException {
        // Thread.sleep(TimeUnit.SECONDS, 1);
        TimeUnit.SECONDS.sleep(1L);
        System.out.println("do something...");
    }
}
