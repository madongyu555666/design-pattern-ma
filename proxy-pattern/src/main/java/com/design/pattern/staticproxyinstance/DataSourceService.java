package com.design.pattern.staticproxyinstance;

public class DataSourceService implements IDataSourceService {
    private DataSourceDao dataSourceDao;
    public DataSourceService(){
        dataSourceDao = new DataSourceDao();
    }
    @Override
    public int createOrder(DataSource dataSource) {
        System.out.println("DataSourceService 调用DataSourceDao 创建订单");
        return dataSourceDao.insert(dataSource);
    }
}
