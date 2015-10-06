package com.ztjc.day01_helloworld;

import android.app.Activity;
import android.os.Bundle;

/**
 * Android第一个程序HelloWorld
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
