package com.design.pattern.openingandclosing;

/**
 * @author madongyu
 * @projectName design-pattern-ma
 * @description: TODO
 * @date 2019/6/1718:03
 */
public class JavaCurriculumCourse extends JavaCurriculum  {

    public JavaCurriculumCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }
    /**
     * 新加的方法
     * @return
     */
    public Double getOriginPrice(){
        return super.getPrice();
    }
    @Override
    public Double getPrice(){
        return super.getPrice() * 0.5;
    }
}
