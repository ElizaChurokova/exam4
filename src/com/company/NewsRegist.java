package com.company;

import java.util.Date;

public class NewsRegist {
    private int id;
    private News news;
    private Date regTime;
    private String registrationResult;

    public NewsRegist(){}

    public NewsRegist(int id, News news, Date regTime, String registrationResult) {
        this.id = id;
        this.news = news;
        this.regTime = regTime;
        this.registrationResult = registrationResult;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getRegistrationResult() {
        return registrationResult;
    }

    public void setRegistrationResult(String registrationResult) {
        this.registrationResult = registrationResult;
    }
}
