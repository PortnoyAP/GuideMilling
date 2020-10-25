package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

public class Steel_P4 extends Material {


    public Steel_P4() {
        this.sideMillingDepthCorrection =0.7f;
        this.sideMillingWidthCorrection =0.1f;
        this.slotMillingDepthCorrection =0.2f;
        this.maximumCuttingSpeedMilling =150.0f;
        this.minimumCuttingSpeedMilling =90.0f;
        this.type="P4";
        this.nameMaterial="Alloy/Tool Steels";

        // HashMap ((float) key : tool diameter  , (float) value:  feed per tooth fz)
        this.feedsPerToothMilling=new HashMap<>();
        this.feedsPerToothMilling.put(1,0.008f);
        this.feedsPerToothMilling.put(2,0.011f);
        this.feedsPerToothMilling.put(3, 0.014f);
        this.feedsPerToothMilling.put(4,0.017f);
        this.feedsPerToothMilling.put(5,0.02f);
        this.feedsPerToothMilling.put(6,0.023f);
        this.feedsPerToothMilling.put(8,0.0318f);
        this.feedsPerToothMilling.put(10,0.037f);
        this.feedsPerToothMilling.put(12,0.0421f);
        this.feedsPerToothMilling.put(14,0.046f);
        this.feedsPerToothMilling.put(16,0.050f);
        this.feedsPerToothMilling.put(18,0.0545f);
        this.feedsPerToothMilling.put(20,0.059f);
        this.feedsPerToothMilling.put(25,0.0657f);

    }
}
