package com.ay.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/*
* RunWith 参数化运行器,用于指定Junit运行环境,是Junit提供的接口拓展,
* Spring提供了SpringJUnit4ClassRunner
*  */

/**
 * 测试基类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class BaseJunit4Test {
}
