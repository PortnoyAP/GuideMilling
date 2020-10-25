package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

public class HardenedMaterialsH1 extends  Material {

    public HardenedMaterialsH1() {

        this.sideMillingDepthCorrection =0.55f;
        this.sideMillingWidthCorrection =0.08f;
        this.slotMillingDepthCorrection =0.16f;

        this.maximumCuttingSpeedMilling = 140.0f;
        this.minimumCuttingSpeedMilling = 80.0f;

        this.type = "H1"; //
        this.nameMaterial="Hardened Materials";

        // HashMap ((float) key : tool diameter  , (float) value:  feed per tooth fz)
        this.feedsPerToothMilling = new HashMap<>();

        this.feedsPerToothMilling.put(1, 0.0127f);
        this.feedsPerToothMilling.put(2, 0.0147f);
        this.feedsPerToothMilling.put(3, 0.0172f);
        this.feedsPerToothMilling.put(4, 0.0187f);
        this.feedsPerToothMilling.put(5, 0.0237f);
        this.feedsPerToothMilling.put(6, 0.0256f);
        this.feedsPerToothMilling.put(8, 0.0338f);
        this.feedsPerToothMilling.put(10, 0.0401f);
        this.feedsPerToothMilling.put(12, 0.0442f);
        this.feedsPerToothMilling.put(14, 0.0497f);
        this.feedsPerToothMilling.put(16, 0.0549f);
        this.feedsPerToothMilling.put(18, 0.0575f);
        this.feedsPerToothMilling.put(20, 0.0620f);
        this.feedsPerToothMilling.put(25, 0.0686f);

    }

}
