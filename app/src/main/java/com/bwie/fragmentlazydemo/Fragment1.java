package com.bwie.fragmentlazydemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.HashMap;

public class Fragment1  extends BaseFragment {


    @Override
    protected int bindLayoutId() {
        return R.layout.fragment1_layout;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    /**
     * 请求数据，或者处理数据的方法，懒加载
     */
    @Override
    protected void loadData() {





    }
}
