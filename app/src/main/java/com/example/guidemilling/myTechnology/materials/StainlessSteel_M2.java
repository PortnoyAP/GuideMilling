package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

public class StainlessSteel_M2 extends Material {

    //High-Strenght Austentic Stainless Steel and Stainless Steels


    public StainlessSteel_M2() {

        this.type = "M2";
        this.nameMaterial = "High  Strength/Cast Stainless Steel";

        initMapFeedsPerToothMilling();
        initMapFeedsPerToothDrillingHss();
        initCuttingSpeedsMilling();
        initCuttingSpeedsDrilling();
        initCorrectionMilling();
        initCorrectionDrilling();

    }

    public void initMapFeedsPerToothMilling() {

        // HashMap ((float) key : tool diameter  , (float) value:  feed per tooth fz)
        this.feedsPerToothMilling = new HashMap<>();
        this.feedsPerToothMilling.put(1, 0.008f);
        this.feedsPerToothMilling.put(2, 0.0115f);
        this.feedsPerToothMilling.put(3, 0.015f);
        this.feedsPerToothMilling.put(4, 0.0192f);
        this.feedsPerToothMilling.put(5, 0.0227f);
        this.feedsPerToothMilling.put(6, 0.0258f);
        this.feedsPerToothMilling.put(8, 0.0331f);
        this.feedsPerToothMilling.put(10, 0.0385f);
        this.feedsPerToothMilling.put(12, 0.0439f);
        this.feedsPerToothMilling.put(14, 0.0489f);
        this.feedsPerToothMilling.put(16, 0.0519f);
        this.feedsPerToothMilling.put(18, 0.0577f);
        this.feedsPerToothMilling.put(20, 0.0603f);



    }

    public void initMapFeedsPerToothDrillingHss(){
        this.feedPerToothDrillingHss=new HashMap<>();
        this.feedPerToothDrillingHss.put(1,0.018f );
        this.feedPerToothDrillingHss.put(2,0.056f );
        this.feedPerToothDrillingHss.put(3,0.084f );
        this.feedPerToothDrillingHss.put(4,0.096f );
        this.feedPerToothDrillingHss.put(5,0.109f );
        this.feedPerToothDrillingHss.put(6,0.126f );
        this.feedPerToothDrillingHss.put(7,0.143f );
        this.feedPerToothDrillingHss.put(8,0.160f );
        this.feedPerToothDrillingHss.put(9,0.175f );
        this.feedPerToothDrillingHss.put(10,0.190f );
        this.feedPerToothDrillingHss.put(11,0.198f );
        this.feedPerToothDrillingHss.put(12,0.205f );
        this.feedPerToothDrillingHss.put(13,0.214f );
        this.feedPerToothDrillingHss.put(14,0.222f );
        this.feedPerToothDrillingHss.put(15,0.231f );
        this.feedPerToothDrillingHss.put(16,0.240f );
        this.feedPerToothDrillingHss.put(17,0.250f );
        this.feedPerToothDrillingHss.put(18,0.260f );
        this.feedPerToothDrillingHss.put(19,0.270f );
        this.feedPerToothDrillingHss.put(20,0.280f );
    }

    public void   initCuttingSpeedsMilling(){
        this.maximumCuttingSpeedMilling =80.0f;
        this.minimumCuttingSpeedMilling =60.0f;
    }

    public void initCuttingSpeedsDrilling() {
        this.cuttingSpeedDrillingHss=7.20f;
    }

    public void initCorrectionMilling(){
        this.sideMillingDepthCorrection =0.7f;
        this.sideMillingWidthCorrection =0.1f;
        this.slotMillingDepthCorrection =0.2f;
    }

    public void initCorrectionDrilling(){
        this.peckDrillHssCorrection=0.15f;
    }




}
