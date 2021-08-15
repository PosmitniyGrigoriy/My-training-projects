package ru.site.start.lesson35;

public class Start11 {
}

// Задание 11
// Что будет результатом компиляции и запуска данного кода?

//class Book {
//
//    String bookName;
//
//    Book() {
//        Book b1 = new Book();
//        b1.bookName = "Java OCA";
//    }
//
//}
//
//class TestBook {
//
//    public static void main(String args[]) {
//        Book b2 = new Book();
//        b2.bookName = "Java OCP";
//        System.out.println(b2.bookName);
//    }
//
//}

// Результат вывода:

// StackOverflowError

// Объяснение к коду:
/**
 * В мэин есть строка Book b2 = new Book();
 * Джава заходит на new Book(), чтобы создать новый объект, затем видит, что есть кэнстрактэ.
 * Заходит туда. Там на первой строке опять строка создания объекта: Book b1 = new Book();
 * Джава создает снова новый объект, так как там тоже написано new Book(). Для этого нужно снова зайти в кэнстрактэ.
 * Заходит туда на new Book() и опять создает новый объект на этой же строке Book b1 = new Book();
 * и так много раз, пока не появится ошибка StackOverflowError - стэк переполнен (заполняется вся память и выбрасывается ошибка).
 */