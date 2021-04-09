package com.moshiur.room_mvvm;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "note_table")
public class Note {

    @PrimaryKey(autoGenerate = true)
    private int id;
    //@ColumnInfo(name = "column_name")
    private String string;
    private String description;
    private int priority;

    public Note(String string, String description, int priority) {
        this.string = string;
        this.description = description;
        this.priority = priority;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getString() {
        return string;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }
}
