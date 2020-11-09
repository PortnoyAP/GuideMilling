package com.example.guidemilling.g_m_code;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.guidemilling.R;


public class GcodeActivity extends AppCompatActivity {


  private  TextView text_Code;
  private  Button gCode;
  private  Button mCode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g_code);
        init();

    }





    public void init(){

        gCode=findViewById(R.id.button_g_code);
        mCode=findViewById(R.id.button_m_code);
        text_Code =findViewById(R.id.tv_code);
    }


    public void getMCodeText(View view) {

        text_Code.setText(getString(R.string.m_code_text));

    }
    public void getGCodeText(View view) {

        text_Code.setText(getString(R.string.g_code_text));

    }
}
