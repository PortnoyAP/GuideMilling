package com.example.guidemilling.toolGallery;

public class RecyclerViewItem {

    private int imageTool;
    private String name;
    private String about;





    public RecyclerViewItem(int imageTool, String name, String about) {
        this.imageTool = imageTool;
        this.name = name;
        this.about = about;
    }




    public int getImageTool() {
        return imageTool;
    }

    public String getName() {
        return name;
    }

    public String getAbout() {
        return about;
    }


}
