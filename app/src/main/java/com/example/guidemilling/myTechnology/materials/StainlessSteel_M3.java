package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

public class StainlessSteel_M3 extends Material {

    public StainlessSteel_M3 () {

        this.type="M3";
        this.nameMaterial="Duplex Stainless Steel";

        initMapFeedsPerToothMilling();
        initMapFeedsPerToothDrillingHss();
        initCuttingSpeedsMilling();
        initCuttingSpeedsDrilling();
        initCorrectionMilling();
        initCorrectionDrilling();

    }

    public void initMapFeedsPerToothMilling() {

        // HashMap ((float) key : tool diameter  , (float) value:  feed per tooth fz)
        this.feedsPerToothMilling=new HashMap<>();
        this.feedsPerToothMilling.put(1,0.0084f);
        this.feedsPerToothMilling.put(2,0.012f);
        this.feedsPerToothMilling.put(3, 0.013f);
        this.feedsPerToothMilling.put(4,0.0173f);
        this.feedsPerToothMilling.put(5,0.0199f);
        this.feedsPerToothMilling.put(6,0.0229f);
        this.feedsPerToothMilling.put(8,0.029f);
        this.feedsPerToothMilling.put(10,0.0347f);
        this.feedsPerToothMilling.put(12,0.0375f);
        this.feedsPerToothMilling.put(14,0.0413f);
        this.feedsPerToothMilling.put(16,0.0436f);
        this.feedsPerToothMilling.put(18,0.0483f);
        this.feedsPerToothMilling.put(20,0.0496f);



    }

    public void initMapFeedsPerToothDrillingHss(){
        this.feedPerToothDrillingHss=new HashMap<>();
        this.feedPerToothDrillingHss.put(1,0.012f );
        this.feedPerToothDrillingHss.put(2,0.032f );
        this.feedPerToothDrillingHss.put(3,0.044f );
        this.feedPerToothDrillingHss.put(4,0.050f );
        this.feedPerToothDrillingHss.put(5,0.056f );
        this.feedPerToothDrillingHss.put(6,0.064f );
        this.feedPerToothDrillingHss.put(7,0.072f );
        this.feedPerToothDrillingHss.put(8,0.080f );
        this.feedPerToothDrillingHss.put(9,0.089f );
        this.feedPerToothDrillingHss.put(10,0.098f );
        this.feedPerToothDrillingHss.put(11,0.104f );
        this.feedPerToothDrillingHss.put(12,0.110f );
        this.feedPerToothDrillingHss.put(13,0.115f );
        this.feedPerToothDrillingHss.put(14,0.120f );
        this.feedPerToothDrillingHss.put(15,0.125f );
        this.feedPerToothDrillingHss.put(16,0.130f );
        this.feedPerToothDrillingHss.put(17,0.138f );
        this.feedPerToothDrillingHss.put(18,0.145f );
        this.feedPerToothDrillingHss.put(19,0.154f );
        this.feedPerToothDrillingHss.put(20,0.160f );
    }

    public void   initCuttingSpeedsMilling(){
        this.maximumCuttingSpeedMilling =70.0f;
        this.minimumCuttingSpeedMilling =60.0f;
    }

    public void initCuttingSpeedsDrilling() {
        this.cuttingSpeedDrillingHss=9.0f;
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
