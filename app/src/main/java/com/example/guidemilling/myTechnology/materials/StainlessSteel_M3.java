package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

public class StainlessSteel_M3 extends Material {

    public StainlessSteel_M3 () {
        this.sideMillingDepthCorrection =0.7f;
        this.sideMillingWidthCorrection =0.1f;
        this.slotMillingDepthCorrection =0.2f;
        this.maximumCuttingSpeedMilling =70.0f;
        this.minimumCuttingSpeedMilling =60.0f;
        this.type="M3";
        this.nameMaterial="Duplex Stainless Steel";

        // HashMap ((float) key : tool diameter  , (float) value:  feed per tooth fz)
        this.feedsPerToothMilling=new HashMap<>();
        this.feedsPerToothMilling.put(1,0.0084f);
        this.feedsPerToothMilling.put(2,0.012f);
        this.feedsPerToothMilling.put(3, 0.013f);
        this.feedsPerToothMilling.put(4,0.0173f);
        this.feedsPerToothMilling.put(5,0.0199f);
        this.feedsPerToothMilling.put(6,0.0229f);
        this.feedsPerToothMilling.put(8,0.029f);
        this.feedsPerToothMilling.put(10,0.0347f);
        this.feedsPerToothMilling.put(12,0.0375f);
        this.feedsPerToothMilling.put(14,0.0413f);
        this.feedsPerToothMilling.put(16,0.0436f);
        this.feedsPerToothMilling.put(18,0.0483f);
        this.feedsPerToothMilling.put(20,0.0496f);
        this.feedsPerToothMilling.put(25,0.0537f);

    }
}
