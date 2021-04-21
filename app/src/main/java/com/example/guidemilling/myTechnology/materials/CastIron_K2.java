package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

public class CastIron_K2 extends Material {

    //High-Strength Austentic Stainless and Cast Stainless Steels

    public CastIron_K2() {
        this.type = "K2";
        this.nameMaterial = "Low/Medium-Strength Ductile Irons/CGI";

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
        this.feedsPerToothMilling.put(1, 0.007f);
        this.feedsPerToothMilling.put(2, 0.0109f);
        this.feedsPerToothMilling.put(3, 0.0148f);
        this.feedsPerToothMilling.put(4, 0.0181f);
        this.feedsPerToothMilling.put(5, 0.0229f);
        this.feedsPerToothMilling.put(6, 0.0278f);
        this.feedsPerToothMilling.put(8, 0.0396f);
        this.feedsPerToothMilling.put(10, 0.0444f);
        this.feedsPerToothMilling.put(12, 0.0520f);
        this.feedsPerToothMilling.put(14, 0.056f);
        this.feedsPerToothMilling.put(16, 0.060f);
        this.feedsPerToothMilling.put(18, 0.069f);
        this.feedsPerToothMilling.put(20, 0.0743f);
    }

    public void initMapFeedsPerToothDrillingHss() {
        this.feedPerToothDrillingHss = new HashMap<>();
        this.feedPerToothDrillingHss.put(1, 0.016f);
        this.feedPerToothDrillingHss.put(2, 0.043f);
        this.feedPerToothDrillingHss.put(3, 0.062f);
        this.feedPerToothDrillingHss.put(4, 0.071f);
        this.feedPerToothDrillingHss.put(5, 0.080f);
        this.feedPerToothDrillingHss.put(6, 0.092f);
        this.feedPerToothDrillingHss.put(7, 0.104f);
        this.feedPerToothDrillingHss.put(8, 0.115f);
        this.feedPerToothDrillingHss.put(9, 0.128f);
        this.feedPerToothDrillingHss.put(10, 0.140f);
        this.feedPerToothDrillingHss.put(11, 0.145f);
        this.feedPerToothDrillingHss.put(12, 0.150f);
        this.feedPerToothDrillingHss.put(13, 0.158f);
        this.feedPerToothDrillingHss.put(14, 0.165f);
        this.feedPerToothDrillingHss.put(15, 0.173f);
        this.feedPerToothDrillingHss.put(16, 0.180f);
        this.feedPerToothDrillingHss.put(17, 0.189f);
        this.feedPerToothDrillingHss.put(18, 0.198f);
        this.feedPerToothDrillingHss.put(19, 0.206f);
        this.feedPerToothDrillingHss.put(20, 0.215f);
    }

    public void initCuttingSpeedsMilling() {
        this.maximumCuttingSpeedMilling = 120.0f;
        this.minimumCuttingSpeedMilling = 100.0f;
    }

    public void initCuttingSpeedsDrilling() {
        this.cuttingSpeedDrillingHss = 20.0f;
    }

    public void initCorrectionMilling() {
        this.sideMillingDepthCorrection = 0.7f;
        this.sideMillingWidthCorrection = 0.1f;
        this.slotMillingDepthCorrection = 0.2f;
    }

    public void initCorrectionDrilling() {
        this.peckDrillHssCorrection = 0.27f;
    }
}
