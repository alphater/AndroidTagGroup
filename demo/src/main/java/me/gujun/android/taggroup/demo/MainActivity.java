package me.gujun.android.taggroup.demo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import me.gujun.android.taggroup.TagGroup;


public class MainActivity extends ActionBarActivity {
    private TagGroup mTagGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTagGroup = (TagGroup) findViewById(R.id.tag_group);
        mTagGroup
    }
}