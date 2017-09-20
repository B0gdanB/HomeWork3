package com.home.service;

import com.home.entity.Goods;

import java.util.List;

/**
 * Created by Администратор on 15.09.2017.
 */
public interface GoodsService {

    Goods getById(int id);

    List<Goods> getAll();

    void save(Goods user);

}
