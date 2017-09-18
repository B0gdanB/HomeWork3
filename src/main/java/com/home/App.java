package com.home;

import com.home.config.SpringConfig;
import com.home.dao.GoodsDao;
import com.home.dao.GoodsDaoIml;
import com.home.entity.Goods;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        GoodsDao goodsDao = context.getBean(GoodsDaoIml.class);
        Goods goods = new Goods();
        goods.setName("Sergey Ivanov");
        goods.setMerchant("eBay");
        goods.setPrice(123.42);
        goodsDao.save(goods);




    }
}
