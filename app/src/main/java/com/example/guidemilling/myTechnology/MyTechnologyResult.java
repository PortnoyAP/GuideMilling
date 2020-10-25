package com.example.guidemilling.myTechnology;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.guidemilling.MainMenu;
import com.example.guidemilling.R;


public class MyTechnologyResult extends AppCompatActivity {

    private final static  byte INCREASE_STEP=2;
    private final static byte MAXIMAL_DIAMETER=16;
    private final static byte MINIMAL_DIAMETER=8;

    private  JobCreator job = new JobCreator();

    private String typeMaterialFromUser;
    private String fullNameMaterialFromUser;
    private String stockFromUser;
    private String operationFromUser;

    private TextView tv_materialType;
    private TextView tv_operationType;
    private TextView tv_tool;
    private TextView tv_spindleSpeedMax;
    private TextView tv_spindleSpeedMin;
    private TextView tv_FeedMax;
    private TextView tv_FeedMin;
    private TextView tv_sideMillingWidth;
    private TextView tv_sideMillingDepth;
    private TextView tv_slotMillingDepth;
    private TextView tv_recommendation;
    private TextView tv_stockRecommendation;

    private Button firstRecommendation;
    private Button secondRecommendation;
    private Button more;
    private Button less;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_technology_result2);
        initNewJob();
        init();
    }


    public void initNewJob() {

        typeMaterialFromUser = getIntent().getStringExtra("typeMaterialSelected");
        fullNameMaterialFromUser = getIntent().getStringExtra("fullNameMaterial");
        operationFromUser = getIntent().getStringExtra("operationSelected");
        stockFromUser = getIntent().getStringExtra("stockSelected");

        Toast.makeText(this, ""+fullNameMaterialFromUser, Toast.LENGTH_SHORT).show();

        job = new JobCreator(fullNameMaterialFromUser, operationFromUser, 10);

    }


    public void init(){
        tv_materialType=findViewById(R.id.tv_materialType);
        tv_materialType.setText(fullNameMaterialFromUser);

        tv_operationType = findViewById(R.id.tv_operationType);
        tv_operationType.setText(operationFromUser);

        tv_tool = findViewById(R.id.tv_tool_Diametr);

        tv_slotMillingDepth=findViewById(R.id.tv_slot_milling_depth);
        tv_sideMillingWidth=findViewById(R.id.tv_side_milling_width);
        tv_sideMillingDepth=findViewById(R.id.tv_side_milling_depth);

        more=findViewById(R.id.buttonMore);
        less=findViewById(R.id.button_less);

        tv_spindleSpeedMax = findViewById(R.id.tv_spindel_speed_max);
        tv_spindleSpeedMin = findViewById(R.id.tv_spindel_speed_min);
        tv_FeedMax = findViewById(R.id.tv_feed_max);
        tv_FeedMin = findViewById(R.id.tv_feed_min);

        tv_recommendation =findViewById(R.id.tv_recomendation);
        tv_stockRecommendation=findViewById(R.id.tv_stock_recomendation);

        firstRecommendation = findViewById(R.id.buttonFirstOption);
        secondRecommendation = findViewById(R.id.buttonSecondOption);


        switch (operationFromUser){
            case "Side Milling":
                tv_sideMillingWidth.setText("Max.Width: "+String.valueOf(job.getMaterial().calculateSideMillingWidth(job.getTool().getDiameter()))+"mm");
                tv_sideMillingDepth.setText("Max.Depth: "+String.valueOf(job.getMaterial().calculateSideMillingDepth(job.getTool().getDiameter()))+"mm");
                tv_tool.setText("Tool Diameter :"+String.valueOf(job.getTool().getDiameter()));
                tv_spindleSpeedMax.setText("  Max :"+String.valueOf(job.getMaterial().calculateMillingSpindleSpeedMaximum(job.getTool().getDiameter())));
                tv_spindleSpeedMin.setText("  Min :"+String.valueOf(job.getMaterial().calculateMillingSpindleSpeedMinimum(job.getTool().getDiameter())));
                tv_FeedMax.setText("  Max :"+String.valueOf(job.getMaterial().calculateMillingFeedMaximum(job.getTool().getNumberTooth(),job.getTool().getDiameter() )));
                tv_FeedMin.setText("  Min :"+String.valueOf(job.getMaterial().calculateMillingFeedMinimum(job.getTool().getNumberTooth(),job.getTool().getDiameter() )));
                break;

            case "Slot Milling":

                tv_slotMillingDepth.setText("Max.Width: "+String.valueOf(job.getMaterial().calculateSlotMillingDepth(job.getTool().getDiameter()))+"mm");
                tv_tool.setText("Tool Diameter :"+String.valueOf(job.getTool().getDiameter()));
                tv_spindleSpeedMax.setText("  Max :"+String.valueOf(job.getMaterial().calculateMillingSpindleSpeedMaximum(job.getTool().getDiameter())));
                tv_spindleSpeedMin.setText("  Min :"+String.valueOf(job.getMaterial().calculateMillingSpindleSpeedMinimum(job.getTool().getDiameter())));
                tv_FeedMax.setText("  Max :"+String.valueOf(job.getMaterial().calculateMillingFeedMaximum(job.getTool().getNumberTooth(),job.getTool().getDiameter() )));
                tv_FeedMin.setText("  Min :"+String.valueOf(job.getMaterial().calculateMillingFeedMinimum(job.getTool().getNumberTooth(),job.getTool().getDiameter() )));
                break;

            case "Drill":
                tv_slotMillingDepth.setText("Peck:  "+job.getMaterial().calculatePeckDepthHss(job.getTool().getDiameter())+"mm");
                tv_tool.setText("Tool Diameter :"+String.valueOf(job.getTool().getDiameter()));
                tv_spindleSpeedMin.setText(" :"+String.valueOf(job.getMaterial().calculateDrillHssSpindleSpeed(job.getTool().getDiameter())));
                tv_FeedMin.setText(" :"+String.valueOf(job.getMaterial().calculateDrillingFeed(job.getTool().getNumberTooth())));
                tv_FeedMax.setText("");
                tv_spindleSpeedMax.setText("");
                break;



            default:
                break;
        }  // for sppeds/feed/deeps/peecks  for operation


        switch(stockFromUser){
            case "Big":

                tv_stockRecommendation.setText(R.string.big_stock);
                break;

            case "Small":
                tv_stockRecommendation.setText(R.string.small_stock);
                break;

            case "Cylinder":
                tv_stockRecommendation.setText(R.string.cylinder_stock);
                break;

            case "Thin Wide":
                tv_stockRecommendation.setText(R.string.thin_wide_stock);
                break;

            case "Thin Narrow":
                tv_stockRecommendation.setText(R.string.thin_narrow_stock);
                break;


            default:
                break;

        }  // for clamping recommendation




    }

    public void onClickHomeScreen(View view) {
        Intent intent=new Intent(this, MainMenu.class);
        startActivity(intent);

    }

    public void onClickSelectorScreen(View view) {
        Intent intent=new Intent(this,MyTechnologySelector.class);
        startActivity(intent);
    }

    public void onClickIncreaseDiameter(View view) {
        int currentDiameter=job.getTool().getDiameter();
        if(currentDiameter<MAXIMAL_DIAMETER){
                currentDiameter+=INCREASE_STEP;
                    if(currentDiameter==14){
                        currentDiameter+=INCREASE_STEP;
                    }
                job.getTool().setDiameter(currentDiameter);
        }
        init();
    }

    public void onClickReduceDiameter(View view) {
        int currentDiameter=job.getTool().getDiameter();
        if(currentDiameter>MINIMAL_DIAMETER){
            currentDiameter-=INCREASE_STEP;
                if(currentDiameter==14){
                    currentDiameter-=INCREASE_STEP;
                }
            job.getTool().setDiameter(currentDiameter);
        }
        init();


    }

    public void onClickShowFirstOption(View view) {
        tv_recommendation.setText(job.getMaterial().getFirstRecommendationForMilling());

    }

    public void onClickShowSecondOption(View view) {
        tv_recommendation.setText(job.getMaterial().getSecondRecommendationForMilling());

    }
}
