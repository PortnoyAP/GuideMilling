package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

public class NonFerrousMaterialsN6 extends Material {


    public NonFerrousMaterialsN6() {

        this.type="N6";
        this.nameMaterial="Carbon/Graphite/Composites/CFRP";

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

        this.feedsPerToothMilling.put(1,0.0236f);
        this.feedsPerToothMilling.put(2,0.0243f);
        this.feedsPerToothMilling.put(3,0.0285f);
        this.feedsPerToothMilling.put(4,0.0313f);
        this.feedsPerToothMilling.put(5,0.0377f);
        this.feedsPerToothMilling.put(6,0.0441f);
        this.feedsPerToothMilling.put(8,0.0560f);
        this.feedsPerToothMilling.put(10,0.0684f);
        this.feedsPerToothMilling.put(12,0.0811f);
        this.feedsPerToothMilling.put(14,0.0931f);
        this.feedsPerToothMilling.put(16,0.1044f);
        this.feedsPerToothMilling.put(18,0.1258f);
        this.feedsPerToothMilling.put(20,0.1305f);
    }

    public void initMapFeedsPerToothDrillingHss(){
        this.feedPerToothDrillingHss=new HashMap<>();
        this.feedPerToothDrillingHss.put(1,0.022f );
        this.feedPerToothDrillingHss.put(2,0.050f );
        this.feedPerToothDrillingHss.put(3,0.073f );
        this.feedPerToothDrillingHss.put(4,0.084f );
        this.feedPerToothDrillingHss.put(5,0.095f );
        this.feedPerToothDrillingHss.put(6,0.109f );
        this.feedPerToothDrillingHss.put(7,0.124f );
        this.feedPerToothDrillingHss.put(8,0.138f );
        this.feedPerToothDrillingHss.put(9,0.152f );
        this.feedPerToothDrillingHss.put(10,0.165f );
        this.feedPerToothDrillingHss.put(11,0.172f );
        this.feedPerToothDrillingHss.put(12,0.178f );
        this.feedPerToothDrillingHss.put(13,0.186f );
        this.feedPerToothDrillingHss.put(14,0.194f );
        this.feedPerToothDrillingHss.put(15,0.202f );
        this.feedPerToothDrillingHss.put(16,0.210f );
        this.feedPerToothDrillingHss.put(17,0.220f );
        this.feedPerToothDrillingHss.put(18,0.229f );
        this.feedPerToothDrillingHss.put(19,0.239f );
        this.feedPerToothDrillingHss.put(20,0.248f );
    }

    public void   initCuttingSpeedsMilling(){
        this.maximumCuttingSpeedMilling =750.0f;
        this.minimumCuttingSpeedMilling =100.0f;
    }

    public void initCuttingSpeedsDrilling(){
        this.cuttingSpeedDrillingHss=14.0f;
    }

    public void initCorrectionMilling(){
        this.sideMillingDepthCorrection =1.0f;
        this.sideMillingWidthCorrection =0.5f;
        this.slotMillingDepthCorrection =0.7f;;

    }


    public void initCorrectionDrilling(){
        this.peckDrillHssCorrection=0.4f;
    }











}
