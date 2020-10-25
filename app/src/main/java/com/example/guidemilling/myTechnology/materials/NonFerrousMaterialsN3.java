package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

public class NonFerrousMaterialsN3 extends Material {


    public NonFerrousMaterialsN3() {

        this.sideMillingDepthCorrection =1.0f;
        this.sideMillingWidthCorrection =0.5f;
        this.slotMillingDepthCorrection =0.7f;
        this.maximumCuttingSpeedMilling =1500.0f;
        this.minimumCuttingSpeedMilling =500.0f;
        this.type="N3";
        this.nameMaterial="High-Silicon Aluminium Alloys/Magnesium Alloys";

        // HashMap ((float) key : tool diameter  , (float) value:  feed per tooth fz)
        this.feedsPerToothMilling=new HashMap<>();
        this.feedsPerToothMilling.put(1,0.0166f);
        this.feedsPerToothMilling.put(2,0.0173f);
        this.feedsPerToothMilling.put(3,0.0213f);
        this.feedsPerToothMilling.put(4,0.0243f);
        this.feedsPerToothMilling.put(5,0.0283f);
        this.feedsPerToothMilling.put(6,0.0321f);
        this.feedsPerToothMilling.put(8,0.0404f);
        this.feedsPerToothMilling.put(10,0.0500f);
        this.feedsPerToothMilling.put(12,0.0577f);
        this.feedsPerToothMilling.put(14,0.0658f);
        this.feedsPerToothMilling.put(16,0.0751f);
        this.feedsPerToothMilling.put(18,0.0848f);
        this.feedsPerToothMilling.put(20,0.0925f);
        this.feedsPerToothMilling.put(25,0.1117f);



    }
}
