package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the news heading: ");
        News news = new News();
        news.setNewsHeading(sc.nextLine());

        System.out.print("Enter the text of the news: ");
        news.setNewsText(sc.nextLine());

        addNews(news);
    }


    public static void addNews(News news) {
        if (NewsDB.addNews(news)) {
            System.out.println("News created successfully");
        } else System.out.println("News is not created");


    //метод отобразить не смогла сделатью что-то пошло не так
}

    public static void present(String newsHeading, String newsText) {
        News news = new News();
        present(news.getNewsHeading(), news.getNewsText());

        // метод удаления не смогла сделать,  запуталась

        public static void main (String[]args){

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the id to delete the news by id: ");
            News news = new News();
            news.setId(sc.nextLine());
            NewsDB.getNewsHeading(News news);

            System.out.print("The news is deleted ");
        }
    }
}
