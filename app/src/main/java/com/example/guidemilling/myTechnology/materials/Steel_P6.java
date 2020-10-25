package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

public class Steel_P6 extends Material {


    public Steel_P6() {
        this.sideMillingDepthCorrection =0.7f;
        this.sideMillingWidthCorrection =0.1f;
        this.slotMillingDepthCorrection =0.2f;
        this.maximumCuttingSpeedMilling =75.0f;
        this.minimumCuttingSpeedMilling =50.0f;
        this.type="P6";
        this.nameMaterial="High-Strength Ferritic";

        // HashMap ((float) key : tool diameter  , (float) value:  feed per tooth fz)
        this.feedsPerToothMilling=new HashMap<>();
        this.feedsPerToothMilling.put(1,0.0066f);
        this.feedsPerToothMilling.put(2,0.0094f);
        this.feedsPerToothMilling.put(3, 0.0121f);
        this.feedsPerToothMilling.put(4,0.01495f);
        this.feedsPerToothMilling.put(5,0.0177f);
        this.feedsPerToothMilling.put(6,0.0205f);
        this.feedsPerToothMilling.put(8,0.0259f);
        this.feedsPerToothMilling.put(10,0.0298f);
        this.feedsPerToothMilling.put(12,0.03455f);
        this.feedsPerToothMilling.put(14,0.0373f);
        this.feedsPerToothMilling.put(16,0.0401f);
        this.feedsPerToothMilling.put(18,0.0438f);
        this.feedsPerToothMilling.put(20,0.0475f);
        this.feedsPerToothMilling.put(25,0.0514f);

    }
}
