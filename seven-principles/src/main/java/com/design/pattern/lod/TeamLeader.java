package com.design.pattern.lod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author madongyu
 * @projectName design-pattern-ma
 * @description: TODO
 * @date 2019/6/1816:21
 */
public class TeamLeader {
    /*public void checkNumberOfCourses(List<Curriculum> courseList){
        System.out.println("目前已发布的课程数量是："+courseList.size());
    }*/

    public void checkNumberOfCourses(){
        List<Curriculum> courseList = new ArrayList<Curriculum>();
        for(int i = 0 ;i < 20;i++){
            courseList.add(new Curriculum());
        }
        System.out.println("目前已发布的课程数量是："+courseList.size());
    }
}
