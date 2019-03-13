package com.design.pattern.highsimulationproxy;

import com.design.pattern.jdkproxy.Customer;
import com.design.pattern.jdkproxy.JDKMeipo;
import com.design.pattern.staticproxy.Person;

public class GPTest {
    public static void main(String[] args) {
        Person instance = (Person) new GPMeipo().getInstance(new Customer());
        System.out.println(instance.getClass());
        instance.findLove();
    }
}
