package ru.site.start.lesson35;

public class Start32 {
}

// Задание 32
// Что будет результатом компиляции и запуска данного кода?

//class Test{
//
//    static int x = abc(1);
//
//    {
//        x = abc(2);
//    }
//
//    static {
//        x = abc(3);
//    }
//
//    public static void main(String args[]) {
//        Test t = new Test();
//    }
//
//    static int abc(int i) {
//        System.out.println(i); return i;
//    }
//
//}

// Результат вывода:

// 1
// 3
// 2

// Объяснение к коду:
/**
 * В мэин создается объект класса Тest.
 * Сначала срабатывают статические переменные. static int x = abc(1);
 * Затем срабатывают статические инициализаторы. static { x = abc(3); }
 * Затем срабатывают не статические инициализаторы. { x = abc(2); }
 */