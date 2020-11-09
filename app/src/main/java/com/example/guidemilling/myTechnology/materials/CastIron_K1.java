package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

public class CastIron_K1 extends Material {

//Grey Cast Iron

    public CastIron_K1 () {

        this.type="K1";
        this.nameMaterial="Grey Cast Iron";


        initMapFeedsPerToothMilling();
        initMapFeedsPerToothDrillingHss();
        initCuttingSpeedsMilling();
        initCuttingSpeedsDrilling();
        initCorrectionMilling();
        initCorrectionDrilling();

    }


    public void initMapFeedsPerToothMilling(){
        // HashMap ((float) key : tool diameter  , (float) value:  feed per tooth fz)
        this.feedsPerToothMilling=new HashMap<>();
        this.feedsPerToothMilling.put(1,0.0078f);
        this.feedsPerToothMilling.put(2,0.0123f);
        this.feedsPerToothMilling.put(3, 0.0168f);
        this.feedsPerToothMilling.put(4,0.0207f);
        this.feedsPerToothMilling.put(5,0.0252f);
        this.feedsPerToothMilling.put(6,0.0322f);
        this.feedsPerToothMilling.put(8,0.0442f);
        this.feedsPerToothMilling.put(10,0.0509f);
        this.feedsPerToothMilling.put(12,0.0583f);
        this.feedsPerToothMilling.put(14,0.0635f);
        this.feedsPerToothMilling.put(16,0.0689f);
        this.feedsPerToothMilling.put(18,0.0805f);
        this.feedsPerToothMilling.put(20,0.0833f);


    }

    public void initMapFeedsPerToothDrillingHss(){
        this.feedPerToothDrillingHss=new HashMap<>();
        this.feedPerToothDrillingHss.put(1,0.032f );
        this.feedPerToothDrillingHss.put(2,0.066f );
        this.feedPerToothDrillingHss.put(3,0.102f );
        this.feedPerToothDrillingHss.put(4,0.116f );
        this.feedPerToothDrillingHss.put(5,0.130f );
        this.feedPerToothDrillingHss.put(6,0.150f );
        this.feedPerToothDrillingHss.put(7,0.170f );
        this.feedPerToothDrillingHss.put(8,0.190f );
        this.feedPerToothDrillingHss.put(9,0.209f );
        this.feedPerToothDrillingHss.put(10,0.228f );
        this.feedPerToothDrillingHss.put(11,0.236f );
        this.feedPerToothDrillingHss.put(12,0.243f );
        this.feedPerToothDrillingHss.put(13,0.252f );
        this.feedPerToothDrillingHss.put(14,0.262f );
        this.feedPerToothDrillingHss.put(15,0.271f );
        this.feedPerToothDrillingHss.put(16,0.280f );
        this.feedPerToothDrillingHss.put(17,0.290f );
        this.feedPerToothDrillingHss.put(18,0.300f );
        this.feedPerToothDrillingHss.put(19,0.310f );
        this.feedPerToothDrillingHss.put(20,0.320f );

    }

    public void initCuttingSpeedsMilling(){
        this.maximumCuttingSpeedMilling =130.0f;
        this.minimumCuttingSpeedMilling =100.0f;
    }

    public void initCuttingSpeedsDrilling(){
        this.cuttingSpeedDrillingHss=30.0f;
    }

    public void initCorrectionMilling(){
        this.sideMillingDepthCorrection =0.7f;
        this.sideMillingWidthCorrection =0.1f;
        this.slotMillingDepthCorrection =0.2f;

    }

    public void initCorrectionDrilling(){
        this.peckDrillHssCorrection=0.28f;
    }
























}
