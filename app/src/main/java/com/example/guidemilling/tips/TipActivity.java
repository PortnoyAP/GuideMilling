package com.example.guidemilling.tips;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import com.example.guidemilling.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
;import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.xml.validation.TypeInfoProvider;

public class TipActivity extends AppCompatActivity {



    private String tip;



    FirebaseFirestore db = FirebaseFirestore.getInstance();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip);



        DocumentReference docRef = db.collection("tips").document("2");
        docRef.get().addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    DocumentSnapshot document = task.getResult();
                    if (document.exists()) {
                        tip=document.getString("tip");
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



public void initDialog(String tip){
    AlertDialog.Builder builder = new AlertDialog.Builder(TipActivity.this);
    builder.setTitle("Tip Of The Day");
    builder.setMessage(tip);
    builder.show();
}


    public void getTip(View view) {


        initDialog(tip);
    }
}
