package ru.site.start.lesson35;

public class Start31 {
}

// Задание 31
// Что будет результатом компиляции и запуска данного кода?

//interface Jumpable{ }
//
//class Cats implements Jumpable { }
//
//class Tiger extends Cats { }
//
//class House { }
//
//class Test {
//
//    public static void main(String[] args) {
//
//        Jumpable j = new Tiger();
//        Tiger t = new Tiger();
//        House h = new House();
//        if(j instanceof Cats) {System.out.println("j is Cat");}
//        if(t instanceof Jumpable) {System.out.println("t is Jumpable");}
//        if(h instanceof Jumpable) {System.out.println("h is Jumpable");}
//
//    }
//
//}

// Результат вывода:

// j is Cat
// t is Jumpable

// Объяснение к коду:
/**
 * j может ссылаться на Tiger? Да.
 * Тип Tiger t может ссылаться на объект new Tiger? Да.
 * Переменная h типа House может ссылаться на объект new House.
 * Это объяснения для первых трех строк внутри метода мэин.
 * На следующих трех строк, где if, объяснения ниже:
 * j может быть instanceof Cats? j какого типа? j типа Jumpable. Jumpable может быть Cats? Да.
 * t какого типа? Tiger. Tiger может быть jumpable? Да.
 * h может быть instanceof Jumpable? h типа House может ссылаться на объект House. И h может также ссылаться
 * на объект класса A. Не понятно откуда взялся этот класс A. А A это саб-класс h. В первом случае,
 * если бы h мог ссылаться на объект типа house, тогда компилятор знал бы что,
 * между houser и jumpable нет связи, но саб-класс А может имплементировать jumpable.
 * И тогда между h, который ссылается на саб-класса А и jumpable, возможна связь is a.
 * Компилятор, зная возможность этой связи is a, не может выдать ошибку на строке
 * if(h instanceof Jumpable) {System.out.println("h is Jumpable");}.
 * На этой строке нет ошибки компиляции. Тогда runtime происходит проверка:
 * j ссылается на объект Tiger. Tiger типа Cats? Да. Поэтому выводится первый саут.
 * t ссылается на объект Tiger. Tiger это Jumpable? Да. Поэтому выводится второй саут.
 * runtime определяет что h ссылается на объект House (после равно). House h = new House(); но строка ниже, где иф
 * if(h instanceof Jumpable) {System.out.println("h is Jumpable");}
 * здесь между j и Jumpable нет связи is a. House - это не Jumpable. Поэтому третий саут не выведется.
 */