package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

public class Steel_P1 extends Material {


    public Steel_P1() {

        this.type="P1";
        this.nameMaterial="Low-Carbon Steels";

        initMapFeedsPerToothMilling();
        initCuttingSpeeds();
        initCorrection();

    }


    public void initMapFeedsPerToothMilling(){
        // HashMap ((float) key : tool diameter  , (float) value:  feed per tooth fz)

        this.feedsPerToothMilling=new HashMap<>();
        this.feedsPerToothMilling.put(1,0.012f);
        this.feedsPerToothMilling.put(2,0.0136f);
        this.feedsPerToothMilling.put(3, 0.0165f);
        this.feedsPerToothMilling.put(4,0.017f);
        this.feedsPerToothMilling.put(5,0.024f);
        this.feedsPerToothMilling.put(6,0.032f);
        this.feedsPerToothMilling.put(7, 0.037f);
        this.feedsPerToothMilling.put(8,0.042f);
        this.feedsPerToothMilling.put(9,0.046f);
        this.feedsPerToothMilling.put(10,0.05f);
        this.feedsPerToothMilling.put(11,0.0545f);
        this.feedsPerToothMilling.put(12,0.059f);
        this.feedsPerToothMilling.put(13,0.066f);
        this.feedsPerToothMilling.put(14,0.073f);
        this.feedsPerToothMilling.put(15,0.0757f);
        this.feedsPerToothMilling.put(16,0.0785f);
        this.feedsPerToothMilling.put(17,0.0819f);
        this.feedsPerToothMilling.put(18,0.0853f);
        this.feedsPerToothMilling.put(19,0.0887f);
        this.feedsPerToothMilling.put(20,0.0895f);
        this.feedsPerToothMilling.put(25,0.10325f);

    }

    public void initCuttingSpeeds(){

        this.maximumCuttingSpeedMilling =190.0f;
        this.minimumCuttingSpeedMilling =75.0f;
        this.cuttingSpeedDrillingHss=30.0f;

    }

    public void initCorrection(){
        this.sideMillingDepthCorrection =0.7f;
        this.sideMillingWidthCorrection =0.1f;
        this.slotMillingDepthCorrection =0.2f;
        this.peckDrillHssCorrection=0.3f;
    }


}
