package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

public class NonFerrousMaterialsN4 extends Material {


    public NonFerrousMaterialsN4() {

        this.sideMillingDepthCorrection =1.0f;
        this.sideMillingWidthCorrection =0.5f;
        this.slotMillingDepthCorrection =0.7f;

        this.maximumCuttingSpeedMilling =750.0f;
        this.minimumCuttingSpeedMilling =400.0f;
        this.type="N4";
        this.nameMaterial="Cooper/Brass/Zinc";
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
        this.feedsPerToothMilling.put(25,0.276f);



    }

}
