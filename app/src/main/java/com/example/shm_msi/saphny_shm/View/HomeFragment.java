package com.example.shm_msi.saphny_shm.View;

import java.util.ArrayList;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.shm_msi.saphny_shm.R;
import com.flyco.tablayout.SlidingTabLayout;


/**
 * Created by SHM-MSI on 2018/7/17.
 */

public class HomeFragment extends BaseFragment {
  private SlidingTabLayout slidingTabLayout;
  private ViewPager viewPager;
  private String[] titles = {"首页", "品牌馆"};
  private ArrayList<Fragment> fragments;
  private MyPagerAdapter fragmentPagerAdapter;
  private HomeFragment_1 homeFragment_1;
  private HomeFragment_2 homeFragment_2;


  public HomeFragment() {
  }

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_home, container, false);
  }

  @Override
  public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    viewPager = (ViewPager) view.findViewById(R.id.viewpager_home);
    fragmentPagerAdapter = new MyPagerAdapter(getChildFragmentManager());
    //设置 viewpager 的适配器
    viewPager.setAdapter(fragmentPagerAdapter);
    slidingTabLayout = (SlidingTabLayout) view.findViewById(R.id.tab_home);
    initfragments();
    slidingTabLayout.setViewPager(viewPager, titles);
  }

  private void initfragments() {
    fragments = new ArrayList<>();
    fragments.add(homeFragment_1);
    fragments.add(homeFragment_2);
  }

  //自定义ViewPagerAdapter子类
  private class MyPagerAdapter extends FragmentPagerAdapter {

    public MyPagerAdapter(FragmentManager fm) {
      super(fm);
    }

    @Override
    public int getCount() {
      return titles.length;//二级导航个数
    }

    @Override
    public Fragment getItem(int position) { //根据位置返回具体某个导航上对应的Fragment
      switch (position) {
        case 0:
          if (homeFragment_1 == null) {
            homeFragment_1 = new HomeFragment_1();
          }
          return homeFragment_1;
        case 1:
          if (homeFragment_2 == null) {
            homeFragment_2 = new HomeFragment_2();
          }
          return homeFragment_2;
        default:
          return null;
      }
    }
  }


}
