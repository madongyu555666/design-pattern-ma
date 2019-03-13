package com.design.pattern.staticproxy;

/**
 * 静态代理测试
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        HisAgent  h= new HisAgent(new His());
        h.findLove();
    }
}
