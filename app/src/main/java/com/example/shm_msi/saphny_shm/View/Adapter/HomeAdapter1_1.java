package com.example.shm_msi.saphny_shm.View.Adapter;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.shm_msi.saphny_shm.Bean.HomeEntity;
import com.example.shm_msi.saphny_shm.R;

import java.util.List;

/**
 * Created by SHM-MSI on 2018/7/23.
 */

public class HomeAdapter1_1 extends BaseQuickAdapter<HomeEntity,BaseViewHolder> {

    public HomeAdapter1_1(@LayoutRes int layoutResId, @Nullable List<HomeEntity> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, HomeEntity item) {
        helper.setImageResource(R.id.image_home1_1_1,item.getDrawableRes());
    }


}