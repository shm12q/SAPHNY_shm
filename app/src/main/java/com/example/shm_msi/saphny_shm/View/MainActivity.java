package com.example.shm_msi.saphny_shm.View;

import androidx.annotation.NonNull;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import android.view.MenuItem;

import com.example.shm_msi.saphny_shm.R;
import com.example.shm_msi.saphny_shm.Utils.BottomNavigationViewHelper;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private FragmentPagerAdapter fragmentPagerAdapter;

    private List<BaseFragment> fragmentList;
    private BottomNavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        initFragmentList();//初始化 FragmentList
        initViewPager();//初始化 ViewPager
        initbottomnv();

    }
    private void initFragmentList() {
        // 将 fragment 加载到 list 中
        fragmentList = new ArrayList<>();
        fragmentList.add(new HomeFragment());
        fragmentList.add(new GoodsFragment());
        fragmentList.add(new ZhihuanFragment());
        fragmentList.add(new BuyFragment());
        fragmentList.add(new UserFragment());
    }
    private void initViewPager() {
        //实例化 viewpager
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        //实例化 FragmentPagerAdapter
        fragmentPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragmentList.get(position);
            }
            @Override
            public int getCount() {
                return fragmentList.size();
            }
        };
        //设置 viewpager 的适配器
        viewPager.setAdapter(fragmentPagerAdapter);
        viewPager.setOffscreenPageLimit(4);
        //设置 viewpager 的页面切换事件
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int
                    positionOffsetPixels) {
            }
            @Override
            public void onPageSelected(int position) {
                System.out.println("---position=" + position);
                switch (position) {
                    case 0:
                        navigationView.setSelectedItemId(R.id.ic_shouye);
                        break;
                    case 1:
                        navigationView.setSelectedItemId(R.id.ic_zhubao);
                        break;
                    case 2:
                        navigationView.setSelectedItemId(R.id.ic_zhihuan);
                        break;
                    case 3:
                        navigationView.setSelectedItemId(R.id.ic_goumai);
                        break;
                    case 4:
                        navigationView.setSelectedItemId(R.id.ic_wode);
                        break;
                }
            }
            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    }
    private void initbottomnv() {
        //实例化 BottomNavigationView
        navigationView = (BottomNavigationView) findViewById(R.id.bottom_nv);
        //设置 BottomNavigationView 切换事件
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = 0;
                switch (item.getItemId()) {
                    case R.id.ic_shouye:
                        id = 0;
                        break;
                    case R.id.ic_zhubao:
                        id = 1;
                        break;
                    case R.id.ic_zhihuan:
                        id = 2;
                        break;
                    case R.id.ic_goumai:
                        id = 3;
                        break;
                    case R.id.ic_wode:
                        id = 4;
                        break;
                }
                System.out.println("---id=" + id);
                viewPager.setCurrentItem(id);
                return true;
            }
        });
        //设置底部导航栏显示效果
        BottomNavigationViewHelper.disableShiftMode(navigationView);

    }
}
