package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

public class HIghTempAlloysS2 extends Material {

    public HIghTempAlloysS2() {

        this.sideMillingDepthCorrection =0.21f;
        this.sideMillingWidthCorrection =0.03f;
        this.slotMillingDepthCorrection =0.06f;

        this.maximumCuttingSpeedMilling = 40.0f;
        this.minimumCuttingSpeedMilling = 25.0f;

        this.type = "S1"; // s
        this.nameMaterial="Cobalt-Based,Heat-Resistant Alloy";

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
        this.feedsPerToothMilling.put(25, 0.0498f);

    }
}
