package com.bwie.fragmentlazydemo;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ArrayList<Fragment> list;
    private ViewPagerAdapter adapter;

    @Override
    protected void onResume() {
        super.onResume();

//        String hi = getIntent().getExtras().getString("hi");
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);
        initViewPager();

//        startActivityForResult(new Intent(this,MainActivity.class),1);
    }


//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//
//    }

    private void initViewPager() {
        list = new ArrayList<Fragment>();
        Fragment1 fragment1 = new Fragment1();
        Fragment2 fragment2 = new Fragment2();
        Fragment3 fragment3 = new Fragment3();
        Fragment4 fragment4 = new Fragment4();
        list.add(fragment1);
        list.add(fragment2);
        list.add(fragment3);
        list.add(fragment4);

        FragmentManager fragmentManager = getSupportFragmentManager();
        adapter = new ViewPagerAdapter(fragmentManager, list);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(0);
        viewPager.setOffscreenPageLimit(1);//viewPager预加载，从0开始
        viewPager.addOnPageChangeListener(new
          ViewPager.OnPageChangeListener() {
              @Override
              public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

              }

              @Override
              public void onPageSelected(int position) {
                  //在这里可以做一些改变按钮的操作。
              }

              @Override
              public void onPageScrollStateChanged(int state) {

              }
          });
    }


    public void to2(View view) {
        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra("hi","hi");

        startActivity(intent);
//        startActivity(new Intent(this,Main2Activity.class));
    }
}
