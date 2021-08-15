package ru.site.start.lesson35;

public class Start13 {
}

// Задание 13
// Что будет результатом компиляции и запуска данного кода?

//class Book {
//}
//
//interface Readable {
//}
//
//class PaperBook extends Book implements Readable {
//}
//
//class ElectronicBook extends Book {
//}
//
//class TestBook {
//
//    public static void main(String args[]) {
//        Readable r = null;
//        ElectronicBook eBook = new ElectronicBook();
//        r = (Readable) eBook;
//    }
//
//}

// Результат вывода:

// ClassCastException

// Объяснение к коду:
/**
 * Переменной r типа Readable ссылаемся на переменную eBook перед этим проделав кастинг до Readable: r = (Readable) eBook;
 * Между Readable и ElectronicBook на первый взгляд нет отношения is a. Но переменная eBook типа ElectronicBook
 * может ссылаться не только на объект new ElectronicBook(), но и на его какой-то саб-класс. Допустим, у него есть саб-класс
 * А, и переменная eBook типа ElectronicBook может ссылаться на объект класса А. Саб-класс ElectronicBook А может
 * имплементировать интерфейс Readable, тогда между Readable и А будет отношение is a.
 * Но джава не знает eBook ссылается на саб-класс ElectronicBook или нет. Поэтому кэмпаил тайм джава пропускает такой код,
 * но рантайм определяется, что eBook ссылается на объект new ElectronicBook(), а не на какой-то его саб-класс.
 * А между ElectronicBook и Readable нет is a, поэтому на строке r = (Readable) eBook; будет ошибка ClassCastException.
 */