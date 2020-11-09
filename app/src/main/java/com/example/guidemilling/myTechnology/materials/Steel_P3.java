package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

public class Steel_P3 extends Material {


    public Steel_P3() {
        this.type = "P3";
        this.nameMaterial = "Alloy/Tool Steels";

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
        this.feedsPerToothMilling.put(1,0.01f);
        this.feedsPerToothMilling.put(2,0.013f);
        this.feedsPerToothMilling.put(3, 0.016f);
        this.feedsPerToothMilling.put(4,0.018f);
        this.feedsPerToothMilling.put(5,0.021f);
        this.feedsPerToothMilling.put(6,0.024f);
        this.feedsPerToothMilling.put(8,0.0345f);
        this.feedsPerToothMilling.put(10,0.0408f);
        this.feedsPerToothMilling.put(12,0.053f);
        this.feedsPerToothMilling.put(14,0.058f);
        this.feedsPerToothMilling.put(16,0.0625f);
        this.feedsPerToothMilling.put(18,0.0668f);
        this.feedsPerToothMilling.put(20,0.074f);
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
        this.maximumCuttingSpeedMilling =160.0f;
        this.minimumCuttingSpeedMilling =90.0f;
    }


    public void initCuttingSpeedsDrilling(){
        this.cuttingSpeedDrillingHss=25.0f;
    }

    public void initCorrectionMilling(){
        this.sideMillingDepthCorrection =0.7f;
        this.sideMillingWidthCorrection =0.1f;
        this.slotMillingDepthCorrection =0.2f;

    }

    public void initCorrectionDrilling(){
        this.peckDrillHssCorrection=0.3f;
    }

































    }

