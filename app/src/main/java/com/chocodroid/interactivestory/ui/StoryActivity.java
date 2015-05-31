package com.chocodroid.interactivestory.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.chocodroid.interactivestory.R;


public class StoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Intent intent = getIntent();
        String name = intent.getStringExtra(getString(R.string.key_name));


    }

}
