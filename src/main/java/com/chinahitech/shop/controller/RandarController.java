package com.chinahitech.shop.controller;

import com.chinahitech.shop.bean.Randar;
import com.chinahitech.shop.mapper.RandarMapper;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RandarController {
    @Autowired
    private RandarMapper randarMapper;

    @GetMapping("/randar")
    public List query(){
        List<Randar> list = randarMapper.find();
        System.out.println(list);
        return list ;
    }

    @PostMapping("/add")
    public String save(@RequestBody  Randar randar){
        int i = randarMapper.insert(randar);
        if (i > 0) {
            return "成功";
        }
        else {
            return "失败";
        }
    }

}
