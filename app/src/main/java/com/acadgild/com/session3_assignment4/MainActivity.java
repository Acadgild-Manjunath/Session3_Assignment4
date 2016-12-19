package com.acadgild.com.session3_assignment4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
        private Button btnLogin;
        private EditText txtuname, txtpwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = (Button)findViewById(R.id.btnLogin);
        txtuname = (EditText)findViewById(R.id.txtusername);
        txtpwd = (EditText)findViewById(R.id.txtpassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = txtuname.getText().toString();
                String password = txtpwd.getText().toString();
                Intent i1 = new Intent(MainActivity.this,GetName.class);
                Bundle b = new Bundle();
                b.putString("USERNAME", username);
                b.putBoolean("ISREGISTERED", true);
                b.putString("PASSWORD", password);
                i1.putExtras(b);
            //    intent.putExtra("USERNAME", username);
             //   intent.putExtra("ISREGISTERED", true);
                startActivity(i1);
            }
        });
    }
}
