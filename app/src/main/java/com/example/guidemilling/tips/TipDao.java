package com.example.guidemilling.tips;


import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface TipDao {


    @Insert
    public long addTip(Tip tip);

    @Query("select * from tips")
    public List<Tip> getAllTips();

    @Query("select * from tips where tip_id ==:tipId ")
    public  Tip getTip(long tipId);



}
