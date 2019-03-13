package com.design.pattern.cglib;

import net.sf.cglib.core.DebuggingClassWriter;

public class CglibTest {
    public static void main(String[] args) {
        try {
            //利用cglib 的代理类可以将内存中的class 文件写入本地磁盘
            System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,
                    "D://cglib_proxy_class/");
            Customer obj = (Customer)new CglibMeipo().getInstance(Customer.class);
            obj.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
