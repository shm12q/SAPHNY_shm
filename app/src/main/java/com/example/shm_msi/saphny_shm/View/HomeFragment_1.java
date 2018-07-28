package com.example.shm_msi.saphny_shm.View;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.example.shm_msi.saphny_shm.Bean.HomeEntity;
import com.example.shm_msi.saphny_shm.R;
import com.example.shm_msi.saphny_shm.Utils.GlideImageLoader;
import com.example.shm_msi.saphny_shm.View.Adapter.HomeAdapter1;

import com.squareup.picasso.Picasso;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SHM-MSI on 2018/7/17.
 */

public class HomeFragment_1 extends BaseFragment {
    RecyclerView recyclerView;
    HomeAdapter1 homeAdapter1;
    List<HomeEntity> list1_1=new ArrayList<>();
    List<HomeEntity> list1=new ArrayList<>();
    List<Integer> images=new ArrayList<>();
    List<Integer> images1=new ArrayList<>();


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home_1,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initlist();
        initRecyclerView(view);





    }
    private void initlist(){
        images.add(R.drawable.zhuanti1);
        images.add(R.drawable.zhuanti2);
        images.add(R.drawable.zhuanti3);
        images.add(R.drawable.zhuanti4);
        images1.add(R.drawable.pinpai1);
        images1.add(R.drawable.pinpai2);
        list1.add(new HomeEntity(R.drawable.home_1_1,HomeEntity.ITEM1));
        list1.add(new HomeEntity(HomeEntity.ITEM2,"热门专题",images));
        list1.add(new HomeEntity(HomeEntity.ITEM4));
        list1.add(new HomeEntity(HomeEntity.ITEM5,"品牌推荐",images1));
        list1.add(new HomeEntity(R.drawable.jingzhishenghuo,HomeEntity.ITEM3));
        list1.add(new HomeEntity(R.drawable.shishangdapei,HomeEntity.ITEM3));
        list1.add(new HomeEntity(R.drawable.qingshezhiyu,HomeEntity.ITEM3));




        list1_1.add(new HomeEntity(R.drawable.xinshouzhinan,HomeEntity.ITEM1_1));
        list1_1.add(new HomeEntity(R.drawable.miannan,HomeEntity.ITEM1_1));
        list1_1.add(new HomeEntity(R.drawable.jiangli,HomeEntity.ITEM1_1));
    }
    private void initRecyclerView(View view){
        recyclerView=view.findViewById(R.id.recyclerview_home_1);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        homeAdapter1=new HomeAdapter1(list1,getActivity(),list1_1);
        //homeAdapter1.addHeaderView(LayoutInflater.from(getActivity()).inflate(R.layout.item_home_1_1,null));
        recyclerView.setAdapter(homeAdapter1);
    }

}
