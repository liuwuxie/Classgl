package com.example.classgl;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    private TextView tv_welcome;
    private  TextView tv_manag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 );
        initView();
    }

    private void initView() {

        tv_welcome =findViewById( R.id.wename);
        tv_manag = findViewById( R.id.manage );
        tv_manag.setOnClickListener( this );


        Intent intent  = getIntent();
        String bb= intent.getStringExtra( "id" );

        tv_welcome.setText("欢迎"+ bb +"来到学生空间");
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.manage:

                Intent intent = new Intent( Main2Activity.this, Main3Activity.class );
                startActivity( intent );

                break;

        }

    }
}
