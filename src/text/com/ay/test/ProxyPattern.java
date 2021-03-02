package com.ay.test;

/**
 * 客户端类
 */
public class ProxyPattern {
    public static void main(String[] args) {
        // 为每个RealSubject创建代理类Proxy
        Proxy proxy = new Proxy(new RealSubject());
        proxy.operation();
    }
}
/**
 * 抽象主题类
 */
abstract class Subject {
    abstract void operation();
}

/**
 * 具体主题类
 */
class RealSubject extends Subject {
    @Override
    void operation() {
        System.out.println("operation...");
    }
}

/**
 * 代理类
 */
class Proxy extends Subject {

    private Subject subject;

    public Proxy(Subject subject){
        this.subject = subject;
    }
    @Override
    void operation() {
        // 前置处理
        this.preOperation();
        // 具体操作
        subject.operation();
        // 后置处理
        this.postOperation();
    }

    void preOperation(){
        System.out.println("pre operation...");
    }

    void postOperation(){
        System.out.println("post operation");
    }
}

