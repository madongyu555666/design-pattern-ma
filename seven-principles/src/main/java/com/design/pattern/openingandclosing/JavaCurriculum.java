package com.design.pattern.openingandclosing;

/**
 * @author madongyu
 * @projectName design-pattern-ma
 * @description: TODO
 * @date 2019/6/1717:59
 */
public class JavaCurriculum implements Curriculum {

    private Integer Id;
    private String name;
    private Double price;


    public JavaCurriculum(Integer id, String name, Double price) {
        Id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return this.Id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
