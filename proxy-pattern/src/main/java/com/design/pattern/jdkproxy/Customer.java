package com.design.pattern.jdkproxy;

import com.design.pattern.staticproxy.Person;

public class Customer implements Person {
    public void findLove(){
        System.out.println("高富帅");
    }
}
