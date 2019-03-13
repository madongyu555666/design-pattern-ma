package com.design.pattern.staticproxyinstance;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 数据源的代理
 */
public class DataSourceServiceStaticProxy implements  IDataSourceService{
    private IDataSourceService iDataSourceService;
    public DataSourceServiceStaticProxy(IDataSourceService iDataSourceService){
         this.iDataSourceService=iDataSourceService;
    }
    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");



    @Override
    public int createOrder(DataSource dataSource) {
        before();
        Long time = dataSource.getCreateTime();
        Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
        System.out.println("静态代理类自动分配到【DB_" + dbRouter + "】数据源处理数据。");
        DynamicDataSourceEntry.set(dbRouter);
        iDataSourceService.createOrder(dataSource);
        after();
        return 0;
    }

    private void before(){
        System.out.println("代理前的增强");
    }
    private void after(){
        System.out.println("代理后的增强");
    }


}
