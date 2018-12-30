package com.lucasia.ginquiry.entity;

import android.support.annotation.NonNull;
import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;


@Entity(tableName = "word_table")
public class Word {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")
    private String word;

/*
    @PrimaryKey(autoGenerate = true)
    private int id;
*/

    public Word(@NonNull String word) {
        this.word = word;
    }

    public String getWord() {
        return this.word;
    }
}