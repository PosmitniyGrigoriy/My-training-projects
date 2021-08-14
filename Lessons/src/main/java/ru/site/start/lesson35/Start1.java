package ru.site.start.lesson35;

public class Start1 {
}

// Задание 1
// Что будет результатом компиляции и запуска данного кода?

//class B extends A {
//
//    public int a = 20;
//
//    public void abc() {
//        System.out.println("child non-static");
//    }
//
//    public static void abc2() {
//        System.out.println("child static");
//    }
//
//    public static void main(String[] args) {
//        B b = new B();
//        System.out.println(b.a);
//        System.out.println(((A) b).a);
//        b.abc();
//        ((A) b).abc();
//        b.abc2();
//        ((A) b).abc2();
//    }
//
//}
//
//class A {
//
//    public int a = 10;
//
//    public void abc() {
//        System.out.println("base non-static");
//    }
//
//    public static void abc2() {
//        System.out.println("base static");
//    }
//
//}

// Результат вывода:

// 20
// 10
// child non-static
// child non-static
// child static
// base static

// Объяснение к коду:
    /**
     * Есть класс А. Он имеет переменную, обычный метод и статический метод.class
     * Есть класс Б. Он наследует класс А. Хайдит переменную класса А, переопределяет метод abc и
     * хайдит статический метод из класса А.
     * Далее создается объект Б, на которую ссылается переменная Б.
     * Так как при создании объекта указан тип Б (до равно), то вызовится в первом сауте переменная а из класса Б.
     * Затем во втором сауте выводит тоже переменную А от объекта Б (переменная),
     * но указываем тип А (кастим до класса А). Кастить можно. Потому что Б - это всегд А.
     * Так как указан сейчас через кастинг класс А, то переменная А вызовится у класса А (10, а не 20).
     * Концовка была не понятно, так не что не записал.
     */
