package ru.netology;

public class FilmItem {
    private int id;          //идентификатор фильма
    private String name;     //наименование фильма
    private String genre;    //жанр фильма
    private String urlImg;   //ссылка на изображение

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public FilmItem() {
    }

    public FilmItem(int id, String name, String genre, String urlImg) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.urlImg = urlImg;
    }
}
