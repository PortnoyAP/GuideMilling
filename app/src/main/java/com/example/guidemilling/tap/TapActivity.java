package com.example.guidemilling.tap;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import com.example.guidemilling.R;

import java.util.ArrayList;
import java.util.HashMap;

public class TapActivity extends AppCompatActivity {

        private String[] tapMetric;
        private String[] drillDiametersMetricCutting;
        private String[] drillDiameterMetricForming;

        private String[] tapUnc;
        private String[] drillDiameterUncCutting;
        private String[] drillDiameterUncForming;

        private String[] tapMetricDiameter;
        private String[] tapUncDiameter;


        HashMap<String,String> hashMapDrillDiametersMetricCutting;
        HashMap<String,String> hashMapDrillDiameterMetricForming;
        HashMap<String,String> hashMapTapMetricDiameter;

        HashMap<String,String> hashMapDrillDiameterUncCutting;
        HashMap<String,String> hashMapDrillDiameterUncForming;
        HashMap<String,String> hashMapTapUncDiameter;


        Spinner tapSpinner;
        Spinner uncOrMetricSpinner;

        TextView drillSizeCuttingTap;
        TextView drillSizeFormingTap;
        TextView tapDiameter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tap);

        initStringArrays();  // MUST be first function
        init();



        initHashMapDrillingDiametersMetricCutting();
        initHashMapDrillingDiameterMetricForming();
        initHashMapDrillingDiameterUncCutting();
        initHashMapDrillingDiameterUncForming();

        initHashMapTapMetricDiameter();
        initHashMapTapUncDiameter();



        initUncHcOrMetric();
       // initSpinnerTap();

    }

    public void initStringArrays(){
        tapMetric=getResources().getStringArray(R.array.tapMetric);
        tapUnc=getResources().getStringArray(R.array.tapUnc);

        drillDiametersMetricCutting =getResources().getStringArray(R.array.preDrillingMetricCutting);
        drillDiameterMetricForming =getResources().getStringArray(R.array.preDrillingMetricForming);
        drillDiameterUncCutting =getResources().getStringArray(R.array.preDrillingUncCutting);
        drillDiameterUncForming =getResources().getStringArray(R.array.preDrillingUncForming);

        tapMetricDiameter=getResources().getStringArray(R.array.tapMetricDiameter);
        tapUncDiameter=getResources().getStringArray(R.array.tapUncDiameter);
    }

    public void initHashMapDrillingDiametersMetricCutting(){
        hashMapDrillDiametersMetricCutting =new HashMap<>();

        for(int i=0;i<tapMetric.length;i++){
            hashMapDrillDiametersMetricCutting.put(tapMetric[i], drillDiametersMetricCutting[i]);
        }

    }
    public void initHashMapDrillingDiameterMetricForming(){
        hashMapDrillDiameterMetricForming =new HashMap<>();

        for(int i=0;i<tapMetric.length;i++){
            hashMapDrillDiameterMetricForming.put(tapMetric[i], drillDiameterMetricForming[i]);
        }

    }
    public void initHashMapDrillingDiameterUncCutting(){
        hashMapDrillDiameterUncCutting =new HashMap<>();

        for(int i=0;i<tapUnc.length;i++){
            hashMapDrillDiameterUncCutting.put(tapUnc[i], drillDiameterUncCutting[i]);
        }

    }
    public void initHashMapDrillingDiameterUncForming() {
        hashMapDrillDiameterUncForming =new HashMap<>();

        for(int i=0;i<tapUnc.length;i++){
            hashMapDrillDiameterUncForming.put(tapUnc[i], drillDiameterUncForming[i]);
        }

    }
    public void initHashMapTapMetricDiameter(){
        hashMapTapMetricDiameter=new HashMap<>();

        for(int i=0;i<tapMetric.length;i++){
            hashMapTapMetricDiameter.put(tapMetric[i],tapMetricDiameter[i]);
        }

    }
    public void initHashMapTapUncDiameter(){
        hashMapTapUncDiameter=new HashMap<>();

        for(int i=0;i<tapUnc.length;i++){
            hashMapTapUncDiameter.put(tapUnc[i],tapUncDiameter[i]);
        }

    }




    public void init(){

        drillSizeCuttingTap=findViewById(R.id.tv_pre_drilling_cutting);
        drillSizeFormingTap=findViewById(R.id.tv_pre_drilling_forming);
        tapDiameter=findViewById(R.id.tv_tap_diameter);
    }


   /* public void initSpinnerTap(){
        tapSpinner=findViewById(R.id.spinner_tapMetric);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, tapMetric);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        tapSpinner.setAdapter(adapter);

        tapSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            String selecteditem;
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                selecteditem =  tapSpinner.getSelectedItem().toString();
                drillSizeCuttingTap.setText(hashMapDrillDiametersMetricCutting.get(selecteditem));
                drillSizeFormingTap.setText(hashMapDrillDiameterMetricForming.get(selecteditem));
                tapDiameter.setText(hashMapTapMetricDiameter.get(selecteditem));

            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {

            }
        });
    }*/

    public void initSpinnerTap(String[]strings, final HashMap<String,String>diametersCutting,
                               final HashMap<String,String>diametersForming, final HashMap<String,String>tapDiameters){
        tapSpinner=findViewById(R.id.spinner_tapMetric);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, strings);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        tapSpinner.setAdapter(adapter);

        tapSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            String selecteditem;
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                selecteditem =  tapSpinner.getSelectedItem().toString();
                drillSizeCuttingTap.setText(diametersCutting.get(selecteditem));
                drillSizeFormingTap.setText(diametersForming.get(selecteditem));
                tapDiameter.setText(tapDiameters.get(selecteditem));

            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {

            }
        });
    }




    public void initUncHcOrMetric(){
        uncOrMetricSpinner =findViewById(R.id.spinner_unc_or_metric);

        ArrayList<String>type=new ArrayList<>();
        type.add("UNC");
        type.add("Metric");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, type);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        uncOrMetricSpinner.setAdapter(adapter);

        uncOrMetricSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            String selectedItem;
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                selectedItem =  uncOrMetricSpinner.getSelectedItem().toString();
                switch (selectedItem){

                    case "UNC": initSpinnerTap(tapUnc,hashMapDrillDiameterUncCutting,hashMapDrillDiameterUncForming,hashMapTapUncDiameter);
                    break;

                    case "Metric": initSpinnerTap(tapMetric,hashMapDrillDiametersMetricCutting,hashMapDrillDiameterMetricForming,hashMapTapMetricDiameter);
                    break;

                    default: break;
                }



            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {

            }
        });
    }




}
