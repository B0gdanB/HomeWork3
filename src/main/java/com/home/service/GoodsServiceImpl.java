package com.home.service;

import com.home.dao.GoodsDao;
import com.home.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Администратор on 15.09.2017.
 */
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public Goods getById(int id) {
        return goodsDao.getGoodsById(id);
    }

}
