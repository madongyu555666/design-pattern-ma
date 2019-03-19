package com.design.pattern.template.demo;


/**
 * 大概项目流程
 */
public abstract class ProjectFlow {


    /**
     *
     */
    protected final void createTechnologicalProcess(){

        //1.市场需求调研
        marketDemandInvestigation();
        //2.讨论，编写需求文档
        discussAndDocumentRequirements();
        //3.开发
        if(whether()){
            development();
            //4.测试上线
            testOnLine();
        }
        

    }

    private void testOnLine() {
        System.out.println("测试上线");
    }

    private void discussAndDocumentRequirements() {
        System.out.println("讨论，编写需求文档");
    }

    private void marketDemandInvestigation() {
        System.out.println("市场调研");
    }

    protected abstract void development();

    protected boolean whether() {
        return false;
    }


}
