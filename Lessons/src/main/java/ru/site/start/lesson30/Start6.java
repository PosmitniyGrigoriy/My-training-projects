package ru.site.start.lesson30;

import java.util.ArrayList;
import java.util.List;

public class Start6 {

    public static void main(String[] args) {

        List<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(77);
        listNumbers.add(41);
        listNumbers.add(1);
        listNumbers.add(34);
        listNumbers.add(21);
        listNumbers.add(8);
        listNumbers.add(222);
        listNumbers.add(11);

        System.out.println(listNumbers);
        listNumbers.sort((x, y) -> x.compareTo(y)); // Метод sort вызывается не через класс Collections, а через переменную коллекции. И там параметры метода другие, не такие как через класс коллекции. Нужно только указать кэмпэрэйтэ. В нашем случае - лямбда выражение. Сравниваем одно число с другим и сортируем.
        System.out.println(listNumbers);

    }

}
