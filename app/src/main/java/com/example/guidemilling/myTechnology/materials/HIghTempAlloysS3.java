package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;


public class HIghTempAlloysS3 extends Material {

    public HIghTempAlloysS3() {
        this.type = "S3"; //
        this.nameMaterial = "Nickel-Based/Heat-Resistant Alloys";

        initMapFeedsPerToothMilling();
        initMapFeedsPerToothDrillingHss();
        initCuttingSpeedsMilling();
        initCuttingSpeedsDrilling();
        initCorrectionMilling();
        initCorrectionDrilling();
    }

    public void initMapFeedsPerToothMilling() {
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
    }

    public void initMapFeedsPerToothDrillingHss() {
        this.feedPerToothDrillingHss = new HashMap<>();
        this.feedPerToothDrillingHss.put(1, 0.012f);
        this.feedPerToothDrillingHss.put(2, 0.023f);
        this.feedPerToothDrillingHss.put(3, 0.029f);
        this.feedPerToothDrillingHss.put(4, 0.032f);
        this.feedPerToothDrillingHss.put(5, 0.036f);
        this.feedPerToothDrillingHss.put(6, 0.042f);
        this.feedPerToothDrillingHss.put(7, 0.048f);
        this.feedPerToothDrillingHss.put(8, 0.054f);
        this.feedPerToothDrillingHss.put(9, 0.058f);
        this.feedPerToothDrillingHss.put(10, 0.062f);
        this.feedPerToothDrillingHss.put(11, 0.066f);
        this.feedPerToothDrillingHss.put(12, 0.069f);
        this.feedPerToothDrillingHss.put(13, 0.073f);
        this.feedPerToothDrillingHss.put(14, 0.078f);
        this.feedPerToothDrillingHss.put(15, 0.082f);
        this.feedPerToothDrillingHss.put(16, 0.086f);
        this.feedPerToothDrillingHss.put(17, 0.092f);
        this.feedPerToothDrillingHss.put(18, 0.198f);
        this.feedPerToothDrillingHss.put(19, 0.104f);
        this.feedPerToothDrillingHss.put(20, 0.110f);
    }

    public void initCuttingSpeedsMilling() {
        this.maximumCuttingSpeedMilling = 80.0f;
        this.minimumCuttingSpeedMilling = 60.0f;
    }

    public void initCuttingSpeedsDrilling() {
        this.cuttingSpeedDrillingHss = 3.0f;
    }

    public void initCorrectionMilling() {
        this.sideMillingDepthCorrection = 0.42f;
        this.sideMillingWidthCorrection = 0.09f;
        this.slotMillingDepthCorrection = 0.12f;
    }

    public void initCorrectionDrilling() {
        this.peckDrillHssCorrection = 0.12f;
    }
}
