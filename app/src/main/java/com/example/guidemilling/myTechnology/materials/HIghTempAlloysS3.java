package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;


public class HIghTempAlloysS3 extends Material {

    public HIghTempAlloysS3() {

        this.sideMillingDepthCorrection =0.42f;
        this.sideMillingWidthCorrection =0.09f;
        this.slotMillingDepthCorrection =0.12f;

        this.maximumCuttingSpeedMilling = 80.0f;
        this.minimumCuttingSpeedMilling = 60.0f;

        this.type = "S3"; //
        this.nameMaterial="Nickel-Based/Heat-Resistant Alloys";

        // HashMap ((float) key : tool diameter  , (float) value:  feed per tooth fz)
        this.feedsPerToothMilling = new HashMap<>();

        this.feedsPerToothMilling.put(1, 0.0111f);
        this.feedsPerToothMilling.put(2, 0.0134f);
        this.feedsPerToothMilling.put(3, 0.0152f);
        this.feedsPerToothMilling.put(4, 0.0170f);
        this.feedsPerToothMilling.put(5, 0.0206f);
        this.feedsPerToothMilling.put(6, 0.0251f);
        this.feedsPerToothMilling.put(8, 0.0319f);
        this.feedsPerToothMilling.put(10, 0.0370f);
        this.feedsPerToothMilling.put(12, 0.0418f);
        this.feedsPerToothMilling.put(14, 0.0477f);
        this.feedsPerToothMilling.put(16, 0.0504f);
        this.feedsPerToothMilling.put(18, 0.0550f);
        this.feedsPerToothMilling.put(20, 0.0596f);
        this.feedsPerToothMilling.put(25, 0.0688f);

    }

}
