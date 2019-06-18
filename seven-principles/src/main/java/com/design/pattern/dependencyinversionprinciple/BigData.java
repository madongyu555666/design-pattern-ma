package com.design.pattern.dependencyinversionprinciple;

/**
 * @author madongyu
 * @projectName design-pattern-ma
 * @description: TODO
 * @date 2019/6/1718:48
 */
public class BigData implements Curriculum {
    @Override
    public void study() {
        System.out.println("马同学在学习 大数据 课程");
    }
}