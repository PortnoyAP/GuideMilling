package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

public class HardenedMaterialsH2 extends  Material {

    public HardenedMaterialsH2() {

        this.sideMillingDepthCorrection =0.55f;
        this.sideMillingWidthCorrection =0.08f;
        this.slotMillingDepthCorrection =0.16f;

        this.maximumCuttingSpeedMilling = 110.0f;
        this.minimumCuttingSpeedMilling = 70.0f;

        this.type = "H2"; //
        this.nameMaterial="Hardened Materials";

        // HashMap ((float) key : tool diameter  , (float) value:  feed per tooth fz)
        this.feedsPerToothMilling = new HashMap<>();

        this.feedsPerToothMilling.put(1, 0.0089f);
        this.feedsPerToothMilling.put(2, 0.0106f);
        this.feedsPerToothMilling.put(3, 0.0130f);
        this.feedsPerToothMilling.put(4, 0.0153f);
        this.feedsPerToothMilling.put(5, 0.0191f);
        this.feedsPerToothMilling.put(6, 0.0218f);
        this.feedsPerToothMilling.put(8, 0.0277f);
        this.feedsPerToothMilling.put(10, 0.0310f);
        this.feedsPerToothMilling.put(12, 0.0349f);
        this.feedsPerToothMilling.put(14, 0.0383f);
        this.feedsPerToothMilling.put(16, 0.0418f);
        this.feedsPerToothMilling.put(18, 0.0452f);
        this.feedsPerToothMilling.put(20, 0.0467f);
        this.feedsPerToothMilling.put(25, 0.0527f);

    }
}
