package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Post;


import static org.junit.jupiter.api.Assertions.*;

public class PosterManagerTest {

  @Test
  public void getLastTenFilmsLess() {
    PosterManager posterManager = new PosterManager(2);
    Post first = new Post(1, 1, "first", "comedy", true);
    Post second = new Post(2, 2, "second", "action", false);
    posterManager.add(first);
    posterManager.add(second);
    Post[] actual = posterManager.getLastFilms();
    Post[] expected = new Post[]{second, first};
    assertArrayEquals(expected, actual);
  }

  @Test
  public void getLastTenFilmsEqual() {
    PosterManager posterManager = new PosterManager();
    Post one = new Post(1, 1, "one", "comedy", true);
    Post two = new Post(2, 2, "two", "action", true);
    Post three = new Post(3, 3, "three", "horror", true);
    Post four = new Post(4, 4, "four", "action", false);
    Post five = new Post(5, 5, "five", "comedy", true);
    Post six = new Post(6, 6, "six", "comedy", false);
    Post seven = new Post(7, 7, "seven", "horror", true);
    Post eight = new Post(8, 8, "eight", "comedy", false);
    Post nine = new Post(9, 9, "nine", "horror", true);
    Post ten = new Post(10, 10, "ten", "action", false);
    posterManager.add(one);
    posterManager.add(two);
    posterManager.add(three);
    posterManager.add(four);
    posterManager.add(five);
    posterManager.add(six);
    posterManager.add(seven);
    posterManager.add(eight);
    posterManager.add(nine);
    posterManager.add(ten);
    Post[] actual = posterManager.getLastFilms();
    Post[] expexcted = new Post[]{ten, nine, eight, seven, six, five, four, three, two, one};
    assertArrayEquals(expexcted, actual);
  }

  @Test
  public void getLastTenFilmsMore() {
    PosterManager posterManager = new PosterManager(10);
    Post one = new Post(1, 1, "one", "comedy", true);
    Post two = new Post(2, 2, "two", "action", true);
    Post three = new Post(3, 3, "three", "horror", true);
    Post four = new Post(4, 4, "four", "action", false);
    Post five = new Post(5, 5, "five", "comedy", true);
    Post six = new Post(6, 6, "six", "comedy", false);
    Post seven = new Post(7, 7, "seven", "horror", true);
    Post eight = new Post(8, 8, "eight", "comedy", false);
    Post nine = new Post(9, 9, "nine", "horror", true);
    Post ten = new Post(10, 10, "ten", "action", false);
    Post eleven = new Post(11, 11, "eleven", "horror", true);
    posterManager.add(one);
    posterManager.add(two);
    posterManager.add(three);
    posterManager.add(four);
    posterManager.add(five);
    posterManager.add(six);
    posterManager.add(seven);
    posterManager.add(eight);
    posterManager.add(nine);
    posterManager.add(ten);
    posterManager.add(eleven);
    Post[] actual = posterManager.getLastFilms();
    Post[] expected = new Post[] {eleven, ten, nine, eight, seven, six, five, four, three, two};
    assertArrayEquals(expected, actual);
  }
}