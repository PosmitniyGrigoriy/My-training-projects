package ru.site.start.lesson25;

public class Start1 {
}

/**
 * Полиморфизм:
 *
 * Полиморфизм - это множество форм.
 * Полиморфизм - это способность объекта принимать несколько форм.
 * Объект в Джава считается полиморфным, если он имеет более одной связи is-a.
 * Полиморфизм - это способность метода вести себя по-разному в зависимости от того, объект какого класса вызывает этот метод.
 * То есть когда метод переопределяется - это и есть полиформизм. Есть класс Emoloyee и там есть метод work и саут "сотрудник работает".
 * Есть саб-класс доктор и там есть метод work и в сауте "Доктор работает". Будет наследование и переопределение метода.
 * Это и есть полиморфизм.
 *
 * Любой объект в джаве имеет более одной связи, кроме Object.
 * Car car = new Car();
 * Object object = new Car();
 * Выше две строки - объект Car имеет две связи. Поэтому это полимиофизм. А Object имеет одну связь - с собой.
 *
 * Перезаписанные методы часто называют полиморфными. Потому то зависимость от реального объекта, который будет вызывать
 * этот метод - будет вызывать тот или иной метод.
 */

class q {
    public static void main(String[] args) {
        Employee5 emp1 = new Teacher5();
        Employee5 emp2 = new Driver5();
        Employee5 emp3 = new Doctor5();
        Help2_able2 h = new Teacher5();
        System.out.println("------");
        h.work();
        emp1.work();
        emp2.work();
        emp3.work();

        System.out.println("------");

        Driver5[] array1 = { new Driver5(), new Driver5() };
        Employee5[] array2 = { new Driver5(), new Driver5(), new Teacher5(), new Doctor5() };
        Help2_able2[] array3 = { new Driver5(), new Driver5(), new Teacher5(), new Doctor5() };

        // Создать сверху объекты, затем на строку ниже положить их в массив.
        // Далее через фор ич пройтись по всем объектам в массиве и по каждому объекту запустить метод работать
        // Это полиморфизм
        Employee5[] array4 = { emp1, emp2, emp3 };
        for(Employee5 e : array4) {
            e.work();
        }
    }
}

class Employee5 implements Help2_able2 { public void work() { System.out.println("Рабочий"); } }
class Teacher5 extends Employee5 { public void work() { System.out.println("Учитель"); } }
class Driver5 extends Employee5 { public void work() { System.out.println("Водитель"); } }
class Doctor5 extends Employee5 { public void work() { System.out.println("Доктор"); } }
interface Help2_able2 { void work(); }