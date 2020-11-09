package com.example.guidemilling.tips;

import android.app.AlertDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import com.example.guidemilling.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TipActivity extends AppCompatActivity {

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    private String tip;
    private String title;

    private Date currentData;
    private  int counter;

    SharedPreferences myData;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip);

        initMyData();
        getCurrentData();
        initTip();


    }
    public void initMyData(){
        myData =getSharedPreferences("data", Context.MODE_PRIVATE);
        editor= myData.edit();
    }

    public void getCurrentData(){
        currentData =new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd");

        String day;


        String currentDay=formatForDateNow.format(currentData);
        day=myData.getString("currentDay", "0");

        counter=myData.getInt("counter", 0);

        if(day.equals("0")){
            day=formatForDateNow.format(currentData);
            editor.putString("currentDay",day);
            editor.apply();

            counter++;
            editor.putInt("counter", counter);
            editor.apply();

        }
        if(!day.equals(currentDay)){
            editor.putString("currentDay",currentDay);
            editor.apply();

            counter++;
            editor.putInt("counter", counter);
            editor.apply();

        }


     //   Toast.makeText(this, "counter"+ myData.getInt("counter", -1), Toast.LENGTH_SHORT).show();
      //  Toast.makeText(this, "day"+day, Toast.LENGTH_SHORT).show();
      //  Toast.makeText(this, "currentDay"+currentDay, Toast.LENGTH_SHORT).show();
    }


    public void initTip(){
        DocumentReference docRef = db.collection("tips").document(String.valueOf(counter));
        docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    if (document.exists()) {
                        tip=document.getString("tip");
                        title=document.getString("title");
                        Log.d("f", "DocumentSnapshot data: " + document.getData());
                    } else {
                        Log.d("f", "No such document");
                    }
                } else {
                    Log.d("f", "get failed with ", task.getException());
                }
            }
        });

    }


    public void getTip(View view) {
        initDialog(tip);
    }

    public void initDialog(String tip){
        AlertDialog.Builder builder = new AlertDialog.Builder(TipActivity.this);
        builder.setTitle(title);
        builder.setMessage(tip);
        builder.show();
    }









}
