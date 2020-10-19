package ru.netology.manager;

import ru.netology.domain.Post;

public class PosterManager {
    private Post[] films = new Post[0];
    private int numberOfFilms = 10;
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
        int length = this.numberOfFilms;
        Post[] tmp = new Post[films.length >=10? 10: length];
        for (int i = 0; i < length; i++) {
            if (i >= 10) {
                return tmp;
            }
            tmp[i] = films[films.length - i - 1];
        }
        return tmp;
    }

    public PosterManager() {
    }

    public PosterManager(int numberOfFilms) {
        this.numberOfFilms = numberOfFilms;
    }
}