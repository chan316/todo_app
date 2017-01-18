package com.codepath.simpletodo;

import java.util.ArrayList;

public class TodoItem {

    public String text;
    public int pos;


    public TodoItem(String text, int pos) {
        this.text = text;
        this.pos  = pos;
    }

    // Used when we read from a text file, convert strings to an ArrayList of TodoItems
    public static ArrayList<TodoItem> fromStringArrayList(ArrayList<String> arr) {
        ArrayList<TodoItem> items = new ArrayList<TodoItem>();

        for (int i = 0; i < arr.size(); i++) {
            items.add(new TodoItem(arr.get(i), i));
        }

        return items;
    }
    
    // Serialization, used when we write to a text file, converts an ArrayList of TodoItems
    // to an ArrayList of Strings.
    public static ArrayList<String> toStringArrayList(ArrayList<TodoItem> arr) {
        ArrayList<String> items = new ArrayList<String>();

        for (int i = 0; i < arr.size(); i++) {
            items.add(arr.get(i).text);
        }

        return items;
    }
}