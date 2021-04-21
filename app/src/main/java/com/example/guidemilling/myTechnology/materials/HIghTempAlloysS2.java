package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

public class HIghTempAlloysS2 extends Material {

    public HIghTempAlloysS2() {
        this.type = "S2"; // s
        this.nameMaterial = "Cobalt-Based,Heat-Resistant Alloy";

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
        this.feedsPerToothMilling.put(1, 0.0073f);
        this.feedsPerToothMilling.put(2, 0.0090f);
        this.feedsPerToothMilling.put(3, 0.0107f);
        this.feedsPerToothMilling.put(4, 0.0113f);
        this.feedsPerToothMilling.put(5, 0.0152f);
        this.feedsPerToothMilling.put(6, 0.0180f);
        this.feedsPerToothMilling.put(8, 0.0229f);
        this.feedsPerToothMilling.put(10, 0.0268f);
        this.feedsPerToothMilling.put(12, 0.0303f);
        this.feedsPerToothMilling.put(14, 0.0328f);
        this.feedsPerToothMilling.put(16, 0.0362f);
        this.feedsPerToothMilling.put(18, 0.0396f);
        this.feedsPerToothMilling.put(20, 0.0430f);
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
        this.maximumCuttingSpeedMilling = 40.0f;
        this.minimumCuttingSpeedMilling = 25.0f;
    }

    public void initCuttingSpeedsDrilling() {
        this.cuttingSpeedDrillingHss = 3.0f;
    }

    public void initCorrectionMilling() {
        this.sideMillingDepthCorrection = 0.21f;
        this.sideMillingWidthCorrection = 0.03f;
        this.slotMillingDepthCorrection = 0.06f;
    }

    public void initCorrectionDrilling() {
        this.peckDrillHssCorrection = 0.12f;
    }
}
