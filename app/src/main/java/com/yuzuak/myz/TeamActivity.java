package com.yuzuak.myz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.yuzuak.myz.utility.Constant;

public class TeamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team);
        TextView takim1 = (TextView) findViewById(R.id.takim1);
        TextView takim2 = (TextView) findViewById(R.id.takim2);
        TextView takim3 = (TextView) findViewById(R.id.takim3);
        TextView takim4 = (TextView) findViewById(R.id.takim4);
        Intent intent = getIntent();
        String teamName1 = intent.getStringExtra("name1");
        String teamName2 = intent.getStringExtra("name2");
        String teamName3 = intent.getStringExtra("name3");
        String teamName4 = intent.getStringExtra("name4");
        takim1.setText(teamName1);
        takim2.setText(teamName2);
        takim3.setText(teamName3);
        takim4.setText(teamName4);

}}
