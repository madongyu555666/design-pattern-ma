package com.design.pattern.dependencyinversionprinciple;

/**
 * @author madongyu
 * @projectName design-pattern-ma
 * @description: TODO
 * @date 2019/6/1718:17
 */
public class Ma {

    private Curriculum curriculum;

    /*public Ma(Curriculum curriculum) {
       this.curriculum=curriculum;
    }*/

    public void setCurriculum(Curriculum curriculum) {
        this.curriculum = curriculum;
    }

    public void study(){
        curriculum.study();
    }

   /* public static void main(String[] args) {
        Ma ma = new Ma();
        ma.setCurriculum(new JavaCurriculum());
        ma.study();
    }
*/
   /* public static void main(String[] args) {
        Ma ma = new Ma();
        ma.study(new JavaCurriculum());
        ma.study(new PythonCurriculum());
    }
*/
   /* public void studyJavaCourse(){
        System.out.println("MA在学习 Java 的课程");
    }
    public void studyPythonCourse(){
        System.out.println("MA在学习 Python 的课程");
    }


    public static void main(String[] args) {
        Ma ma = new Ma();
        ma.studyJavaCourse();
        ma.studyPythonCourse();
    }*/
}
