package com.qianfeng.scenic.pojo;

import lombok.Data;

@Data
public class ScenicArea {
    int scenicAreaId;
    //景区名字
    String scenicAreaName;
    //景区介绍
    String areaInfo;
    //景区图片
    String areaIcon;
    //开放时间
    String openingTime;
    //景区电话
    String areaTel;
    //景区位置
    String areaLocation;
    //景区等级（几A级）
    String areaLevel;
    //景区评分（5分制）
    Double areaGrade;
    //景区攻略
    String areaStrategy;


}
