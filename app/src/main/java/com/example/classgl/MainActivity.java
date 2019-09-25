package com.example.classgl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private EditText name;
private EditText word;
private Button btn1;
private Button btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.username);
        word=findViewById(R.id.password);
        Button btn1=findViewById(R.id.denglu);
        Button btn2=findViewById(R.id.tuichu);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);

        String username = readPrfs();
        if (username != null) {
            name.setText(username);
        }
    }

    @Override
    public void onClick(View v) {

        String username = name.getText().toString();
        String password = word.getText().toString();

        if ("liu".equals(username) && "123".equals(password)) {
          Intent  intent = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(intent);




        } else {
            Toast.makeText(MainActivity.this, "用户名或密码错误", Toast.LENGTH_LONG).show();
        }
    }

    private String readPrfs() {
        return null;
    }


}
