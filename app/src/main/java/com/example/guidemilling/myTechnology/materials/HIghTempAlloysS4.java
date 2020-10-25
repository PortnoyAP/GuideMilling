package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

public class HIghTempAlloysS4 extends Material {

    public HIghTempAlloysS4() {


        this.sideMillingDepthCorrection =0.42f;
        this.sideMillingWidthCorrection =0.09f;
        this.slotMillingDepthCorrection =0.12f;

        this.maximumCuttingSpeedMilling = 60.0f;
        this.minimumCuttingSpeedMilling = 55.0f;

        this.type = "S4"; //
        this.nameMaterial="Titanium and Titanium  Alloys";

        // HashMap ((float) key : tool diameter  , (float) value:  feed per tooth fz)
        this.feedsPerToothMilling = new HashMap<>();

        this.feedsPerToothMilling.put(1, 0.0086f);
        this.feedsPerToothMilling.put(2, 0.01075f);
        this.feedsPerToothMilling.put(3, 0.0129f);
        this.feedsPerToothMilling.put(4, 0.0143f);
        this.feedsPerToothMilling.put(5, 0.0184f);
        this.feedsPerToothMilling.put(6, 0.0227f);
        this.feedsPerToothMilling.put(8, 0.0300f);
        this.feedsPerToothMilling.put(10, 0.0348f);
        this.feedsPerToothMilling.put(12, 0.0390f);
        this.feedsPerToothMilling.put(14, 0.0445f);
        this.feedsPerToothMilling.put(16, 0.0468f);
        this.feedsPerToothMilling.put(18, 0.0511f);
        this.feedsPerToothMilling.put(20, 0.0554f);
        this.feedsPerToothMilling.put(25, 0.0640f);

    }
}
