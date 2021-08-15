package ru.site.start.lesson35;

import java.io.*;

public class Start9 {
}

// Задание 9
// Что будет результатом компиляции и запуска данного кода?

//class Test {
//
//    public static void main(String args[]) {
//        int a = abc();
//        System.out.println(a);
//    }
//
//    static int abc() {
//        try {
//            FileInputStream fis = new FileInputStream("file_kotorogo_net.txt");
//        } catch (FileNotFoundException e) {
//            System.out.println("file ne nayden");
//            return 17;
//        } finally {
//            System.out.println("eto finally block");
//        }
//        System.out.println("Programma prodoljaetsya");
//        return 18;
//    }
//
//}

// Результат вывода:

// file ne nayden
// eto finally block
// 17

// Объяснение к коду:
/**
 * Так как не правильно указан файл, выбрасывается иксепшин.
 * Выводится первый саут. Затем метод возвращает 17.
 * Копия этого значения (17) готова возвращена методом.
 * Перед этим выполняется файнали блок. Выводится второй саут.
 * Затем выводится на экране 17.
 * На третий саут программа не заходит и тем более на return 18.
 */