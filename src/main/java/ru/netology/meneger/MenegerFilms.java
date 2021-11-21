package ru.netology.meneger;


import ru.netology.FilmItem;

public class MenegerFilms {
    //создаём пустой массив
    private FilmItem[] items = new FilmItem[0];
    private int limit = 10;

    public MenegerFilms(int limit) {
        this.limit = limit;
    }

    public MenegerFilms() {
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    //добавление фильма в ленту (добавление элемента в массив)
    public void addFilm(FilmItem item) {
        //создаём новый массив размером на единицу больше
        int length = items.length + 1;
        FilmItem[] tmp = new FilmItem[length];
        //копируем поэлементно
        System.arraycopy(items, 0, tmp, 0, items.length);
        //кладём последний наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    //выводим ленту фильмов — весь массив
    public FilmItem[] findAll() {
        return items;
    }

    //выводим ленту в обратном порядке
    public FilmItem[] getAll() {
        FilmItem[] items = findAll();
        int resultLength = 0;
        if (items.length <= limit) {
            resultLength = items.length;
        } else {
            resultLength = limit;
        }
        FilmItem[] result = new FilmItem[resultLength];
        for (int i = 0; i < resultLength; i++) {
            if (items.length <= limit) {
            }
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}

