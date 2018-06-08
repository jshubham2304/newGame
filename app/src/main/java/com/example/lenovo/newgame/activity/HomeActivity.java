package com.example.lenovo.newgame.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.lenovo.newgame.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_home );

    }

    public void easylevel(View view) {
        Intent intent =  new Intent(  HomeActivity.this, easyLevel.class );
        startActivity( intent );
    }
}
