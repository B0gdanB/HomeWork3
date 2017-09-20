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


    @GetMapping("/goods/{id}")
    public String getGoods(@PathVariable("id") int id, Model model) {
        Goods goodsById = goodsService.getById(id);
        model.addAttribute("goods", goodsById);
        return "goods";
    }

    @GetMapping("/goods")
    public String showAllGoods(Model model) {
        model.addAttribute("goods", goodsService.getAll());
        return "goodsList.ftl";
    }

    @GetMapping("/goods")
    public String addGoods(@RequestParam("name") String name, @RequestParam("merchant") String merchant) {
        Goods goods = new Goods();
        goods.setName(name);
        goods.setMerchant(merchant);
        goodsService.save(goods);
        return "redirect:goods";
    }

    @PostMapping("/newGoods")
    public String newGoods(@ModelAttribute Goods goods) {
        goodsService.save(goods);
        return "redirect:newGoods";
    }

}
