package com.acadgild.com.session3_assignment4;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Valyoo on 12/18/2016.
 */
public class GetName extends AppCompatActivity {

        private TextView getname;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity2);
            getname = (TextView)findViewById(R.id.txtgetuname);
            Intent i = getIntent();
            Bundle b2 = this.getIntent().getExtras();
            String uname = b2.getString("USERNAME");
            String pwd = b2.getString("PASSWORD");
            Boolean isRegistered = b2.getBoolean("ISREGISTERED");
            if(isRegistered && pwd.equals("android")) {
                getname.setTextColor(Color.BLACK);
                getname.setText("Welcome "+uname);
            }
            else
            {
                getname.setTextColor(Color.RED);
                getname.setText("Login Failed as Password entered is wrong");
            }


        }
    }