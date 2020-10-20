package ru.netology.manager;

import ru.netology.domain.Post;

public class PosterManager {
    private Post[] films = new Post[0];
    private int numberOfFilms = 10; //число фильмов, которые нужно вывести (10 или меньше, в зависимости от количества фильмов в афише
    public void add(Post post) {
        // создаём новый массив размером на единицу больше
        int length = films.length + 1;
        Post[] tmp = new Post[length];
        // itar + tab
        // копируем поэлементно
        // for (int i = 0; i < items.length; i++) {
        //   tmp[i] = items[i];
        // }
        System.arraycopy(films, 0, tmp, 0, films.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = post;
        films = tmp;
    }

    public Post[] getLastFilms() {
        int count = films.length > numberOfFilms ? numberOfFilms : films.length;
        Post[] tmp = new Post[count];
        for (int i = 0; i < count; i++) {
            int index = films.length - i - 1;
            tmp[i] = films[index];
        }
        return tmp;
    }

    public PosterManager() {
    }

    public PosterManager(int numberOfFilms) {
        if (numberOfFilms < 0) {
            return;
        }
        this.numberOfFilms = numberOfFilms;
    }
}