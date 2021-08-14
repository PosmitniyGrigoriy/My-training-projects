package ru.site.start.lesson35;

public class Start2 {
}

// Задание 2
// Что будет результатом компиляции и запуска данного кода?

//class A {
//
//    public A() {
//        str1 = abc("String1");
//    }
//
//    static String str1 = abc("String2");
//    String str3 = abc("String3");
//
//    {
//        str1 = abc("String4");
//    }
//
//    static {
//        str1 = abc("String5");
//    }
//
//    static String str2 = abc("String6");
//    String str4 = abc("String7");
//
//    public static void main(String args[]) {
//        A a = new A();
//    }
//
//    static String abc(String str) {
//        System.out.println(str);
//        return str;
//    }
//
//}

// Результат вывода:

// String2
// String5
// String6
// String3
// String4
// String7
// String1

// Объяснение к коду:
    /**
     * В первую очередь выполняются статические переменные и статические инициализаторы. Они срабатывают по порядку.
     */
