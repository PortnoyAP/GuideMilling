package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

public class NonFerrousMaterialsN4 extends Material {


    public NonFerrousMaterialsN4() {

        this.type="N4";
        this.nameMaterial="Cooper/Brass/Zinc";

        initMapFeedsPerToothMilling();
        initMapFeedsPerToothDrillingHss();
        initCuttingSpeedsMilling();
        initCuttingSpeedsDrilling();
        initCorrectionMilling();
        initCorrectionDrilling();

    }

    public void initMapFeedsPerToothMilling(){
        // HashMap ((float) key : tool diameter  , (float) value:  feed per tooth fz)
        this.feedsPerToothMilling=new HashMap<>();

        this.feedsPerToothMilling.put(1,0.0166f);
        this.feedsPerToothMilling.put(2,0.0173f);
        this.feedsPerToothMilling.put(3,0.0213f);
        this.feedsPerToothMilling.put(4,0.0243f);
        this.feedsPerToothMilling.put(5,0.0283f);
        this.feedsPerToothMilling.put(6,0.0329f);
        this.feedsPerToothMilling.put(8,0.0430f);
        this.feedsPerToothMilling.put(10,0.0534f);
        this.feedsPerToothMilling.put(12,0.0608f);
        this.feedsPerToothMilling.put(14,0.0673f);
        this.feedsPerToothMilling.put(16,0.0841f);
        this.feedsPerToothMilling.put(18,0.0953f);
        this.feedsPerToothMilling.put(20,0.147f);


    }

    public void initMapFeedsPerToothDrillingHss(){
        this.feedPerToothDrillingHss=new HashMap<>();
        this.feedPerToothDrillingHss.put(1,0.020f );
        this.feedPerToothDrillingHss.put(2,0.076f );
        this.feedPerToothDrillingHss.put(3,0.119f );
        this.feedPerToothDrillingHss.put(4,0.134f );
        this.feedPerToothDrillingHss.put(5,0.150f );
        this.feedPerToothDrillingHss.put(6,0.173f );
        this.feedPerToothDrillingHss.put(7,0.197f );
        this.feedPerToothDrillingHss.put(8,0.220f );
        this.feedPerToothDrillingHss.put(9,0.243f );
        this.feedPerToothDrillingHss.put(10,0.265f );
        this.feedPerToothDrillingHss.put(11,0.273f );
        this.feedPerToothDrillingHss.put(12,0.280f );
        this.feedPerToothDrillingHss.put(13,0.290f );
        this.feedPerToothDrillingHss.put(14,0.300f );
        this.feedPerToothDrillingHss.put(15,0.310f );
        this.feedPerToothDrillingHss.put(16,0.320f );
        this.feedPerToothDrillingHss.put(17,0.330f );
        this.feedPerToothDrillingHss.put(18,0.340f );
        this.feedPerToothDrillingHss.put(19,0.350f );
        this.feedPerToothDrillingHss.put(20,0.360f );

    }

    public void initCuttingSpeedsMilling(){

        this.maximumCuttingSpeedMilling =750.0f;
        this.minimumCuttingSpeedMilling =400.0f;


    }

    public void initCuttingSpeedsDrilling(){
        this.cuttingSpeedDrillingHss=35.0f;
    }

    public void initCorrectionMilling(){
        this.sideMillingDepthCorrection =1.0f;
        this.sideMillingWidthCorrection =0.5f;
        this.slotMillingDepthCorrection =0.7f;

    }

    public void initCorrectionDrilling(){
        this.peckDrillHssCorrection=0.4f;
    }








}
