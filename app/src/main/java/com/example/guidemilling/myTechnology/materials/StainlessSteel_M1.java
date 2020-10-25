package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

public class StainlessSteel_M1 extends Material {

    // Austentic Stainless Steel


    public StainlessSteel_M1 () {

        this.sideMillingDepthCorrection =0.7f;
        this.sideMillingWidthCorrection =0.1f;
        this.slotMillingDepthCorrection =0.2f;
        this.maximumCuttingSpeedMilling =80.0f;
        this.minimumCuttingSpeedMilling =60.0f;
        this.type="M1";
        this.nameMaterial="Austentic Stainless Steel";

        // HashMap ((float) key : tool diameter  , (float) value:  feed per tooth fz)
        this.feedsPerToothMilling=new HashMap<>();
        this.feedsPerToothMilling.put(1,0.0106f);
        this.feedsPerToothMilling.put(2,0.0148f);
        this.feedsPerToothMilling.put(3, 0.019f);
        this.feedsPerToothMilling.put(4,0.0221f);
        this.feedsPerToothMilling.put(5,0.0263f);
        this.feedsPerToothMilling.put(6,0.0305f);
        this.feedsPerToothMilling.put(8,0.0398f);
        this.feedsPerToothMilling.put(10,0.0470f);
        this.feedsPerToothMilling.put(12,0.0531f);
        this.feedsPerToothMilling.put(14,0.0595f);
        this.feedsPerToothMilling.put(16,0.0632f);
        this.feedsPerToothMilling.put(18,0.0699f);
        this.feedsPerToothMilling.put(20,0.0737f);
        this.feedsPerToothMilling.put(25,0.0829f);

    }


}
