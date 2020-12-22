package com.example.shop.bean;

import com.example.shop.R;

import java.util.ArrayList;

public class GoodsInfo {

    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "huaweip40", "huaweip40pro+", "freebuds", "v65i", "matepad ", "matebook","freebuds3","watch"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "HUAWEI P40 Pro 5G 全网通 8GB+256GB（亮黑色）",
            "HUAWEI P40 Pro+ 5G 全网通 8GB+256GB（陶瓷白）",
            "HUAWEI FreeBuds Pro 真无线耳机 无线充版（陶瓷白）",
            "华为智慧屏 V65i（星际黑）65英寸 4K超高清全面屏 多方视频通话 AI升降式摄像头 ",
            "HUAWEI MatePad 5G 10.4英寸 6GB+128GB 5G全网通版 Wi-Fi 6+ 2K全面屏",
            "HUAWEI MateBook X Pro 2020款 独显 i7 16G 512G（翡冷翠）13.9英寸",
            "HUAWEI FreeBuds 3 无线耳机（蜜语红）",
            "UAWEI WATCH GT 2 运动款 曜石黑（46mm）华为智能手表 麒麟A1芯片 "
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {6488,7988,1149,5999,3199,9988,949,1388};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.huaweip40_s,R.drawable.huaweip40pro_s,R.drawable.freebuds_s,
            R.drawable.v65i_s,R.drawable.matepad_s,R.drawable.matebook_s,
            R.drawable.huawei_s,R.drawable.watch_s

    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.huaweip40,R.drawable.huaweip40pro,R.drawable.freebuds,
            R.drawable.v65i,R.drawable.matepad,R.drawable.matebook,
            R.drawable.huawei,R.drawable.watch

    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}

