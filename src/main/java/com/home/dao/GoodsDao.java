package com.home.dao;

import com.home.entity.Goods;

import java.util.List;

/**
 * Created by Администратор on 15.09.2017.
 */
public interface GoodsDao {

    void save(Goods goods);

    Goods getGoodsById(int id);

    Goods update(Goods newGods);

    List<Goods> getAll();

    void delete(int id);

    void delete(String name);
}
