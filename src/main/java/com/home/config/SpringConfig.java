package com.home.config;

import com.home.dao.GoodsDao;
import com.home.dao.GoodsDaoIml;
import com.home.entity.Goods;
import com.home.service.GoodsService;
import com.home.service.GoodsServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Created by Администратор on 15.09.2017.
 */
@Configuration
public class SpringConfig {

    @Bean
    public GoodsService getGoodsService() {
        return new GoodsServiceImpl();
    }
    @Bean
    public GoodsDao getGoodsDaoIml() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/demo?useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return new GoodsDaoIml(dataSource);
    }

}
