package com.design.pattern.dependencyinversionprinciple;


/**
 * @author madongyu
 * @projectName design-pattern-ma
 * @description: TODO
 * @date 2019/6/1717:59
 */
public class JavaCurriculum implements Curriculum {
    @Override
    public void study() {
        System.out.println("马同学在学习 Java 课程");
    }
}
