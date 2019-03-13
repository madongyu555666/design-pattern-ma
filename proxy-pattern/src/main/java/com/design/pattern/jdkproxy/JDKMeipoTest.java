package com.design.pattern.jdkproxy;

import com.design.pattern.staticproxy.Person;

public class JDKMeipoTest {
    public static void main(String[] args) {
        Person instance = (Person) new JDKMeipo().getInstance(new Customer());
        instance.findLove();
    }
}
