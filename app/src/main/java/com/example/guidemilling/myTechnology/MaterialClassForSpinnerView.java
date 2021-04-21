package com.example.guidemilling.myTechnology;

public class MaterialClassForSpinnerView {

    private String materialName;
    private int imageMaterial;
    private char materialClass;
    private String typeClass;


    public MaterialClassForSpinnerView(char materialClass, String typeClass, String materialName, int imageMaterial) {
        this.materialClass = materialClass;
        this.typeClass = typeClass;
        this.materialName = materialName;
        this.imageMaterial = imageMaterial;
    }


    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public int getImageMaterial() {
        return imageMaterial;
    }

    public void setImageMaterial(int imageMaterial) {
        this.imageMaterial = imageMaterial;
    }


    public char getMaterialClass() {
        return materialClass;
    }

    public void setMaterialClass(char materialClass) {
        this.materialClass = materialClass;
    }

    public String getTypeClass() {
        return typeClass;
    }

    public void setTypeClass(String typeClass) {
        this.typeClass = typeClass;
    }
}
