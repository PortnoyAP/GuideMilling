package com.example.guidemilling.tips;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "tips")
public class Tip {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "tip_id")
    private long id;

    @ColumnInfo(name = "tip_name")
    private String tip;

    @Ignore
    public Tip() {
    }

    public Tip(long id, String tip) {
        this.id = id;
        this.tip = tip;
    }

    @Ignore
    public Tip(String tip) {
        this.tip = tip;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }
}