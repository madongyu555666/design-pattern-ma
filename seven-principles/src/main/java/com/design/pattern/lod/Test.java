package com.design.pattern.lod;

/**
 * @author madongyu
 * @projectName design-pattern-ma
 * @description: TODO
 * @date 2019/6/1817:01
 */
public class Test {

    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
