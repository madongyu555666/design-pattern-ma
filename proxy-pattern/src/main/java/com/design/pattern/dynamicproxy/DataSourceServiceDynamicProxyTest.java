package com.design.pattern.dynamicproxy;

import com.design.pattern.staticproxyinstance.DataSource;
import com.design.pattern.staticproxyinstance.DataSourceService;
import com.design.pattern.staticproxyinstance.IDataSourceService;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataSourceServiceDynamicProxyTest {
    public static void main(String[] args) {
        try {
            DataSource dataSource = new DataSource();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2019/05/01");
            dataSource.setCreateTime(date.getTime());
            IDataSourceService iDataSourceService = (IDataSourceService)new DataSourceServiceDynamicProxy().getInstance(new
                    DataSourceService());
            iDataSourceService.createOrder(dataSource);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
