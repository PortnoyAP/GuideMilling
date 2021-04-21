package com.example.guidemilling.tap;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import com.example.guidemilling.R;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * 1. init all string from array.xml
 * <p>
 * String[]tapName  (Keys for all HashMap)
 * String[]preDrillDiameter
 * String[]tapDiameter
 * <p>
 * *2  create HashMaps  preDrills and tapDiameters (String []Name =keys for all Maps)
 * elements in string's for map(key value) must hav be equal
 * <p>
 * *3 Spinner initUncOrMetric
 * send to initSpinnerTap () String[] Names+MAp preDiameters+Map preDiameters2+ MAp diametersTap
 * <p>
 * <p>
 * *4 initSpinnertap();
 **/


public class TapActivity extends AppCompatActivity {

    private String[] tapMetricNames;
    private String[] preDrillDiametersMetricCutting;
    private String[] preDrillDiameterMetricForming;
    private String[] tapMetricDiameter;

    private String[] tapMetric_HC_Names;
    private String[] preDrillDiametersMetric_HC;
    private String[] tapMetric_HC_Diameter;

    private String[] tapUnc_Names;
    private String[] preDrillDiameterUncCutting;
    private String[] preDrillDiameterUncForming;
    private String[] tapUncDiameter;


    private String[] tapUnc_HC_Names;
    private String[] preDrillDiameterUnc_HC;
    private String[] tapUnc_HC_Diameter;


    HashMap<String, String> hashMapPreDrillDiametersMetricCutting;
    HashMap<String, String> hashMapPreDrillDiameterMetricForming;
    HashMap<String, String> hashMapTapMetricDiameter;

    HashMap<String, String> hashMapPreDrillDiametersMetric_HC;
    HashMap<String, String> hashMapTapMetric_HC_Diameter;


    HashMap<String, String> hashMapPreDrillDiameterUncCutting;
    HashMap<String, String> hashMapPreDrillDiameterUncForming;
    HashMap<String, String> hashMapTapUncDiameter;

    HashMap<String, String> hashMapPreDrillDiameterUnc_HC;
    HashMap<String, String> hashMapTapUnc_HC_Diameter;


    Spinner tapSpinner;
    Spinner uncOrMetricSpinner;

    TextView preDrillSizeCuttingTap;
    TextView preDrillSizeFormingTap;
    TextView tapDiameter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tap);


        initStringArrays();  /*Must have be first method after init();*/
        init();

        initHashMapPreDrillingDiametersMetricCutting();
        initHashMapPreDrillingDiameterMetricForming();
        initHashMapPreDrillingDiameterMetric_HC();

        initHashMapPreDrillingDiameterUncCutting();
        initHashMapPreDrillingDiameterUncForming();
        initHashMapPreDrillingDiameterUnc_HC();

        initHashMapTapMetricDiameter();
        initHashMapTapMetric_HC_Diameter();

        initHashMapTapUncDiameter();
        initHashMapTapUnc_HC_Diameter();


        initUncOrMetric();

    }

    public void init() {
        preDrillSizeCuttingTap = findViewById(R.id.tv_pre_drilling_cutting);
        preDrillSizeFormingTap = findViewById(R.id.tv_pre_drilling_forming);
        tapDiameter = findViewById(R.id.tv_tap_diameter);
    }


    public void initStringArrays() {

        tapMetricNames = getResources().getStringArray(R.array.tapMetric);
        tapMetric_HC_Names = getResources().getStringArray(R.array.tapMetricHC);
        tapUnc_Names = getResources().getStringArray(R.array.tapUnc);
        tapUnc_HC_Names = getResources().getStringArray(R.array.tapUNC_HC);

        preDrillDiametersMetricCutting = getResources().getStringArray(R.array.preDrillingMetricCutting);
        preDrillDiameterMetricForming = getResources().getStringArray(R.array.preDrillingMetricForming);
        preDrillDiametersMetric_HC = getResources().getStringArray(R.array.preDrillingMetricHC);

        preDrillDiameterUncCutting = getResources().getStringArray(R.array.preDrillingUncCutting);
        preDrillDiameterUncForming = getResources().getStringArray(R.array.preDrillingUncForming);
        preDrillDiameterUnc_HC = getResources().getStringArray(R.array.preDrillingUNC_HC);

        tapMetricDiameter = getResources().getStringArray(R.array.tapMetricDiameter);
        tapMetric_HC_Diameter = getResources().getStringArray(R.array.tapMetric_HC_Diameter);

        tapUncDiameter = getResources().getStringArray(R.array.tapUncDiameter);
        tapUnc_HC_Diameter = getResources().getStringArray(R.array.tapUNC_HC_Diameter);

    }

    public void initHashMapPreDrillingDiametersMetricCutting() {
        hashMapPreDrillDiametersMetricCutting = new HashMap<>();
        for (int i = 0; i < tapMetricNames.length; i++) {
            hashMapPreDrillDiametersMetricCutting.put(tapMetricNames[i], preDrillDiametersMetricCutting[i]);
        }

    }

    public void initHashMapPreDrillingDiameterMetricForming() {
        hashMapPreDrillDiameterMetricForming = new HashMap<>();

        for (int i = 0; i < tapMetricNames.length; i++) {
            hashMapPreDrillDiameterMetricForming.put(tapMetricNames[i], preDrillDiameterMetricForming[i]);
        }

    }

    public void initHashMapPreDrillingDiameterMetric_HC() {
        hashMapPreDrillDiametersMetric_HC = new HashMap<>();

        for (int i = 0; i < tapMetric_HC_Names.length; i++) {
            hashMapPreDrillDiametersMetric_HC.put(tapMetric_HC_Names[i], preDrillDiametersMetric_HC[i]);
        }

    }

    public void initHashMapPreDrillingDiameterUncCutting() {
        hashMapPreDrillDiameterUncCutting = new HashMap<>();

        for (int i = 0; i < tapUnc_Names.length; i++) {
            hashMapPreDrillDiameterUncCutting.put(tapUnc_Names[i], preDrillDiameterUncCutting[i]);
        }

    }

    public void initHashMapPreDrillingDiameterUncForming() {
        hashMapPreDrillDiameterUncForming = new HashMap<>();

        for (int i = 0; i < tapUnc_Names.length; i++) {
            hashMapPreDrillDiameterUncForming.put(tapUnc_Names[i], preDrillDiameterUncForming[i]);
        }

    }

    public void initHashMapPreDrillingDiameterUnc_HC() {
        hashMapPreDrillDiameterUnc_HC = new HashMap<>();

        for (int i = 0; i < tapUnc_HC_Names.length; i++) {
            hashMapPreDrillDiameterUnc_HC.put(tapUnc_HC_Names[i], preDrillDiameterUnc_HC[i]);
        }

    }

    public void initHashMapTapMetricDiameter() {
        hashMapTapMetricDiameter = new HashMap<>();

        for (int i = 0; i < tapMetricNames.length; i++) {
            hashMapTapMetricDiameter.put(tapMetricNames[i], tapMetricDiameter[i]);
        }

    }

    public void initHashMapTapMetric_HC_Diameter() {
        hashMapTapMetric_HC_Diameter = new HashMap<>();

        for (int i = 0; i < tapMetric_HC_Names.length; i++) {
            hashMapTapMetric_HC_Diameter.put(tapMetric_HC_Names[i], tapMetric_HC_Diameter[i]);
        }

    }

    public void initHashMapTapUncDiameter() {
        hashMapTapUncDiameter = new HashMap<>();

        for (int i = 0; i < tapUnc_Names.length; i++) {
            hashMapTapUncDiameter.put(tapUnc_Names[i], tapUncDiameter[i]);
        }

    }

    public void initHashMapTapUnc_HC_Diameter() {
        hashMapTapUnc_HC_Diameter = new HashMap<>();

        for (int i = 0; i < tapUnc_HC_Names.length; i++) {
            hashMapTapUnc_HC_Diameter.put(tapUnc_HC_Names[i], tapUnc_HC_Diameter[i]);
        }

    }

    public void initUncOrMetric() {

        uncOrMetricSpinner = findViewById(R.id.spinner_unc_or_metric);

        ArrayList<String> type = new ArrayList<>();
        type.add("UNC");
        type.add("UNC H.C");
        type.add("Metric");
        type.add("Metric H.C");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, type);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        uncOrMetricSpinner.setAdapter(adapter);

        uncOrMetricSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            String selectedItem;

            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                selectedItem = uncOrMetricSpinner.getSelectedItem().toString();
                switch (selectedItem) {

                    case "UNC":
                        initSpinnerTap(tapUnc_Names, hashMapPreDrillDiameterUncCutting, hashMapPreDrillDiameterUncForming, hashMapTapUncDiameter);
                        break;

                    case "UNC H.C":
                        initSpinnerTap(tapUnc_HC_Names, hashMapPreDrillDiameterUnc_HC, hashMapPreDrillDiameterUnc_HC, hashMapTapUnc_HC_Diameter);
                        break;

                    case "Metric":
                        initSpinnerTap(tapMetricNames, hashMapPreDrillDiametersMetricCutting, hashMapPreDrillDiameterMetricForming, hashMapTapMetricDiameter);
                        break;

                    case "Metric H.C":
                        initSpinnerTap(tapMetric_HC_Names, hashMapPreDrillDiametersMetric_HC, hashMapPreDrillDiametersMetric_HC, hashMapTapMetric_HC_Diameter);
                        break;

                    default:
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {

            }
        });
    }

    public void initSpinnerTap(String[] string, final HashMap<String, String> diametersCutting,
                               final HashMap<String, String> diametersForming, final HashMap<String, String> tapDiameters) {
        tapSpinner = findViewById(R.id.spinner_tapMetric);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, string);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        tapSpinner.setAdapter(adapter);

        tapSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            String selectedItem;

            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                selectedItem = tapSpinner.getSelectedItem().toString();

                preDrillSizeCuttingTap.setText(diametersCutting.get(selectedItem));
                preDrillSizeFormingTap.setText(diametersForming.get(selectedItem));
                tapDiameter.setText(tapDiameters.get(selectedItem));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {

            }
        });
    }


}
