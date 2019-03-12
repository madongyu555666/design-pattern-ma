package com.design.pattern.singleton;

import com.design.pattern.singleton.containersingleton.ContainerSingleton;
import com.design.pattern.singleton.doublecheck.LazyDoubleCheckSingleton;
import com.design.pattern.singleton.threadlocalsingleton.ThreadLocalSingleton;

public class ExectorThread implements Runnable{
    @Override
    public void run() {
       // LazySimpleSingleton singleton = LazySimpleSingleton.getInstance();
       // LazyDoubleCheckSingleton singleton= LazyDoubleCheckSingleton.getInstance();
       // Object object=ContainerSingleton.getBean("com.design.pattern.singleton.containersingleton.Test");
        //System.out.println(Thread.currentThread().getName() + ":" + object.toString());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
    }
}
