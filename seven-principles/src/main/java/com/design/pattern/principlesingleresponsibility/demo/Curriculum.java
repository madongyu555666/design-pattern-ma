package com.design.pattern.principlesingleresponsibility.demo;

/**
 * @author madongyu
 * @projectName design-pattern-ma
 * @description: TODO
 * @date 2019/6/1815:45
 */
public interface Curriculum {


    //获得基本信息
    String getCourseName();
    //获得视频流
    byte[] getCourseVideo();
    //学习课程
    void studyCourse();
    //退款
    void refundCourse();
}
