package ru.site.start.lesson35;

public class Start35 {
}

// Задание 35
// Что будет результатом компиляции и запуска данного кода?

//class Test {
//
//    public static void abc() {
//        System.out.print("method abc");
//    }
//
//    public void def() {
//        System.out.println("method def");
//    }
//
//    public static void hig() {
//        abc();
//        def();
//    }
//
//    public static void main(String[] args) {
//        Test t = null;
//        t.hig();
//    }
//
//}

// Результат вывода:

// Compile time error

// Объяснение к коду:
/**
 * Test t = null; - так можно писать. Дело не в этом.
 * В статическом методе hig() нельзя вызывать не статический метод def().
 */