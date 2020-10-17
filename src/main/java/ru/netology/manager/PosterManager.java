package ru.netology.manager;

import ru.netology.domain.Post;

public class PosterManager {
    private Post[] films = new Post[0];
    private int numberOfFilms = 10;
    public void add(Post item) {
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
        tmp[lastIndex] = item;
        films = tmp;
    }

    public Post[] getLastFilms() {
        Post[] result = new Post[films.length];
        Post[] numberOfFilms = new Post[this.numberOfFilms];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        for (int i = 0; i < this.numberOfFilms; i++) {
            numberOfFilms[i] = result[i];
        }
        return numberOfFilms;
    }

    public PosterManager() {
    }

    public PosterManager(int numberOfFilms) {
        if (numberOfFilms > 10) {
            return;
        }
        this.numberOfFilms = numberOfFilms;
    }
}