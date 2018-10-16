package com.example.lenovo.healthcheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;





public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);\
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.login);

        button.setOnClickListener(new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                openLoginActivity();
            }
        });
    }
    public void openLoginActivity(){

        Intent intent = new Intent(  this, LoginActivity.class);
        startActivity(intent);

    }
}
