package com.qianfeng.scenic.service.Impl;

import com.qianfeng.scenic.dao.ScenicAreaMapper;
import com.qianfeng.scenic.pojo.ScenicArea;
import com.qianfeng.scenic.service.ScenicAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScenicAreaServiceImpl implements ScenicAreaService {

    @Autowired
    ScenicAreaMapper scenicAreaMapper;

    /**
     * 获取所有景区信息
     * @return 景区信息
     */
    public List<ScenicArea> getAllScenicArea() {

        return scenicAreaMapper.getAllScenicArea();
    }
}
