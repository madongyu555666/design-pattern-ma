package com.design.pattern.singleton.lazy;

import com.design.pattern.singleton.ExectorThread;

/**
 * 懒汉式测试类
 */
public class LazySimpleSingletonTest {
    public static void main(String[] args) {
        Thread thread1=new Thread(new ExectorThread());
        Thread thread2=new Thread(new ExectorThread());
        thread1.start();
        thread2.start();
        System.out.println("结束");
    }
}
