package com.example.guidemilling.m_code;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.guidemilling.R;


public class McodeActivity extends AppCompatActivity {


    TextView text_mCode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_code);
        init();;
     //   setText_mCode();

    }

    public void init (){
        text_mCode=findViewById(R.id.tv_Mcode);
    }

    public void setText_mCode(){
        text_mCode.setText(" ");
    }


}
