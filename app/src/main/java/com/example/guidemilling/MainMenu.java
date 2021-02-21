package com.example.guidemilling;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.guidemilling.cnc_calculator.CncCalculator;
import com.example.guidemilling.g_m_code.GcodeActivity;
import com.example.guidemilling.myTechnology.MyTechnologySelector;
import com.example.guidemilling.tap.TapActivity;
import com.example.guidemilling.tips.TipActivity;
import com.example.guidemilling.toolGallery.ToolGalleryActivity;


public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

    }


    public void goToTechnologySelectorScreen(View view) {
        Intent intent=new Intent(this, MyTechnologySelector.class);
        startActivity(intent);
    }

    public void onClickGcodeActivity(View view) {

        Intent intent=new Intent(this, GcodeActivity.class);
        startActivity(intent);
    }


    public void toCncCalculatorActivity(View view) {

        Intent intent= new Intent(this, CncCalculator.class);
        startActivity(intent);

    }

    public void toTapActivity(View view) {
        Intent intent=new Intent(this, TapActivity.class);
        startActivity(intent);

    }
//DADA

    public void toTipActivity(View view) {
        Intent intent=new Intent(this, TipActivity.class);
        startActivity(intent);
    }


    public void toGalleryActivity(View view) {
        Intent intent=new Intent(this, ToolGalleryActivity.class);
        startActivity(intent);
    }
}
