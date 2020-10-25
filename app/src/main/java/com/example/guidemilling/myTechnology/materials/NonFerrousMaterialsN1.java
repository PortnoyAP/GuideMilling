package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

public class NonFerrousMaterialsN1 extends Material {


    public NonFerrousMaterialsN1() {

        this.sideMillingDepthCorrection =1.0f;
        this.sideMillingWidthCorrection =0.5f;
        this.slotMillingDepthCorrection =0.7f;

        this.maximumCuttingSpeedMilling =2000.0f;
        this.minimumCuttingSpeedMilling =500.0f;
        this.type="N1";
        this.nameMaterial="Wrought Aluminium";

        // HashMap ((float) key : tool diameter  , (float) value:  feed per tooth fz)
        this.feedsPerToothMilling=new HashMap<>();

        this.feedsPerToothMilling.put(1,0.02f);
        this.feedsPerToothMilling.put(2,0.0243f);
        this.feedsPerToothMilling.put(3,0.0285f);
        this.feedsPerToothMilling.put(4,0.031f);
        this.feedsPerToothMilling.put(5,0.0377f);
        this.feedsPerToothMilling.put(6,0.0438f);
        this.feedsPerToothMilling.put(8,0.0563f);
        this.feedsPerToothMilling.put(10,0.0642f);
        this.feedsPerToothMilling.put(12,0.08f);
        this.feedsPerToothMilling.put(14,0.0931f);
        this.feedsPerToothMilling.put(16,0.1059f);
        this.feedsPerToothMilling.put(18,0.1182f);
        this.feedsPerToothMilling.put(20,0.1264f);
        this.feedsPerToothMilling.put(25,0.1469f);


    }
}
