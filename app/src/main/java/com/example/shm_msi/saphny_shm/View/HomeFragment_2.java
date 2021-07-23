package com.example.shm_msi.saphny_shm.View;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shm_msi.saphny_shm.Bean.HomeEntity;
import com.example.shm_msi.saphny_shm.R;
import com.example.shm_msi.saphny_shm.View.Adapter.HomeAdapter2;

/**
 * Created by SHM-MSI on 2018/7/17.
 */

public class HomeFragment_2 extends BaseFragment {
  RecyclerView recyclerView;
  List<Integer> images = new ArrayList<>();
  List<HomeEntity> data2_3 = new ArrayList<>();
  List<HomeEntity> data2_4 = new ArrayList<>();
  List<HomeEntity> data = new ArrayList<>();


  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_home_2, container, false);
  }

  @Override
  public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    initlist();
    initRecyclerView(view);

  }

  private void initlist() {
    images.add(R.drawable.home2_head1);
    images.add(R.drawable.home2_head2);
    images.add(R.drawable.home2_head3);
    data2_3.add(new HomeEntity(R.drawable.chaoliutuijian1, HomeEntity.Home2_ITEM3));
    data2_3.add(new HomeEntity(R.drawable.chaoliutuijian2, HomeEntity.Home2_ITEM3));
    data2_3.add(new HomeEntity(R.drawable.chaoliutuijian3, HomeEntity.Home2_ITEM3));
    data2_4.add(new HomeEntity(R.drawable.pinpaiguan1, HomeEntity.Home2_ITEM4));
    data2_4.add(new HomeEntity(R.drawable.pinpaiguan2, HomeEntity.Home2_ITEM4));
    data2_4.add(new HomeEntity(R.drawable.pinpaiguan3, HomeEntity.Home2_ITEM4));
    data2_4.add(new HomeEntity(R.drawable.pinpaiguan4, HomeEntity.Home2_ITEM4));
    data2_4.add(new HomeEntity(R.drawable.pinpaiguan5, HomeEntity.Home2_ITEM4));
    data2_4.add(new HomeEntity(R.drawable.pinpaiguan6, HomeEntity.Home2_ITEM4));
    data2_4.add(new HomeEntity(R.drawable.pinpaiguan7, HomeEntity.Home2_ITEM4));
    data2_4.add(new HomeEntity(R.drawable.pinpaiguan8, HomeEntity.Home2_ITEM4));
    data2_4.add(new HomeEntity(R.drawable.pinpaiguan9, HomeEntity.Home2_ITEM4));
    data2_4.add(new HomeEntity(R.drawable.pinpaiguan10, HomeEntity.Home2_ITEM4));

    data.add(new HomeEntity(HomeEntity.Home2_ITEM1, "null", images));
    data.add(new HomeEntity(HomeEntity.Home2_ITEM2));
    data.add(new HomeEntity(HomeEntity.Home2_ITEM3));
    data.add(new HomeEntity(HomeEntity.Home2_ITEM4));


  }

  private void initRecyclerView(View view) {
    recyclerView = view.findViewById(R.id.recyclerview_home_2);
    recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    recyclerView.setAdapter(new HomeAdapter2(data, getActivity(), data2_3, data2_4));

  }
}
