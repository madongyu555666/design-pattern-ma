package com.design.pattern.dependencyinversionprinciple;

/**
 * @author madongyu
 * @projectName design-pattern-ma
 * @description: TODO
 * @date 2019/6/1718:47
 */
public class Test {

    public static void main(String[] args) {
        Ma ma = new Ma();
        ma.setCurriculum(new JavaCurriculum());
        ma.study();

        ma.setCurriculum(new PythonCurriculum());
        ma.study();

        ma.setCurriculum(new BigData());
        ma.study();
    }
}
