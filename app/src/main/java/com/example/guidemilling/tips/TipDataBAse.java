package com.example.guidemilling.tips;

import androidx.room.Database;
import androidx.room.RoomDatabase;


@Database(entities = {Tip.class}, version = 1)
public abstract class TipDataBAse extends RoomDatabase {

 public abstract TipDao getTipDao();
}
