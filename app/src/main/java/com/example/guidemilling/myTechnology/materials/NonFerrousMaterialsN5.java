package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

public class NonFerrousMaterialsN5 extends Material {

    public NonFerrousMaterialsN5() {

        this.type="N5";
        this.nameMaterial="Nylon/Plastic/Rubbers/Phenolics/Resins/Fibreglass";

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

        this.feedsPerToothMilling.put(1,0.0212f);
        this.feedsPerToothMilling.put(2,0.0219f);
        this.feedsPerToothMilling.put(3,0.0263f);
        this.feedsPerToothMilling.put(4,0.0291f);
        this.feedsPerToothMilling.put(5,0.0348f);
        this.feedsPerToothMilling.put(6,0.0399f);
        this.feedsPerToothMilling.put(8,0.0531f);
        this.feedsPerToothMilling.put(10,0.0649f);
        this.feedsPerToothMilling.put(12,0.0758f);
        this.feedsPerToothMilling.put(14,0.0865f);
        this.feedsPerToothMilling.put(16,0.0970f);
        this.feedsPerToothMilling.put(18,0.1141f);
        this.feedsPerToothMilling.put(20,0.1170f);

    }

    public void initMapFeedsPerToothDrillingHss(){
        this.feedPerToothDrillingHss=new HashMap<>();
        this.feedPerToothDrillingHss.put(1,0.021f );
        this.feedPerToothDrillingHss.put(2,0.084f );
        this.feedPerToothDrillingHss.put(3,0.135f );
        this.feedPerToothDrillingHss.put(4,0.152f );
        this.feedPerToothDrillingHss.put(5,0.170f );
        this.feedPerToothDrillingHss.put(6,0.197f );
        this.feedPerToothDrillingHss.put(7,0.224f );
        this.feedPerToothDrillingHss.put(8,0.250f );
        this.feedPerToothDrillingHss.put(9,0.274f );
        this.feedPerToothDrillingHss.put(10,0.298f );
        this.feedPerToothDrillingHss.put(11,0.307f );
        this.feedPerToothDrillingHss.put(12,0.315f );
        this.feedPerToothDrillingHss.put(13,0.326f );
        this.feedPerToothDrillingHss.put(14,0.338f );
        this.feedPerToothDrillingHss.put(15,0.349f );
        this.feedPerToothDrillingHss.put(16,0.360f );
        this.feedPerToothDrillingHss.put(17,0.371f );
        this.feedPerToothDrillingHss.put(18,0.383f );
        this.feedPerToothDrillingHss.put(19,0.394f );
        this.feedPerToothDrillingHss.put(20,0.405f );

    }

    public void initCuttingSpeedsMilling(){

        this.maximumCuttingSpeedMilling =1000.0f;
        this.minimumCuttingSpeedMilling =250.0f;

    }

    public void initCuttingSpeedsDrilling(){
        this.cuttingSpeedDrillingHss=30.0f;
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
