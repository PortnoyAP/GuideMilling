package com.example.guidemilling.myTechnology.materials;

import java.util.HashMap;

import static java.lang.Math.PI;

public abstract class Material {

    protected Float maximumCuttingSpeedMilling;
    protected Float minimumCuttingSpeedMilling;
    protected Float cuttingSpeedDrillingHss;

    protected Float sideMillingDepthCorrection;
    protected Float sideMillingWidthCorrection;
    protected Float slotMillingDepthCorrection;
    protected Float peckDrillHssCorrection;


    protected String type;
    protected String nameMaterial;

    protected HashMap<Integer, Float> feedsPerToothMilling;
    protected int feedPerToothDrillingHss;


    protected int spindleSpeedMillingCalculatedMaximum;
    protected int spindleSpeedMillingCalculatedMinimum;
    protected int feedMillingCalculatedMaximum;
    protected int feedMillingCalculatedMinimum;
    protected int sideMillingDepth;
    protected int sideMillingWidth;
    protected int slotMillingDepth;
    protected int spindleSpeedDrillHssCalculated;
    protected int feedDrillHssCalculated;
    protected int peckDrillHss;


    protected String firstRecommendationForMilling;
    protected String secondRecommendationForMilling;
    protected String firstRecommendationForDrillingHss;
    protected String secondRecommendationForDrillingHss;






    public Material() {
       initFirstRecommendationForMilling();
       initSecondRecommendationForMilling();
    }


    public int calculateMillingSpindleSpeedMaximum(int toolDiameter) {

        this.spindleSpeedMillingCalculatedMaximum = (int) ((maximumCuttingSpeedMilling * 1000) / (toolDiameter * PI));
        return spindleSpeedMillingCalculatedMaximum;
    }

    public int calculateMillingSpindleSpeedMinimum(int toolDiameter) {
        this.spindleSpeedMillingCalculatedMinimum = (int) ((minimumCuttingSpeedMilling * 1000) / (toolDiameter * PI));
        return spindleSpeedMillingCalculatedMinimum;
    }

    public int calculateMillingFeedMaximum(int numberToothTool, int toolDiameter) {
        this.feedMillingCalculatedMaximum = (int) (numberToothTool * feedsPerToothMilling.get(toolDiameter) * this.spindleSpeedMillingCalculatedMaximum);
        return feedMillingCalculatedMaximum;
    }

    public int calculateMillingFeedMinimum(int numberToothTool, int toolDiameter) {
        this.feedMillingCalculatedMinimum = (int) (numberToothTool * feedsPerToothMilling.get(toolDiameter) * this.spindleSpeedMillingCalculatedMinimum);
        return feedMillingCalculatedMinimum;
    }



    public int calculateDrillHssSpindleSpeed(int toolDiameter) {
        this.spindleSpeedDrillHssCalculated = (int) ((cuttingSpeedDrillingHss * 1000) / (toolDiameter * PI));
        return spindleSpeedDrillHssCalculated;
    }

    public int calculateDrillingFeed(int numberToothTool) {
        this.feedDrillHssCalculated = (int) (numberToothTool*cuttingSpeedDrillingHss*this.spindleSpeedDrillHssCalculated);
        return feedDrillHssCalculated;
    }






    public int calculateSideMillingDepth(int toolDiameter) {
        this.sideMillingDepth= (int) (toolDiameter*sideMillingDepthCorrection);
        return sideMillingDepth;
    }

    public int calculateSideMillingWidth(int toolDiameter) {
        this.sideMillingWidth= (int) (toolDiameter*sideMillingWidthCorrection);
        return sideMillingWidth;
    }

    public int calculateSlotMillingDepth(int toolDiameter) {
        this.slotMillingDepth= (int) (toolDiameter*slotMillingDepthCorrection);
        return slotMillingDepth;
    }

    public int calculatePeckDepthHss(int toolDiameter) {
        this.peckDrillHss= (int) (toolDiameter*peckDrillHssCorrection);
        return peckDrillHss;
    }




    public void initFirstRecommendationForMilling(){
        this.firstRecommendationForMilling =("MILLING OPTIONS : \n Use one finish mill for the rough and finish :\n" +
                "1.Rough-Leave 0.2-0.5 mm for the finish job \n" +
                "2.Finish - It is recommended to increase RPM and decrease feed for better surface finish\n" +
                "3.If a long cutter is required, reduce the speed and feed");
    }

    public void initSecondRecommendationForMilling(){
        this.secondRecommendationForMilling =("MILLING OPTIONS : \n Use Finish and Rough mill\n:" +
                "1. Rough Mill -Leave 0.2-0.5 mm for the finish job, rough mill is much stronger \n" +
                "(rough  mill can operate at higher modes compared to a finish mill)\n" +
                "2.Finish Mill- It is recommended to increase RPM and decrease feed for better surface finish\n" +
                "(check the length of the cutting edge )\n" +
                "3.Check number of teeth on your tool !");

    }

    public void initFirstRecommendationForDrillingHss(){
        this.firstRecommendationForDrillingHss =("Drilling with HSS tool : [1] Before Drilling use Center Drill\n[2] Use Hss Drill ");
    }

    public void initSecondRecommendationForDrillingHss(){
        this.secondRecommendationForDrillingHss =("Use Solid Carbide  Drill's : [1] Without pre-Drilling\n[2] Check cutting data for your Drill ");
    }











    public Float getMaximumCuttingSpeedMilling() {
        return maximumCuttingSpeedMilling;
    }

    public void setMaximumCuttingSpeedMilling(Float maximumCuttingSpeedMilling) {
        this.maximumCuttingSpeedMilling = maximumCuttingSpeedMilling;
    }

    public Float getMinimumCuttingSpeedMilling() {
        return minimumCuttingSpeedMilling;
    }

    public void setMinimumCuttingSpeedMilling(Float minimumCuttingSpeedMilling) {
        this.minimumCuttingSpeedMilling = minimumCuttingSpeedMilling;
    }

    public Float getSideMillingDepthCorrection() {
        return sideMillingDepthCorrection;
    }

    public void setSideMillingDepthCorrection(Float sideMillingDepthCorrection) {
        this.sideMillingDepthCorrection = sideMillingDepthCorrection;
    }

    public Float getSideMillingWidthCorrection() {
        return sideMillingWidthCorrection;
    }

    public void setSideMillingWidthCorrection(Float sideMillingWidthCorrection) {
        this.sideMillingWidthCorrection = sideMillingWidthCorrection;
    }

    public Float getSlotMillingDepthCorrection() {
        return slotMillingDepthCorrection;
    }

    public void setSlotMillingDepthCorrection(Float slotMillingDepthCorrection) {
        this.slotMillingDepthCorrection = slotMillingDepthCorrection;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNameMaterial() {
        return nameMaterial;
    }

    public void setNameMaterial(String nameMaterial) {
        this.nameMaterial = nameMaterial;
    }

    public HashMap<Integer, Float> getFeedsPerToothMilling() {
        return feedsPerToothMilling;
    }

    public void setFeedsPerToothMilling(HashMap<Integer, Float> feedsPerToothMilling) {
        this.feedsPerToothMilling = feedsPerToothMilling;
    }

    public int getSpindleSpeedMillingCalculatedMaximum() {
        return spindleSpeedMillingCalculatedMaximum;
    }

    public void setSpindleSpeedMillingCalculatedMaximum(int spindleSpeedMillingCalculatedMaximum) {
        this.spindleSpeedMillingCalculatedMaximum = spindleSpeedMillingCalculatedMaximum;
    }

    public int getSpindleSpeedMillingCalculatedMinimum() {
        return spindleSpeedMillingCalculatedMinimum;
    }

    public void setSpindleSpeedMillingCalculatedMinimum(int spindleSpeedMillingCalculatedMinimum) {
        this.spindleSpeedMillingCalculatedMinimum = spindleSpeedMillingCalculatedMinimum;
    }

    public int getFeedMillingCalculatedMaximum() {
        return feedMillingCalculatedMaximum;
    }

    public void setFeedMillingCalculatedMaximum(int feedMillingCalculatedMaximum) {
        this.feedMillingCalculatedMaximum = feedMillingCalculatedMaximum;
    }

    public int getFeedMillingCalculatedMinimum() {
        return feedMillingCalculatedMinimum;
    }

    public void setFeedMillingCalculatedMinimum(int feedMillingCalculatedMinimum) {
        this.feedMillingCalculatedMinimum = feedMillingCalculatedMinimum;
    }

    public String getFirstRecommendationForMilling() {
        return firstRecommendationForMilling;
    }

    public String getSecondRecommendationForMilling() {
        return secondRecommendationForMilling;
    }
}