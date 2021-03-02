package com.ay.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * ClassPathXmlApplicationContext 从类路径ClassPath中查找指定的xml配置文件,找到并装载ApplicationContext的工作
 * FileSystemXmlApplicationContext 从文件系统中的文件来查找指定的xml配置文件,找到并装载ApplicationContext的工作
 * XmlWebApplicationContext 从Web应用中寻找指定的xml配置文件,找到并装载ApplicationContext的工作
 */
@Service
public class SpringTest {

    @Test
    public void testSpring(){
        /**
         * ClassPathXmlApplicationContext 从类路径ClassPath中查找指定的xml配置文件,找到并装载ApplicationContext的工作
         * FileSystemXmlApplicationContext 从文件系统中的文件来查找指定的xml配置文件,找到并装载ApplicationContext的工作
         * XmlWebApplicationContext 从Web应用中寻找指定的xml配置文件,找到并装载ApplicationContext的工作
         *
         * 装载一个配置文件实例化ApplicationContext容器
         * ClassPathXmlApplicationContext applicationContext =
         *                 new ClassPathXmlApplicationContext("applicationContext.xml");
         * 装载多个配置文件实例化ApplicationContext容器
         * String[] configs = {"bean1.xml", "bean2.xml", "bean3.xml"};
         * ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext(configs);
         *
         * 装载一个配置文件实例化ApplicationContext容器
         * ApplicationContext fileApplicationContext = new FileSystemXmlApplicationContext("bean.xml");
         * 装载多个配置文件实例化ApplicationContext容器
         * String[] configs = {"c:/bean1.xml", "c:/bean2.xml"};
         *         ApplicationContext fileApplicationContext2 = new FileSystemXmlApplicationContext(configs);
         */
        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取SpringTest类 注意这里的spring为小写的
        SpringTest springTest = (SpringTest) applicationContext.getBean("springTest");
        // 调用sayHello
        springTest.sayHello();

    }

    private void sayHello() {
        System.out.println("hello world");
    }
}
