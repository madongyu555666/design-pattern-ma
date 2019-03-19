package com.design.pattern.template.demo;

public class OnlineRetailers extends ProjectFlow {

    private  boolean judge;

    public  OnlineRetailers(boolean judge){
       this.judge=judge;
    }
    @Override
    protected void development() {
        System.out.println("开发电商项目");
    }

    @Override
    protected boolean whether() {
        return this.judge;
    }
}
