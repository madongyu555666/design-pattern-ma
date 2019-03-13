package com.design.pattern.staticproxyinstance;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        try {
            DataSource dataSource = new DataSource();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2019/02/01");
            dataSource.setCreateTime(date.getTime());
            IDataSourceService iDataSourceService = new DataSourceServiceStaticProxy(new DataSourceService());
            iDataSourceService.createOrder(dataSource);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
