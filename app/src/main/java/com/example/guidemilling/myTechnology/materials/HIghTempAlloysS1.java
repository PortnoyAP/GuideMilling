package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

public class HIghTempAlloysS1 extends Material {

    public HIghTempAlloysS1() {

        this.sideMillingDepthCorrection =0.21f;
        this.sideMillingWidthCorrection =0.03f;
        this.slotMillingDepthCorrection =0.06f;

        this.maximumCuttingSpeedMilling = 90.0f;
        this.minimumCuttingSpeedMilling = 50.0f;

        this.type = "S1";
        this.nameMaterial="Iron-Based/Heat-Resistant Alloys";

        // HashMap ((float) key : tool diameter  , (float) value:  feed per tooth fz)
        this.feedsPerToothMilling = new HashMap<>();

        this.feedsPerToothMilling.put(1, 0.0106f);
        this.feedsPerToothMilling.put(2, 0.0135f);
        this.feedsPerToothMilling.put(3, 0.0163f);
        this.feedsPerToothMilling.put(4, 0.0192f);
        this.feedsPerToothMilling.put(5, 0.0237f);
        this.feedsPerToothMilling.put(6, 0.0296f);
        this.feedsPerToothMilling.put(8, 0.0395f);
        this.feedsPerToothMilling.put(10, 0.0447f);
        this.feedsPerToothMilling.put(12, 0.0505f);
        this.feedsPerToothMilling.put(14, 0.0578f);
        this.feedsPerToothMilling.put(16, 0.0612f);
        this.feedsPerToothMilling.put(18, 0.0660f);
        this.feedsPerToothMilling.put(20, 0.0726f);
        this.feedsPerToothMilling.put(25, 0.0840f);

    }
}
