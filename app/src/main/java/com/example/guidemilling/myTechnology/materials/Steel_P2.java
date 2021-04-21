package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

public class Steel_P2 extends Material {

    public Steel_P2() {
        this.type = "P2";
        this.nameMaterial = "Medium/High Carbon Steels";

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
        this.feedsPerToothMilling.put(1, 0.012f);
        this.feedsPerToothMilling.put(2, 0.0136f);
        this.feedsPerToothMilling.put(3, 0.0165f);
        this.feedsPerToothMilling.put(4, 0.017f);
        this.feedsPerToothMilling.put(5, 0.024f);
        this.feedsPerToothMilling.put(6, 0.032f);
        this.feedsPerToothMilling.put(8, 0.042f);
        this.feedsPerToothMilling.put(10, 0.05f);
        this.feedsPerToothMilling.put(12, 0.059f);
        this.feedsPerToothMilling.put(14, 0.073f);
        this.feedsPerToothMilling.put(16, 0.0785f);
        this.feedsPerToothMilling.put(18, 0.0853f);
        this.feedsPerToothMilling.put(20, 0.0895f);
    }

    public void initMapFeedsPerToothDrillingHss() {
        this.feedPerToothDrillingHss = new HashMap<>();
        this.feedPerToothDrillingHss.put(1, 0.032f);
        this.feedPerToothDrillingHss.put(2, 0.066f);
        this.feedPerToothDrillingHss.put(3, 0.102f);
        this.feedPerToothDrillingHss.put(4, 0.116f);
        this.feedPerToothDrillingHss.put(5, 0.130f);
        this.feedPerToothDrillingHss.put(6, 0.150f);
        this.feedPerToothDrillingHss.put(7, 0.170f);
        this.feedPerToothDrillingHss.put(8, 0.190f);
        this.feedPerToothDrillingHss.put(9, 0.209f);
        this.feedPerToothDrillingHss.put(10, 0.228f);
        this.feedPerToothDrillingHss.put(11, 0.236f);
        this.feedPerToothDrillingHss.put(12, 0.243f);
        this.feedPerToothDrillingHss.put(13, 0.252f);
        this.feedPerToothDrillingHss.put(14, 0.262f);
        this.feedPerToothDrillingHss.put(15, 0.271f);
        this.feedPerToothDrillingHss.put(16, 0.280f);
        this.feedPerToothDrillingHss.put(17, 0.290f);
        this.feedPerToothDrillingHss.put(18, 0.300f);
        this.feedPerToothDrillingHss.put(19, 0.310f);
        this.feedPerToothDrillingHss.put(20, 0.320f);
    }

    public void initCuttingSpeedsMilling() {
        this.maximumCuttingSpeedMilling = 190.0f;
        this.minimumCuttingSpeedMilling = 75.0f;
    }

    public void initCuttingSpeedsDrilling() {
        this.cuttingSpeedDrillingHss = 30.0f;
    }

    public void initCorrectionMilling() {
        this.sideMillingDepthCorrection = 0.7f;
        this.sideMillingWidthCorrection = 0.1f;
        this.slotMillingDepthCorrection = 0.2f;
    }

    public void initCorrectionDrilling() {
        this.peckDrillHssCorrection = 0.3f;
    }
}
