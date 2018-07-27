package com.example.shm_msi.saphny_shm.View;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shm_msi.saphny_shm.R;
import com.example.shm_msi.saphny_shm.Utils.GlideImageLoader;
import com.example.shm_msi.saphny_shm.View.Adapter.HomeAdapter1;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SHM-MSI on 2018/7/17.
 */

public class HomeFragment_2 extends BaseFragment {
    RecyclerView recyclerView;
    HomeAdapter1 homeAdapter1;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home_2,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initlist();
        initRecyclerView(view);

    }
    private void initlist(){

    }
    private void initRecyclerView(View view){
        recyclerView=view.findViewById(R.id.recyclerview_home_2);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

    }
}
