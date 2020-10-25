package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

public class Steel_P5 extends Material {


    public Steel_P5() {

        this.sideMillingDepthCorrection =0.7f;
        this.sideMillingWidthCorrection =0.1f;
        this.slotMillingDepthCorrection =0.2f;
        this.maximumCuttingSpeedMilling =100.0f;
        this.minimumCuttingSpeedMilling =60.0f;
        this.type="P5";
        this.nameMaterial="Ferritic/Martensitic/PH Stainless Steels";

        // HashMap ((float) key : tool diameter  , (float) value:  feed per tooth fz)
        this.feedsPerToothMilling=new HashMap<>();
        this.feedsPerToothMilling.put(1,0.0071f);
        this.feedsPerToothMilling.put(2,0.009f);
        this.feedsPerToothMilling.put(3, 0.0125f);
        this.feedsPerToothMilling.put(4,0.016f);
        this.feedsPerToothMilling.put(5,0.0195f);
        this.feedsPerToothMilling.put(6,0.023f);
        this.feedsPerToothMilling.put(8,0.028f);
        this.feedsPerToothMilling.put(10,0.034f);
        this.feedsPerToothMilling.put(12,0.0395f);
        this.feedsPerToothMilling.put(14,0.0432f);
        this.feedsPerToothMilling.put(16,0.047f);
        this.feedsPerToothMilling.put(18,0.0524f);
        this.feedsPerToothMilling.put(20,0.0578f);
        this.feedsPerToothMilling.put(25,0.0644f);

    }
}
