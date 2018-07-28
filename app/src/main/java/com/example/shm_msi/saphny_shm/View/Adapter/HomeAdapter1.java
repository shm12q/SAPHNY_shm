package com.example.shm_msi.saphny_shm.View.Adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.shm_msi.saphny_shm.Bean.HomeEntity;
import com.example.shm_msi.saphny_shm.R;
import com.example.shm_msi.saphny_shm.Utils.GlideImageLoader;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SHM-MSI on 2018/7/22.
 */

public class HomeAdapter1 extends BaseMultiItemQuickAdapter<HomeEntity,BaseViewHolder>{
    private Context context;
    private List<HomeEntity> list1_1;


    public HomeAdapter1(@Nullable List<HomeEntity> data,Context context,List<HomeEntity> data_1) {
        super(data);
        addItemType(HomeEntity.ITEM1,R.layout.item_home_1_1);
        addItemType(HomeEntity.ITEM2,R.layout.item_home_1_2);
        addItemType(HomeEntity.ITEM3,R.layout.item_home_1_3);
        addItemType(HomeEntity.ITEM4,R.layout.item_home_1_4);
        addItemType(HomeEntity.ITEM5,R.layout.item_home_1_5);


        this.context=context;
        this.list1_1=data_1;
    }



    @Override
    protected void convert(final BaseViewHolder helper, HomeEntity item) {
        switch (helper.getItemViewType()){
            case HomeEntity.ITEM1:
                helper.setImageResource(R.id.image_home1_1,item.getDrawableRes());
                RecyclerView recyclerView=helper.getView(R.id.recyclerview_home_1_1);
                recyclerView.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
                //recyclerView.setHasFixedSize(true);
                recyclerView.setAdapter(new HomeAdapter1_1(R.layout.item_home_1_1_1,list1_1));
                break;
            case HomeEntity.ITEM2:

                Banner banner=helper.getView(R.id.banner_home1_2);
                banner.setImageLoader(new GlideImageLoader());
                banner.setImages(item.getImages());
                banner.setBannerStyle(BannerConfig.NOT_INDICATOR);
                banner.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                    @Override
                    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                    }

                    @Override
                    public void onPageSelected(int position) {
                        helper.setText(R.id.text_home1_2_current,String.valueOf(position+1));
                    }

                    @Override
                    public void onPageScrollStateChanged(int state) {

                    }
                });
                banner.start();
                helper.setText(R.id.text_home1_2_total,String.valueOf(item.getImages().size()));
                helper.setText(R.id.text_home1_2_titile,item.getITEM2_title());

                break;
            case HomeEntity.ITEM3:
                helper.setImageResource(R.id.image_home1_3,item.getDrawableRes());
                break;
            case HomeEntity.ITEM4:
                break;
            case HomeEntity.ITEM5:
                Banner banner1=helper.getView(R.id.banner_home1_5);
                banner1.setImageLoader(new GlideImageLoader());
                banner1.setImages(item.getImages());
                banner1.setBannerStyle(BannerConfig.NOT_INDICATOR);
                banner1.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                    @Override
                    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                    }

                    @Override
                    public void onPageSelected(int position) {
                        helper.setText(R.id.text_home1_5_current,String.valueOf(position+1));
                    }

                    @Override
                    public void onPageScrollStateChanged(int state) {

                    }
                });
                banner1.start();
                helper.setText(R.id.text_home1_5_total,String.valueOf(item.getImages().size()));
                helper.setText(R.id.text_home1_5_titile,item.getITEM2_title());
                break;
        }
        //helper.setImageResource(R.id.image_home1_1_1,item.getDrawableRes());
//        RecyclerView recyclerView= helper.getView(R.id.recyclerview_home_1_1);
//        recyclerView.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
//        recyclerView.setHasFixedSize(true);
//       recyclerView.setAdapter(new HomeAdapter1_1(R.layout.item_home_1_1_1,mlist));
    }


    public class HomeAdapter1_1 extends BaseQuickAdapter<HomeEntity,BaseViewHolder> {

        public HomeAdapter1_1(@LayoutRes int layoutResId, @Nullable List<HomeEntity> data) {
            super(layoutResId, data);
        }

        @Override
        protected void convert(BaseViewHolder helper, HomeEntity item) {
            helper.setImageResource(R.id.image_home1_1_1,item.getDrawableRes());
        }


    }

}

