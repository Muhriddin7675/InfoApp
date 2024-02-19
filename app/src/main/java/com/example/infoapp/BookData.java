package com.example.infoapp;

public class BookData {
    private int imegResId;
    private String bookName;
    private String bookText;

    public BookData(int imegResId, String bookName, String bookText) {
        this.imegResId = imegResId;
        this.bookName = bookName;
        this.bookText = bookText;
    }

    public int getImegResId() {
        return imegResId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookText() {
        return bookText;
    }
}
