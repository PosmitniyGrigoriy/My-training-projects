package ru.site.start.lesson25;

public class Start2 {
}

class Car {
    static int a = 5;
    int b = 7;
    public static void main(String[] args) {
        // В коде используется статическая переменная а
        Car car1 = new Car();
        System.out.println(car1.a); // 5
        System.out.println(a); // 5
        car1 = null;
        System.out.println("--------"); // Вывод после того, как объект стал null
        System.out.println(car1.a); // 5
        System.out.println(a); // 5

        System.out.println("--------");

        // В коде используется обычная переменная b
        Car car2 = new Car();
        System.out.println(car2.b); // 7
//        System.out.println(b); // Это обычная переменная и так ее вывести нельзя. Только через переменную объекта.
        car2 = null;
        System.out.println("--------"); // Вывод после того, как объект стал null
        // Так как сверху переменная car2 была заналина, то ниже переменная выведет нал поинтер (car2.b).
        // Но если до этой переменной создать снова объект, уже car3, и там вызывать переменную c, то она будет равна 7.
        // Получается сверху кода переменная сохранила свое значение, просто не выводит его так как объект занален.
        System.out.println(car2.b); // null pointer. Так как объект наналили и потом на нал пытаются узнать значение. Будет нал поинтер.
//        System.out.println(b); // Это обычная переменная и так ее вывести нельзя. Только через переменную объекта.
    }
}

/**
 * Оператор instanceof
 * instanceof - в переводе значит - объект ли.
 *
 * Пример:
 * Car c = new Car();
 * System.out.println(c instanceof Object);
 *
 * Переменная c является объектом класса Object? Да, поэтому выводится на экран true.
 *
 * Оператор instanceof помогает определить является ли какой-то объект объектом конкретного класса,
 * если между этими объектами есть отношение is-a.
 *
 * Оператор instanceof проверяет есть ли между объектм и классом/интерфейсом связь is-a.
 * Если связь is-a невозможна, то компилятор выдает ошибку.
 *
 * Примеры ниже:
 */

class q2 {
    public static void main(String[] args) {
        Employee51 emp1 = new Teacher51();
        Employee51 emp2 = new Driver51();
        Employee51 emp3 = new Doctor51();
        Help21_able21 h = new Teacher51();

        Employee51[] array4 = { emp1, emp2, emp3 };

        System.out.println(emp1 instanceof Employee51); // true - потому что emp1 - это Employee51. Переменная emp1 на что ссылается? На new Teacher51(). new Teacher51() - это Employee51.
        System.out.println(emp1 instanceof Teacher51); // true
        System.out.println(emp1 instanceof Driver51); // false
        System.out.println(emp1 instanceof Help21_able21); // true
//        System.out.println(emp1 instanceof q2); // компиляционная ошибка, так как нет связи is a.


        String s1 = null;
        System.out.println(s1 instanceof String); // false - потому что null не относится к String

        String s2 = "Текст";
        System.out.println(s2 instanceof String); // true - потому что s2 содержит значение String.

        System.out.println(array4 instanceof Object); // true: массив - это объект? Да.

        Object object = new Object();
        System.out.println(object instanceof Teacher51); // false: Объект - это Teacher51? Нет. Не каждый объект может быть Teacher51. В этом случае - объект не является Teacher51. Но каждый Teacher51 - это объект.

    }
}

class Employee51 implements Help21_able21 { public void work() { System.out.println("Рабочий"); } }
class Teacher51 extends Employee51 { public void work() { System.out.println("Учитель"); } }
class Driver51 extends Employee51 { public void work() { System.out.println("Водитель"); } }
class Doctor51 extends Employee51 { public void work() { System.out.println("Доктор"); } }
interface Help21_able21 { void work(); }