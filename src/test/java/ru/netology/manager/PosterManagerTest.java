package ru.netology.manager;

import ru.netology.domain.CinemaItem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class PosterManagerTest {

    PosterManager manager = new PosterManager();

    CinemaItem first = new CinemaItem(1, "fantasy", "first", "1.jpg");
    CinemaItem second = new CinemaItem(2, "thriller", "second", "2.jpg");
    CinemaItem third = new CinemaItem(3, "comedy", "third", "3.jpg");
    CinemaItem fourth = new CinemaItem(4, "comedy", "forth", "4.jpg");
    CinemaItem fifth = new CinemaItem(5, "comedy", "fifth", "5.jpg");
    CinemaItem sixth = new CinemaItem(6, "comedy", "sixth", "6.jpg");
    CinemaItem seventh = new CinemaItem(7, "comedy", "seventh", "7.jpg");
    CinemaItem eighth = new CinemaItem(8, "comedy", "eighth", "8.jpg");
    CinemaItem ninth = new CinemaItem(9, "comedy", "nineth", "9.jpg");
    CinemaItem tenth = new CinemaItem(10, "comedy", "tenth", "10.jpg");
    CinemaItem eleventh = new CinemaItem(11, "comedy", "eleventh", "11.jpg");


    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
    }

    @Test
    public void shouldGetLastsIfNotCinemas() {
        manager = new PosterManager();

        CinemaItem[] actual = manager.getLastCinemas();
        CinemaItem[] expected = new CinemaItem[]{};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldGetLastsIfOneMovie() {
        manager = new PosterManager();

        manager.add(first);

        CinemaItem[] actual = manager.getLastCinemas();
        CinemaItem[] expected = new CinemaItem[]{first};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldGetLastsIfSomeCinemas() {
        manager = new PosterManager();

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);

        CinemaItem[] actual = manager.getLastCinemas();
        CinemaItem[] expected = new CinemaItem[]{fifth, fourth, third, second, first};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldGetLastsIfMoreCinemas() {

        CinemaItem[] actual = manager.getLastCinemas();
        CinemaItem[] expected = new CinemaItem[]{eleventh, tenth, ninth, eighth, seventh, sixth,
                fifth, fourth, third, second};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldGetLastsIfCountNull() {
        manager = new PosterManager(0);

        manager.add(first);

        CinemaItem[] actual = manager.getLastCinemas();
        CinemaItem[] expected = new CinemaItem[]{};

        assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldGetLastsIfCountOne() {
        manager = new PosterManager(1);

        manager.add(first);
        manager.add(second);

        CinemaItem[] actual = manager.getLastCinemas();
        CinemaItem[] expected = new CinemaItem[]{second};

        assertArrayEquals(actual, expected);
    }
}