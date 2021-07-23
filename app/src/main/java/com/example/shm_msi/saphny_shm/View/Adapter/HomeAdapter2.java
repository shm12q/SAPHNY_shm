package com.example.shm_msi.saphny_shm.View.Adapter;

import android.content.Context;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.shm_msi.saphny_shm.Bean.HomeEntity;
import com.example.shm_msi.saphny_shm.R;
import com.example.shm_msi.saphny_shm.Utils.GlideImageLoader;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;

import java.util.List;

/**
 * Created by SHM-MSI on 2018/7/22.
 */

public class HomeAdapter2 extends BaseMultiItemQuickAdapter<HomeEntity, BaseViewHolder> {
    private Context context;
    private List<HomeEntity> list2_3;
    private List<HomeEntity> list2_4;


    public HomeAdapter2(@Nullable List<HomeEntity> data, Context context,List<HomeEntity> data2_3,List<HomeEntity> data2_4) {
        super(data);

        addItemType(HomeEntity.Home2_ITEM1,R.layout.item_home_2_1);
        addItemType(HomeEntity.Home2_ITEM2,R.layout.item_home_2_2);
        addItemType(HomeEntity.Home2_ITEM3,R.layout.item_home_2_3);
        addItemType(HomeEntity.Home2_ITEM4,R.layout.item_home_2_4);
        this.list2_3=data2_3;
        this.list2_4=data2_4;
        this.context=context;
    }



    @Override
    protected void convert(final BaseViewHolder helper, HomeEntity item) {
        switch (helper.getItemViewType()){
            case HomeEntity.Home2_ITEM1:
                Banner banner=helper.getView(R.id.banner_home2_1);
                banner.setImageLoader(new GlideImageLoader());
                banner.setImages(item.getImages());
                banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);
                banner.setIndicatorGravity(BannerConfig.CENTER);
                banner.start();
                break;
            case HomeEntity.Home2_ITEM2:
                break;
            case HomeEntity.Home2_ITEM3:
                RecyclerView recyclerView=helper.getView(R.id.recyclerview_home2_3);
                recyclerView.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
                //recyclerView.setHasFixedSize(true);
                recyclerView.setAdapter(new HomeAdapter2_3(R.layout.item_home_2_3_1,list2_3));
                break;
            case HomeEntity.Home2_ITEM4:
                RecyclerView recyclerView1=helper.getView(R.id.recyclerview_home2_4);
                recyclerView1.setLayoutManager(new GridLayoutManager(context,3));
                //recyclerView.setHasFixedSize(true);
                recyclerView1.setAdapter(new HomeAdapter2_4(R.layout.item_home_2_4_1,list2_4));
                break;

        }

    }

    public class HomeAdapter2_3 extends BaseQuickAdapter<HomeEntity,BaseViewHolder> {

        public HomeAdapter2_3(@LayoutRes int layoutResId, @Nullable List<HomeEntity> data) {
            super(layoutResId, data);
        }

        @Override
        protected void convert(BaseViewHolder helper, HomeEntity item) {
            helper.setImageResource(R.id.image_home2_3_1,item.getDrawableRes());
        }


    }
    public class HomeAdapter2_4 extends BaseQuickAdapter<HomeEntity,BaseViewHolder> {

        public HomeAdapter2_4(@LayoutRes int layoutResId, @Nullable List<HomeEntity> data) {
            super(layoutResId, data);
        }

        @Override
        protected void convert(BaseViewHolder helper, HomeEntity item) {
            helper.setImageResource(R.id.image_home2_4_1,item.getDrawableRes());
        }


    }




}

