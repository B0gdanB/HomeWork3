package com.home.controller;

import com.home.dao.GoodsDao;
import com.home.entity.Goods;
import com.home.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Администратор on 20.09.2017.
 */
@Controller
@RequestMapping("/")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private GoodsDao goodsDao;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/goods/{id}")
    public String getGoodsById(@PathVariable("id") int id, Model model) {
        model.addAttribute("goods", goodsService.getById(id));
        return "showGoods";
    }

    @GetMapping("/allGoods")
    public String getAllGoods(Model model) {
        model.addAttribute("allGoods", goodsService.getAll());
        return "goodsList";
    }

    @PostMapping("/newGoods")
    public String createGoods(@ModelAttribute Goods goods) {
        goodsService.save(goods);
        return "redirect:allGoods";
    }
    @RequestMapping("/deleteGoods")
    public String deleteGoods(@PathVariable ("id") int id) {
        goodsDao.delete(id);
        return "redirect:allGoods";
    }

    /*@RequestMapping(value = "/deleteGoods", method = RequestMethod.DELETE)
    public String deleteGoods(@PathVariable String name) {
        goodsDao.delete(name);
        return "redirect:allGoods";
    }*/

}
