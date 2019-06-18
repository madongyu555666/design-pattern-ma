package com.design.pattern.lod;

import java.util.ArrayList;
import java.util.List;

/**
 * @author madongyu
 * @projectName design-pattern-ma
 * @description: TODO
 * @date 2019/6/1816:22
 */
public class Boss {
    /*public void commandCheckNumber(TeamLeader teamLeader){
       //模拟 Boss 一页一页往下翻页，TeamLeader 实时统计
        List<Curriculum> courseList = new ArrayList<Curriculum>();
        for (int i= 0; i < 20 ;i ++){
            courseList.add(new Curriculum());
        }
        teamLeader.checkNumberOfCourses(courseList);
    }*/
    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourses();
    }


    /*public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }*/
}
