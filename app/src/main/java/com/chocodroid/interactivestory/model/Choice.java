package com.chocodroid.interactivestory.model;

/**
 * Created by Chinmay Anaokar on 31-05-2015.
 */
public class Choice {

    private String mText;
    private int mNextPage;

    /*
    Constructors for the Page class
     */

    public Choice(String text, int nextPage){

        mText = text;
        mNextPage = nextPage;

    }

    /*
    Getters & Setters
     */

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
