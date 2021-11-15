package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.meneger.MenegerFilms;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MenegerFilmsTest {
    private MenegerFilms afisha = new MenegerFilms();
    private MenegerFilms limitFilms = new MenegerFilms(5);

    //проверка добавления фильма
    @Test
    void addFilmTest() {
        FilmItem first = new FilmItem(1, "Бладшот", "боевик", "image_1");
        FilmItem second = new FilmItem(2, "Вперёд", "мультфильм", "image_2");
        FilmItem third = new FilmItem(3, "Отель Белград", "комедия", "image_3");
        FilmItem fourth = new FilmItem(4, "Джентельмены", "боевик", "image_4");
        FilmItem fifth = new FilmItem(5, "Человек-невидимка", "ужасы", "image_5");

        //добавляем элементы в массив
        afisha.addFilm(first);
        afisha.addFilm(second);
        afisha.addFilm(third);
        afisha.addFilm(fourth);
        afisha.addFilm(fifth);

        FilmItem[] actual = afisha.findAll();
        FilmItem[] expected = new FilmItem[]{first, second, third, fourth, fifth};

        //проверка ожидаемого и фактического результата
        assertArrayEquals(expected, actual);
    }

    //вывод в обратном порядке — фильмов меньше 10
    @Test
    void getAllLess10Test() {
        FilmItem first = new FilmItem(1, "Бладшот", "боевик", "image_1");
        FilmItem second = new FilmItem(2, "Вперёд", "мультфильм", "image_2");
        FilmItem third = new FilmItem(3, "Отель Белград", "комедия", "image_3");
        FilmItem fourth = new FilmItem(4, "Джентельмены", "боевик", "image_4");
        FilmItem fifth = new FilmItem(5, "Человек-невидимка", "ужасы", "image_5");

        //добавляем элементы в массив
        afisha.addFilm(first);
        afisha.addFilm(second);
        afisha.addFilm(third);
        afisha.addFilm(fourth);
        afisha.addFilm(fifth);

        FilmItem[] actual = afisha.getAll();
        FilmItem[] expected = new FilmItem[]{fifth, fourth, third, second, first};

        //проверка ожидаемого и фактического результата
        assertArrayEquals(expected, actual);
    }

    //вывод в обратном порядке фильмов больше 10
    @Test
    void getAllMore10Test() {
        FilmItem first = new FilmItem(1, "Бладшот", "боевик", "image_1");
        FilmItem second = new FilmItem(2, "Вперёд", "мультфильм", "image_2");
        FilmItem third = new FilmItem(3, "Отель Белград", "комедия", "image_3");
        FilmItem fourth = new FilmItem(4, "Джентельмены", "боевик", "image_4");
        FilmItem fifth = new FilmItem(5, "Человек-невидимка", "ужасы", "image_5");
        FilmItem sixth = new FilmItem(6, "Вечные", "фантастика", "image_6");
        FilmItem seventh = new FilmItem(7, "Главный герой", "фантастика", "image_7");
        FilmItem eighth = new FilmItem(8, "Последний богатырь: корень зла", "приключения", "image_8");
        FilmItem ninth = new FilmItem(9, "Пара из будущего", "комедия", "image_9");
        FilmItem tenth = new FilmItem(10, "Девятаев", "военный", "image_10");
        FilmItem eleventh = new FilmItem(11, "После", "драма", "image_11");

        //добавляем элементы в массив
        afisha.addFilm(first);
        afisha.addFilm(second);
        afisha.addFilm(third);
        afisha.addFilm(fourth);
        afisha.addFilm(fifth);
        afisha.addFilm(sixth);
        afisha.addFilm(seventh);
        afisha.addFilm(eighth);
        afisha.addFilm(ninth);
        afisha.addFilm(tenth);
        afisha.addFilm(eleventh);

        FilmItem[] actual = afisha.getAll();
        FilmItem[] expected = new FilmItem[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        //проверка ожидаемого и фактического результата
        assertArrayEquals(expected, actual);
    }

    //вывод в обратном порядке используем конструктор (фильмов добавлено больше лимита)
    @Test
    void getAllMoreConstrTest() {

        limitFilms.setLimit(limitFilms.getLimit());

        FilmItem first = new FilmItem(1, "Бладшот", "боевик", "image_1");
        FilmItem second = new FilmItem(2, "Вперёд", "мультфильм", "image_2");
        FilmItem third = new FilmItem(3, "Отель Белград", "комедия", "image_3");
        FilmItem fourth = new FilmItem(4, "Джентельмены", "боевик", "image_4");
        FilmItem fifth = new FilmItem(5, "Человек-невидимка", "ужасы", "image_5");
        FilmItem sixth = new FilmItem(6, "Вечные", "фантастика", "image_6");
        FilmItem seventh = new FilmItem(7, "Главный герой", "фантастика", "image_7");

        //добавляем элементы в массив
        limitFilms.addFilm(first);
        limitFilms.addFilm(second);
        limitFilms.addFilm(third);
        limitFilms.addFilm(fourth);
        limitFilms.addFilm(fifth);
        limitFilms.addFilm(sixth);
        limitFilms.addFilm(seventh);

        FilmItem[] actual = limitFilms.getAll();
        FilmItem[] expected = new FilmItem[]{fifth, fourth, third, second, first};

        //проверка ожидаемого и фактического результата
        assertArrayEquals(expected, actual);
    }

    //вывод в обратном порядке используем конструктор (фильмов добавлено меньше лимита)
    @Test
    void getAllConstrTest() {

        limitFilms.setLimit(limitFilms.getLimit());

        FilmItem first = new FilmItem(1, "Последний богатырь: корень зла", "приключения", "image_1");
        FilmItem second = new FilmItem(2, "Пара из будущего", "комедия", "image_2");
        FilmItem third = new FilmItem(3, "Девятаев", "военный", "image_3");
        FilmItem fourth = new FilmItem(4, "После", "драма", "image_4");

        //добавляем элементы в массив
        limitFilms.addFilm(first);
        limitFilms.addFilm(second);
        limitFilms.addFilm(third);
        limitFilms.addFilm(fourth);

        FilmItem[] actual = limitFilms.getAll();
        FilmItem[] expected = new FilmItem[]{fourth, third, second, first};

        //проверка ожидаемого и фактического результата
        assertArrayEquals(expected, actual);
    }

}
