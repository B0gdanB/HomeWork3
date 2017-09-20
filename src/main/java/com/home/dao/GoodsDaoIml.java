package com.home.dao;

import com.home.entity.Goods;
import com.home.mappers.GoodsMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Администратор on 15.09.2017.
 */
public class GoodsDaoIml implements GoodsDao {

    private JdbcTemplate jdbcTemplate;

    public GoodsDaoIml(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void save(Goods goods) {
        String sql = "INSERT INTO goods(name, price, merchant) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, goods.getName(), goods.getPrice(), goods.getMerchant());

    }

    @Override
    public Goods getGoodsById(int id) {
        String sql = "SELECT * FROM goods WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new GoodsMapper(), id);
    }

    @Override
    public Goods update(Goods newGods) {
        String sql = "UPDATE goods SET name=?, email=?, age=? WHERE id=?";
        int update = jdbcTemplate.update(sql, newGods.getName(), newGods.getPrice(), newGods.getMerchant(), newGods.getId());
        System.out.println("return + " + update);
        return null;
    }

    @Override
    public List<Goods> getAll() {
        String sql = "SELECT * FROM goods";
        return jdbcTemplate.query(sql, new GoodsMapper());
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM goods WHERE id=?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public void delete(String name) {
        String sql = "DELETE FROM goods WHERE name=?";
        jdbcTemplate.update(sql, name);
    }
}
