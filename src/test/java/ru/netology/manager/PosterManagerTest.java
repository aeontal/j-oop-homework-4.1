package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.CinemaItem;

import static org.junit.jupiter.api.Assertions.*;

public class PosterManagerTest {
    @Test
    public void shouldShowDefault() {
        PosterManager manager = new PosterManager();

        CinemaItem first = new CinemaItem(1, "fantasy", "first", "1.jpg");
        CinemaItem second = new CinemaItem(2, "thriller", "second", "2.jpg");
        CinemaItem third = new CinemaItem(3, "comedy", "third", "3.jpg");
        CinemaItem forth = new CinemaItem(4, "comedy", "forth", "4.jpg");
        CinemaItem fifth = new CinemaItem(5, "comedy", "fifth", "5.jpg");
        CinemaItem sixth = new CinemaItem(6, "comedy", "sixth", "6.jpg");
        CinemaItem seventh = new CinemaItem(7, "comedy", "seventh", "7.jpg");
        CinemaItem eighth = new CinemaItem(8, "comedy", "eighth", "8.jpg");
        CinemaItem nineth = new CinemaItem(9, "comedy", "nineth", "9.jpg");
        CinemaItem tenth = new CinemaItem(10, "comedy", "tenth", "10.jpg");
        CinemaItem eleventh = new CinemaItem(11, "comedy", "eleventh", "11.jpg");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(forth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(nineth);
        manager.add(tenth);
        manager.add(eleventh);


        CinemaItem[] actual = manager.getAll();
        CinemaItem[] expected = new CinemaItem[]{eleventh, tenth, nineth, eighth, seventh, sixth, fifth, forth, third, second};

//    assertEquals(expected, actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowCustom() {
        PosterManager manager = new PosterManager(3);

        CinemaItem first = new CinemaItem(1, "fantasy", "first", "1.jpg");
        CinemaItem second = new CinemaItem(2, "thriller", "second", "2.jpg");
        CinemaItem third = new CinemaItem(3, "comedy", "third", "3.jpg");
        CinemaItem forth = new CinemaItem(4, "comedy", "forth", "4.jpg");
        CinemaItem fifth = new CinemaItem(5, "comedy", "fifth", "5.jpg");
        CinemaItem sixth = new CinemaItem(6, "comedy", "sixth", "6.jpg");
        CinemaItem seventh = new CinemaItem(7, "comedy", "seventh", "7.jpg");
        CinemaItem eighth = new CinemaItem(8, "comedy", "eighth", "8.jpg");
        CinemaItem nineth = new CinemaItem(9, "comedy", "nineth", "9.jpg");
        CinemaItem tenth = new CinemaItem(10, "comedy", "tenth", "10.jpg");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(forth);
        manager.add(fifth);
        CinemaItem[] actual = manager.getAll();

        CinemaItem[] expected = new CinemaItem[]{fifth, forth, third};

        assertArrayEquals(expected, actual);
    }
}