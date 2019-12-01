package com.n.nezujian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.n.componentlib.ServiceFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ServiceFactory.getInstance().getmLoginService().launch(MainActivity.this);
            }
        });
        findViewById(R.id.showUI).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ServiceFactory.getInstance().getmLoginService().getFragment(getSupportFragmentManager(),R.id.container,new Bundle());
            }
        });

         findViewById(R.id.gozujian).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ServiceFactory.getInstance().getmMineService().launch(MainActivity.this);
            }
        });
    }

}
