package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

public class Steel_P3 extends Material {


    public Steel_P3() {

        this.sideMillingDepthCorrection =0.7f;
        this.sideMillingWidthCorrection =0.1f;
        this.slotMillingDepthCorrection =0.2f;
        this.maximumCuttingSpeedMilling =160.0f;
        this.minimumCuttingSpeedMilling =90.0f;
        this.type="P3";
        this.nameMaterial="Alloy/Tool Steels";

        // HashMap ((float) key : tool diameter  , (float) value:  feed per tooth fz)
        this.feedsPerToothMilling=new HashMap<>();
        this.feedsPerToothMilling.put(1,0.01f);
        this.feedsPerToothMilling.put(2,0.013f);
        this.feedsPerToothMilling.put(3, 0.016f);
        this.feedsPerToothMilling.put(4,0.018f);
        this.feedsPerToothMilling.put(5,0.021f);
        this.feedsPerToothMilling.put(6,0.024f);
        this.feedsPerToothMilling.put(7, 0.029f);
        this.feedsPerToothMilling.put(8,0.0345f);
        this.feedsPerToothMilling.put(9,0.037f);
        this.feedsPerToothMilling.put(10,0.0408f);
        this.feedsPerToothMilling.put(11,0.0458f);
        this.feedsPerToothMilling.put(12,0.053f);
        this.feedsPerToothMilling.put(13,0.055f);
        this.feedsPerToothMilling.put(14,0.058f);
        this.feedsPerToothMilling.put(15,0.060f);
        this.feedsPerToothMilling.put(16,0.0625f);
        this.feedsPerToothMilling.put(17,0.0653f);
        this.feedsPerToothMilling.put(18,0.0668f);
        this.feedsPerToothMilling.put(19,0.071f);
        this.feedsPerToothMilling.put(20,0.074f);
        this.feedsPerToothMilling.put(25,0.092f);

    }
}
