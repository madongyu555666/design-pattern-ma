package com.design.pattern.staticproxyinstance;

public class DataSourceDao {
    public int insert(DataSource dataSource){
        System.out.println("DataSourceDao 创建DataSource成功!");
        return 1;
    }
}
