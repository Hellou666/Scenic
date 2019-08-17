package com.qianfeng.scenic.controller;

import com.qianfeng.scenic.service.ScenicAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScenicAreaController {

    @Autowired
    ScenicAreaService scenicAreaService;

    /**
     * 获取所有景区的信息
     * @return
     */
    @RequestMapping("getAllScenicArea")
    public Object getAllScenicArea(){
        return scenicAreaService.getAllScenicArea();
    }
}
