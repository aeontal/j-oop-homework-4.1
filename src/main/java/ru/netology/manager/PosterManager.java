package ru.netology.manager;

import ru.netology.domain.CinemaItem;

public class PosterManager {
    private int viewRange = 10;
    private CinemaItem[] items = new CinemaItem[0];
    public PosterManager() {
    }

    ;

    public PosterManager(int viewRange) {
        this.viewRange = viewRange;
    }

    public void add(CinemaItem item) {
        // создаём новый массив размером на единицу больше
        int length = items.length + 1;
        CinemaItem[] tmp = new CinemaItem[length];
        // itar + tab
        // копируем поэлементно
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        System.arraycopy(items, 0, tmp, 0, items.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public CinemaItem[] getAll() {
        //создаем временный массив для его перебора в обратном порядке
        CinemaItem[] tmp = new CinemaItem[items.length];

        // проводим проверку на соотнесение длины массива и задаваемой видимой области
        if (items.length > viewRange) {
            this.viewRange = viewRange;
        } else {
            viewRange = items.length;
        }

        //создаем массив для отображения видимой области
        CinemaItem[] result = new CinemaItem[viewRange];
        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            tmp[i] = items[index];
        }
        // копируем из массива переборки в массив области видимости
        System.arraycopy(tmp, 0, result, 0, viewRange);

        return result;
    }
}
