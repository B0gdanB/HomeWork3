package com.home.controller;

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

}
