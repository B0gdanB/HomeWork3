package com.home.mappers;

import com.home.entity.Goods;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Администратор on 18.09.2017.
 */
public class GoodsMapper implements RowMapper<Goods> {

    @Override
    public Goods mapRow(ResultSet resultSet, int i) throws SQLException {
        Goods user = new Goods();
        user.setId(resultSet.getInt("id"));
        user.setName(resultSet.getString("name"));
        user.setPrice(resultSet.getDouble("price"));
        user.setMerchant(resultSet.getString("merchant"));
        return user;
    }
}
