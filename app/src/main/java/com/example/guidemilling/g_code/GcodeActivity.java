package com.example.guidemilling.g_code;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.guidemilling.R;


public class GcodeActivity extends AppCompatActivity {


    TextView text_gCode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g_code);
        init();
    }





    public void init(){

    text_gCode =findViewById(R.id.tv_gCode);
//    TextView textView1=findViewById(R.id.textView1gcode);
//        // Get the Java runtime
//        Runtime runtime = Runtime.getRuntime();
//// Run the garbage collector
//       // runtime.gc();
//// Calculate the used memory
//        long memoryUsed = runtime.totalMemory() - runtime.freeMemory();
//        textView1.setText(String.valueOf(memoryUsed));

    }

   // public void setText(){
  //  }

}
