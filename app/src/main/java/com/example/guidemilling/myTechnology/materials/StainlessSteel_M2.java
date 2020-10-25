package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

public class StainlessSteel_M2 extends Material {

    //High-Strenght Austentic Stainless Steel and Stainless Steels


    public StainlessSteel_M2 () {
        this.sideMillingDepthCorrection =0.7f;
        this.sideMillingWidthCorrection =0.1f;
        this.slotMillingDepthCorrection =0.2f;
        this.maximumCuttingSpeedMilling =80.0f;
        this.minimumCuttingSpeedMilling =60.0f;
        this.type="M2";
        this.nameMaterial="High  Strength/Cast Stainless Steel";

        // HashMap ((float) key : tool diameter  , (float) value:  feed per tooth fz)
        this.feedsPerToothMilling=new HashMap<>();
        this.feedsPerToothMilling.put(1,0.008f);
        this.feedsPerToothMilling.put(2,0.0115f);
        this.feedsPerToothMilling.put(3, 0.015f);
        this.feedsPerToothMilling.put(4,0.0192f);
        this.feedsPerToothMilling.put(5,0.0227f);
        this.feedsPerToothMilling.put(6,0.0258f);
        this.feedsPerToothMilling.put(8,0.0331f);
        this.feedsPerToothMilling.put(10,0.0385f);
        this.feedsPerToothMilling.put(12,0.0439f);
        this.feedsPerToothMilling.put(14,0.0489f);
        this.feedsPerToothMilling.put(16,0.0519f);
        this.feedsPerToothMilling.put(18,0.0577f);
        this.feedsPerToothMilling.put(20,0.0603f);
        this.feedsPerToothMilling.put(25,0.0673f);

    }


}
