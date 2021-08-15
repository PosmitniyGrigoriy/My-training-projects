package ru.site.start.lesson35;

public class Start16 {
}

// Задание 16
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
//        if(j instanceof Jumpable) {System.out.println("j is Jumpable");}
//        if(t instanceof Cats) {System.out.println("t is Cat");}
//        if(h instanceof Cats) {System.out.println("h is Cat");}
//
//    }
//
//}

// Результат вывода:

// Compile time error

// Объяснение к коду:
/**
 * Сначала с методе мэин создается объект new Tiger(); , на который ссылается переменная типа Jumpable. Первая строка.
 * Затем создается новый объект new Tiger() , на который ссылается переменная типа Tiger. Вторая строка.
 * Затем создается новый объект new House(), на который ссылается переменная типа House. Третья строка.
 *
 * У нас есть интерфейс Jumpable,
 * класс Cats, который имплементирует Jumpable,
 * класс Tiger, который наследует класс Cats,
 * класс House.
 *
 * Что происходит во время кэмпаил тайм:
 * Оператор instanceof не выдает ошибку компиляции, когда между ссылочной переменной j и классом Jumpable есть отношение is a.
 * j какого типа? Jumpable. Jumpable может быть Jumpable? Да.
 *
 * t какого типа? Tiger. Tiger может быть типа Cats? Да.
 *
 * h какого типа? House. h может быть instanceof Cats? То есть объект, на который ссылается h может быть типа Cats?
 * h может ссылаться как на объект типа House (между House и Cats никакой связи is a нет).
 * h также может ссылаться на саб-класс House. Допустим у House есть саб-класс А. Если h ссылается на саб-класс
 * класса House, то между А и Cats все равно нет никакой связи.
 * Поэтому компилятор не пропускает наш код на строке if(h instanceof Cats) {System.out.println("h is Cat");}
 */