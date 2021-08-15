package ru.site.start.lesson35;

import java.io.*;

public class Start10 {
}

// Задание 10
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
//            return 16;
//        }
//        System.out.println("Programma prodoljaetsya");
//        return 18;
//    }
//
//}

// Результат вывода:

// Compile time error

// Объяснение к коду:
/**
 * Так как не правильно указан файл, выбрасывается иксепшин.
 * Выводится первый саут. Затем метод возвращает 17.
 * Копия этого значения (17) готова возвращена методом.
 * Перед этим выполняется файнали блок. Выводится второй саут.
 * Значение 17 из первого return заменяется на значение второго return. 16.
 * Теперь на вывод уже будет не 17, а 16.
 * Если есть 1 return в catch блоке, и еще 1 return в finally блоке,
 * то всегда выводиться будет значение return, который в finally блоке.
 * Затем блок finally заканчивается и ниже идет еще третий саут и return 18.
 * Эти 2 строки - анричибл стэйтмэн. Программа никогда не дойдет до этих строк,
 * поэтому будет компиляционная ошибка. Если последние 2 строки закомментировать
 * (саут и return 18), то программа запустится и выведет 3 строки: первый саут,
 * второй саут и 16.
 */