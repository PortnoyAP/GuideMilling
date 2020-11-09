package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

public class StainlessSteel_M1 extends Material {

    public StainlessSteel_M1 () {

        this.type="M1";
        this.nameMaterial="Austentic Stainless Steel";

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
        this.feedsPerToothMilling.put(1,0.0106f);
        this.feedsPerToothMilling.put(2,0.0148f);
        this.feedsPerToothMilling.put(3, 0.019f);
        this.feedsPerToothMilling.put(4,0.0221f);
        this.feedsPerToothMilling.put(5,0.0263f);
        this.feedsPerToothMilling.put(6,0.0305f);
        this.feedsPerToothMilling.put(8,0.0398f);
        this.feedsPerToothMilling.put(10,0.0470f);
        this.feedsPerToothMilling.put(12,0.0531f);
        this.feedsPerToothMilling.put(14,0.0595f);
        this.feedsPerToothMilling.put(16,0.0632f);
        this.feedsPerToothMilling.put(18,0.0699f);
        this.feedsPerToothMilling.put(20,0.0737f);
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
        this.cuttingSpeedDrillingHss=8.0f;
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
