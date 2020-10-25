package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

public class NonFerrousMaterialsN2 extends Material {


    public NonFerrousMaterialsN2() {

        this.sideMillingDepthCorrection =1.0f;
        this.sideMillingWidthCorrection =0.5f;
        this.slotMillingDepthCorrection =0.7f;

        this.maximumCuttingSpeedMilling =1500.0f;
        this.minimumCuttingSpeedMilling =500.0f;
        this.type="N2";
        this.nameMaterial="Low-Silicon Aluminium Alloys/Magnesium Alloys";

        // HashMap ((float) key : tool diameter  , (float) value:  feed per tooth fz)
        this.feedsPerToothMilling=new HashMap<>();

        this.feedsPerToothMilling.put(1,0.0189f);
        this.feedsPerToothMilling.put(2,0.0196f);
        this.feedsPerToothMilling.put(3,0.024f);
        this.feedsPerToothMilling.put(4,0.0269f);
        this.feedsPerToothMilling.put(5,0.0313f);
        this.feedsPerToothMilling.put(6,0.0366f);
        this.feedsPerToothMilling.put(8,0.0465f);
        this.feedsPerToothMilling.put(10,0.0554f);
        this.feedsPerToothMilling.put(12,0.0669f);
        this.feedsPerToothMilling.put(14,0.076f);
        this.feedsPerToothMilling.put(16,0.0874f);
        this.feedsPerToothMilling.put(18,0.1012f);
        this.feedsPerToothMilling.put(20,0.109f);
        this.feedsPerToothMilling.put(25,0.1285f);



    }
}
