package com.design.pattern.template.demo;

public class ProjectFlowTest {

    public static void main(String[] args) {
        OnlineRetailers onlineRetailers=new OnlineRetailers(true);
        onlineRetailers.createTechnologicalProcess();

        Finance finance=new Finance();
        finance.createTechnologicalProcess();
    }
}
