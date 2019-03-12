package com.design.pattern.singleton.doublecheck;

import com.design.pattern.singleton.ExectorThread;

public class LazyDoubleCheckSingletonTest {
    public static void main(String[] args) {
        Thread thread1=new Thread(new ExectorThread());
        Thread thread2=new Thread(new ExectorThread());
        thread1.start();
        thread2.start();
        System.out.println("双重检查锁结束");
    }
}
