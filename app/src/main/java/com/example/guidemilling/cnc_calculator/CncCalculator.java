package com.example.guidemilling.cnc_calculator;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import com.example.guidemilling.R;
import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;

import static com.example.guidemilling.R.drawable.*;

public class CncCalculator extends AppCompatActivity {


    private Spinner operation;
    private Spinner maxSpSpeed;

    private float maxSpSpeedSelected;
    private String operationSelected;

    private EditText feedPerTooth;
    private EditText cuttingSpeed;
    private EditText diameter;
    private EditText toothNumber;

    private String toothNumberInput;
    private String cuttingSpeedTextInput;
    private String diameterInput;
    private String feedPerToothInput;

    private TextView tv_feedResult;
    private TextView tv_sSpeedResult;

    private Button calculate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cnc_calculator);
        init();
        initSpinnerOperation();
        initSpinnerMaxSpSpeed();

    }

    public void init() {

        tv_sSpeedResult = findViewById(R.id.tv_sp_speed_result);
        tv_feedResult = findViewById(R.id.tv_feed_result);
        calculate = findViewById(R.id.button_calculate);


        feedPerTooth = findViewById(R.id.editText_fz);
        toothNumber = findViewById(R.id.editText_z);
        cuttingSpeed = findViewById(R.id.editText_vc);
        diameter = findViewById(R.id.editText_diameter);

    }

    public void initSpinnerOperation() {

        operation = findViewById(R.id.spinnerOperstion);

        ArrayList<String> operations = new ArrayList<>();
        operations.add("Milling");
        operations.add("Drilling");

        ArrayAdapter<String> adapterOperations = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, operations);
        adapterOperations.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        operation.setAdapter(adapterOperations);
        operation.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                operationSelected = operation.getSelectedItem().toString();
                if (operationSelected == "Milling") {
                    toothNumber.setText(String.valueOf(2));
                    toothNumber.setEnabled(true);

                } else {
                    toothNumber.setText(String.valueOf(1));
                    toothNumber.setEnabled(false);

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {

            }
        });


    }

    public void initSpinnerMaxSpSpeed() {

        maxSpSpeed = findViewById(R.id.spinnerMaxSpeeds);

        final ArrayList<String> speeds = new ArrayList<>();


        speeds.add("20000");
        speeds.add("18000");
        speeds.add("15000");
        speeds.add("12000");
        speeds.add("10000");
        speeds.add("8000");


        ArrayAdapter<String> adapterMaxSpeeds = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, speeds);
        adapterMaxSpeeds.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        maxSpSpeed.setAdapter(adapterMaxSpeeds);


        maxSpSpeed.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                maxSpSpeedSelected = Float.parseFloat(maxSpSpeed.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {

            }
        });
    }

    public void calculate(View view) {

        boolean isFeedPerToothCorrect = false;
        boolean isCuttingSpeedCorrect = false;
        boolean isDiameterCorrect = false;
        boolean isToothNumberCorrect = false;

        float feedPerToothFloat = 0f;
        float cuttingSpeedFloat = 0f;
        float diameterFloat = 0f;
        float toothNumberFloat = 0f;

        feedPerToothInput = feedPerTooth.getText().toString();
        cuttingSpeedTextInput = cuttingSpeed.getText().toString();
        diameterInput = diameter.getText().toString();
        toothNumberInput = toothNumber.getText().toString();


        if (feedPerToothInput.isEmpty() | cuttingSpeedTextInput.isEmpty() | diameterInput.isEmpty() | toothNumberInput.isEmpty()) {

            if (feedPerToothInput.isEmpty()) {
                feedPerTooth.setHintTextColor(Color.RED);
                Toast.makeText(this, "Enter  fz  ", Toast.LENGTH_SHORT).show();
            }

            if (cuttingSpeedTextInput.isEmpty()) {
                cuttingSpeed.setHintTextColor(Color.RED);
                Toast.makeText(this, "Enter  Vc  ", Toast.LENGTH_SHORT).show();
            }

            if (diameterInput.isEmpty()) {
                diameter.setHintTextColor(Color.RED);
                Toast.makeText(this, "Enter D ", Toast.LENGTH_SHORT).show();
            }

            if (toothNumberInput.isEmpty()) {
                toothNumber.setHintTextColor(Color.RED);
                Toast.makeText(this, "Enter D ", Toast.LENGTH_SHORT).show();
            }


        } else {

            feedPerToothFloat = Float.parseFloat(feedPerToothInput);
            cuttingSpeedFloat = Float.parseFloat(cuttingSpeedTextInput);
            diameterFloat = Float.parseFloat(diameterInput);
            toothNumberFloat = Float.parseFloat(toothNumberInput);

            if (feedPerToothFloat == 0) {
                feedPerTooth.setTextColor(Color.RED);
                Toast.makeText(this, "Enter  fz  ", Toast.LENGTH_SHORT).show();
            } else {
                feedPerTooth.setTextColor(Color.BLACK);
                isFeedPerToothCorrect = true;
            }

            if (cuttingSpeedFloat == 0) {
                cuttingSpeed.setTextColor(Color.RED);
                Toast.makeText(this, "Enter  Vc  ", Toast.LENGTH_SHORT).show();
            } else {
                cuttingSpeed.setTextColor(Color.BLACK);
                isCuttingSpeedCorrect = true;
            }


            if (diameterFloat == 0) {
                diameter.setTextColor(Color.RED);
                Toast.makeText(this, "Enter  D  ", Toast.LENGTH_SHORT).show();
            } else {
                diameter.setTextColor(Color.BLACK);
                isDiameterCorrect = true;
            }

            if (toothNumberFloat == 0) {
                toothNumber.setTextColor(Color.RED);
                Toast.makeText(this, "Enter  fz  ", Toast.LENGTH_SHORT).show();
            } else {
                toothNumber.setTextColor(Color.BLACK);
                isToothNumberCorrect = true;
            }
        }

        if (isCuttingSpeedCorrect && isFeedPerToothCorrect && isDiameterCorrect && isToothNumberCorrect) {


            float spindleSpeedCalculated = (float) ((cuttingSpeedFloat * 1000) / (diameterFloat * Math.PI));
            float feedCalculated = feedPerToothFloat * toothNumberFloat * spindleSpeedCalculated;
            float cuttingSpeedCalculated;

            if (spindleSpeedCalculated > maxSpSpeedSelected) {

                cuttingSpeedCalculated = (float) ((diameterFloat * Math.PI * maxSpSpeedSelected) / 1000);
                spindleSpeedCalculated = (float) ((cuttingSpeedCalculated * 1000) / (diameterFloat * Math.PI));
                tv_sSpeedResult.setText(String.valueOf(spindleSpeedCalculated));
                cuttingSpeed.setText(String.valueOf(cuttingSpeedCalculated));

                feedCalculated = feedPerToothFloat * toothNumberFloat * spindleSpeedCalculated;
                tv_feedResult.setText(String.valueOf(feedCalculated));

            } else {

                tv_sSpeedResult.setText(String.valueOf(spindleSpeedCalculated));
                tv_feedResult.setText(String.valueOf(feedCalculated));
            }


        }
    }
}