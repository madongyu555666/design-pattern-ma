package com.design.pattern.staticproxy;

public class HisAgent {
    private Person person;
    public HisAgent(Person person){
        this.person=person;
    }

    //目标对象的引用给拿到
    public void findLove(){
        System.out.println("代他看");
        this.person.findLove();
        System.out.println("确立关系");
    }

}
