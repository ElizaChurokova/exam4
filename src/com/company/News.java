package com.company;

import java.util.Date;

public class News {
    private int id;
    private String newsHeading;
    private String newsText;
    private Date publicationTime;

    public News(){}
    public News(int id, String newsHeading, String newsText, Date publicationTime) {
        this.id = id;
        this.newsHeading = newsHeading;
        this.newsText = newsText;
        this.publicationTime = publicationTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNewsHeading() {
        return newsHeading;
    }

    public void setNewsHeading(String newsHeading) {
        this.newsHeading = newsHeading;
    }

    public String getNewsText() {
        return newsText;
    }

    public void setNewsText(String newsText) {
        this.newsText = newsText;
    }

    public Date getPublicationTime() {
        return publicationTime;
    }

    public void setPublicationTime(Date publicationTime) {
        this.publicationTime = publicationTime;
    }
}
