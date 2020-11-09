package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

public class HardenedMaterialsH1 extends  Material {

    public HardenedMaterialsH1() {

        this.type = "H1"; //
        this.nameMaterial="Hardened Materials";

        initMapFeedsPerToothMilling();
        initMapFeedsPerToothDrillingHss();
        initCuttingSpeedsMilling();
        initCuttingSpeedsDrilling();
        initCorrectionMilling();
        initCorrectionDrilling();

    }

    public void initMapFeedsPerToothMilling(){

        // HashMap ((float) key : tool diameter  , (float) value:  feed per tooth fz)
        this.feedsPerToothMilling = new HashMap<>();
        this.feedsPerToothMilling.put(1, 0.0127f);
        this.feedsPerToothMilling.put(2, 0.0147f);
        this.feedsPerToothMilling.put(3, 0.0172f);
        this.feedsPerToothMilling.put(4, 0.0187f);
        this.feedsPerToothMilling.put(5, 0.0237f);
        this.feedsPerToothMilling.put(6, 0.0256f);
        this.feedsPerToothMilling.put(8, 0.0338f);
        this.feedsPerToothMilling.put(10, 0.0401f);
        this.feedsPerToothMilling.put(12, 0.0442f);
        this.feedsPerToothMilling.put(14, 0.0497f);
        this.feedsPerToothMilling.put(16, 0.0549f);
        this.feedsPerToothMilling.put(18, 0.0575f);
        this.feedsPerToothMilling.put(20, 0.0620f);
    }

    public void initMapFeedsPerToothDrillingHss(){
        this.feedPerToothDrillingHss=new HashMap<>();
        this.feedPerToothDrillingHss.put(1,0.015f );
        this.feedPerToothDrillingHss.put(2,0.038f );
        this.feedPerToothDrillingHss.put(3,0.053f );
        this.feedPerToothDrillingHss.put(4,0.060f );
        this.feedPerToothDrillingHss.put(5,0.068f );
        this.feedPerToothDrillingHss.put(6,0.078f );
        this.feedPerToothDrillingHss.put(7,0.088f );
        this.feedPerToothDrillingHss.put(8,0.098f );
        this.feedPerToothDrillingHss.put(9,0.109f );
        this.feedPerToothDrillingHss.put(10,0.119f );
        this.feedPerToothDrillingHss.put(11,0.125f );
        this.feedPerToothDrillingHss.put(12,0.130f );
        this.feedPerToothDrillingHss.put(13,0.136f );
        this.feedPerToothDrillingHss.put(14,0.143f );
        this.feedPerToothDrillingHss.put(15,0.149f );
        this.feedPerToothDrillingHss.put(16,0.155f );
        this.feedPerToothDrillingHss.put(17,0.163f );
        this.feedPerToothDrillingHss.put(18,0.172f );
        this.feedPerToothDrillingHss.put(19,0.180f );
        this.feedPerToothDrillingHss.put(20,0.188f );
    }

    public void initCuttingSpeedsMilling(){
        this.maximumCuttingSpeedMilling = 140.0f;
        this.minimumCuttingSpeedMilling = 80.0f;
    }

    public void initCuttingSpeedsDrilling(){
        this.cuttingSpeedDrillingHss=8.1f;
    }

    public void initCorrectionMilling(){
        this.sideMillingDepthCorrection =0.55f;
        this.sideMillingWidthCorrection =0.08f;
        this.slotMillingDepthCorrection =0.16f;
    }

    public void initCorrectionDrilling(){
        this.peckDrillHssCorrection=0.1f;
    }


}
