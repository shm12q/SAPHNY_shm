package com.example.shm_msi.saphny_shm.Bean;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.List;

/**
 * Created by SHM-MSI on 2018/7/23.
 */

public class HomeEntity implements MultiItemEntity{
    public static final int ITEM1=1;
    public static final int ITEM1_1=11;
    public static final int ITEM2=2;
    public static final int ITEM3=3;
    public static final int ITEM4=4;
    public static final int ITEM5=5;
    public static final int Home2_ITEM1=21;
    public static final int Home2_ITEM2=22;
    public static final int Home2_ITEM3=23;
    private int itemtype;
    private String ITEM2_title;
    private List<Integer> images;

    public HomeEntity(int drawableRes, int itemtype){
        this.itemtype=itemtype;
        this.drawableRes=drawableRes;
    }
    public HomeEntity(int itemtype){
        this.itemtype=itemtype;
    }
    public HomeEntity(int itemtype,String ITEM2_title,List<Integer> images){
        this.itemtype=itemtype;
        this.ITEM2_title=ITEM2_title;
        this.images=images;
    }



        private int drawableRes;



    public int getDrawableRes() {
            return drawableRes;
        }

        public void setDrawableRes(int drawableRes) {
            this.drawableRes = drawableRes;
        }

    @Override
    public int getItemType() {
        return itemtype;
    }

    public String getITEM2_title() {
        return ITEM2_title;
    }

    public List<Integer> getImages() {
        return images;
    }

}
