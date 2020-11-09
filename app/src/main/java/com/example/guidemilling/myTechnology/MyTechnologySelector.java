package com.example.guidemilling.myTechnology;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.guidemilling.R;

import java.util.ArrayList;
import java.util.List;

import static android.R.layout.simple_dropdown_item_1line;


public class MyTechnologySelector extends AppCompatActivity {


    private ArrayList<MaterialClassForSpinnerView> materialList;
    private String typeMaterialSelected;
    private String fullNameMaterial;

    private Spinner selectOperation;
    private String operationSelected;

    private Spinner selectStock;
    private String stockSelected;


    private Button getTechnology;


     @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_select);

        init();
        initMaterialsForSpinnerView();
        initStocksForSpinnerView();
        initOperationSpinner();
    }


     private void init (){
        getTechnology=findViewById(R.id.button_get_technologhy);
        materialList = new ArrayList<>();
    }

     public void initMaterialsForSpinnerView(){
        materialList.add(new MaterialClassForSpinnerView('P',"P1","P1 Low-Carbon Steels", R.drawable.blue_cube));
        materialList.add(new MaterialClassForSpinnerView('P',"P2","P2 Medium/High Carbon Steels", R.drawable.blue_cube));
        materialList.add(new MaterialClassForSpinnerView('P',"P3","P3 Alloy/Tool Steel", R.drawable.blue_cube));
        materialList.add(new MaterialClassForSpinnerView('P',"P4","P4 Alloy/Tool Steel", R.drawable.blue_cube));
        materialList.add(new MaterialClassForSpinnerView('P',"P5","P5 Ferritic/Martensitic/PH Stainless Steels", R.drawable.blue_cube));
        materialList.add(new MaterialClassForSpinnerView('P',"P6","P6 High-Strength Ferritic", R.drawable.blue_cube));

        materialList.add(new MaterialClassForSpinnerView('N',"N1","N1 Wrought Aluminium", R.drawable.green_cube));
        materialList.add(new MaterialClassForSpinnerView('N',"N2","N2 Low-Silicon Aluminium Alloys/Magnesium Alloys", R.drawable.green_cube));
        materialList.add(new MaterialClassForSpinnerView('N',"N3","N3 High-Silicon Aluminium Alloys/Magnesium Alloys", R.drawable.green_cube));
        materialList.add(new MaterialClassForSpinnerView('N',"N4","N4 Copper/Brass/Zinc", R.drawable.green_cube));
        materialList.add(new MaterialClassForSpinnerView('N',"N5","N5 Nylon/Plastics/Rubbers/Phenolics/Resins/Fibreglass", R.drawable.green_cube));
        materialList.add(new MaterialClassForSpinnerView('N',"N6","N6 Carbon/Graphite Composites/CFRP", R.drawable.green_cube));


        materialList.add(new MaterialClassForSpinnerView('K',"K1","K1 Grey Cast Iron", R.drawable.red_cube));
        materialList.add(new MaterialClassForSpinnerView('K',"K2","K2 Low/Medium-Strength Ductile Irons/CGI", R.drawable.red_cube));
        materialList.add(new MaterialClassForSpinnerView('K',"K3","K3 High-Strength Ductile Irons/ADI", R.drawable.red_cube));

        materialList.add(new MaterialClassForSpinnerView('M',"M1","M1 Austenitic Stainless Steel", R.drawable.yellow_cube));
        materialList.add(new MaterialClassForSpinnerView('M',"M2","M2 High-Strength/Cast Stainless Steels", R.drawable.yellow_cube));
        materialList.add(new MaterialClassForSpinnerView('M',"M3","M3 Duplex Stainless Steel", R.drawable.yellow_cube));

        materialList.add(new MaterialClassForSpinnerView('S',"S1","S1 Iron-Based/Heat-Resistant Alloys", R.drawable.orange_cube));
        materialList.add(new MaterialClassForSpinnerView('S',"S2","S2 Cobalt-Based/Heat-Resistant Alloys", R.drawable.orange_cube));
        materialList.add(new MaterialClassForSpinnerView('S',"S3","S3 Nickel-Based/Heat-Resistant Alloys", R.drawable.orange_cube));
        materialList.add(new MaterialClassForSpinnerView('S',"S4","S4 Titanium/Titanium Alloys", R.drawable.orange_cube));

        materialList.add(new MaterialClassForSpinnerView('H',"H1","H1 Hardened Materials", R.drawable.grey_cube));
        materialList.add(new MaterialClassForSpinnerView('H',"H2","H2 Hardened Materials", R.drawable.grey_cube));

        final Spinner SPINNER =findViewById(R.id.spinnerMaterial);
        final MaterialNameSpinnerAdapter materialSpinnerAdapter=new MaterialNameSpinnerAdapter(this, materialList);
        SPINNER.setAdapter(materialSpinnerAdapter);

        SPINNER.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                MaterialClassForSpinnerView materialInSpinner=(MaterialClassForSpinnerView) SPINNER.getSelectedItem();
                System.out.println("SPINNER SPINNER SPINNER "+materialInSpinner.getMaterialName());
                typeMaterialSelected =materialInSpinner.getTypeClass();
                fullNameMaterial=materialInSpinner.getMaterialName();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

     public void initStocksForSpinnerView() {
        selectStock=findViewById(R.id.spinnerStock);

        List<String> stocks = new ArrayList<>();
        stocks.add("Big");
        stocks.add("Small");
        stocks.add("Cylinder");
        stocks.add("Thin Wide");
        stocks.add("Thin Narrow");


        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,stocks);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        selectStock.setAdapter(adapter);


        selectStock.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                stockSelected= selectStock.getSelectedItem().toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {

            }
        });


    }

     public void initOperationSpinner() {

        selectOperation =findViewById(R.id.spinnerDiameter);

        ArrayList<String> operations = new ArrayList<>();
        operations.add("Side Milling");
        operations.add("Slot Milling");
        operations.add("Z Milling");
        operations.add("Drill");

        ArrayAdapter<String> adapterSpinnerJobs = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, operations);
        adapterSpinnerJobs.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        selectOperation.setAdapter(adapterSpinnerJobs);


        selectOperation.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                operationSelected= selectOperation.getSelectedItem().toString();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView) {

            }
        });

    }

     public void calculateTechnology(View view) {

            Intent intent = new Intent (this,MyTechnologyResult.class);
            intent.putExtra("typeMaterialSelected", typeMaterialSelected);
            intent.putExtra("fullNameMaterial", fullNameMaterial);
            intent.putExtra("stockSelected", stockSelected);
            intent.putExtra("operationSelected", operationSelected);
            startActivity(intent);
    }
}
