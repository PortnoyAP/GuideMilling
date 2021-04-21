package com.example.guidemilling.myTechnology.tools;


import com.example.guidemilling.R;

public class Mill extends Tool {

    private int millAlImage;
    private int millStImage;

    public Mill() {
        this.numberTooth = 3;
        this.millAlImage = R.drawable.mill_al;

    }

    public Mill(int diameter, int numberTooth) {
        super(diameter, numberTooth);
        this.millAlImage = R.drawable.mill_al;
        this.millStImage = R.drawable.mill_st;
    }

    public int getMillAlImage() {
        return millAlImage;
    }

    public void setMillAlImage(int millAlImage) {
        this.millAlImage = millAlImage;
    }

    public int getMillStImage() {
        return millStImage;
    }

    public void setMillStImage(int millStImage) {
        this.millStImage = millStImage;
    }
}
