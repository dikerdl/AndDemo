package com.icode.jiling.anddemo.activity;

import android.os.Bundle;
import android.util.Log;

import com.icode.jiling.anddemo.R;
import com.icode.jiling.baselib.bases.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("MainActivity","first test");
    }
}
