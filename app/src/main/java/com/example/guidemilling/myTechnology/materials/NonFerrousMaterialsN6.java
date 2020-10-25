package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

public class NonFerrousMaterialsN6 extends Material {


    public NonFerrousMaterialsN6() {

        this.sideMillingDepthCorrection =1.0f;
        this.sideMillingWidthCorrection =0.5f;
        this.slotMillingDepthCorrection =0.7f;
        this.maximumCuttingSpeedMilling =750.0f;
        this.minimumCuttingSpeedMilling =100.0f;
        this.type="N6";
        this.nameMaterial="Carbon/Graphite/Composites/CFRP";

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
        this.feedsPerToothMilling.put(25,0.1800f);



    }


}
