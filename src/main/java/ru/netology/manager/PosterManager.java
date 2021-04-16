package ru.netology.manager;

import ru.netology.domain.CinemaItem;

public class PosterManager {



    private CinemaItem[] items = new CinemaItem[0];
    private int countLastCinemas = 10;

    public PosterManager() {
    }
    
    public PosterManager(int countLastMovies) {
        this.countLastCinemas = countLastMovies;
    }

    public void add(CinemaItem item) {
        int length = items.length + 1;
        CinemaItem[] tmp = new CinemaItem[length];

        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
        
    }
    public CinemaItem[] getLastCinemas() {
        CinemaItem[] result = new CinemaItem[items.length];

        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        if (result.length <= countLastCinemas) {
            return result;
        } else {
            CinemaItem[] result2 = new CinemaItem[countLastCinemas];
            System.arraycopy(result, 0, result2, 0, result2.length);
            return result2;
        }
    }
}


