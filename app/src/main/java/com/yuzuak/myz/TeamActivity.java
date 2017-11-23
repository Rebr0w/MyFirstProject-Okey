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
        Intent intent = getIntent();
        String teamName = intent.getStringExtra(Constant.TEAM_NAME_KEY);
        takim1.setText(teamName);
    }
}
