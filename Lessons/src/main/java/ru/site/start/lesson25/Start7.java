package ru.site.start.lesson25;

public class Start7 {
}

// Тесты


// Задание 1
// Каков будет результат компиляции и запуска данного кода?

class Test1 implements interface1, interface2{
    public void abc() { System.out.println("OK"); }
    public static void main(String[] args){
        Test1 t = new Test1();
        ((interface1)t).abc(); // Метод abc принадлежит переменной t, а она типу Test1. Затем Test1 кастим до интерфейса. Затем во время ран тайм баиндин происходит переопределение метода (используется класс Test1, где new ...) и выводится саут ОК.
//        t.abc(); // Можно как с кастин (как сверху), так и без (как на этой строке)
    }
}
interface interface1{
    int a = 5;
    void abc();
}
interface interface2{
    int a = 10;
    void abc();
}

// Результат вывода: ОК
// Метод abc с интерфейса 1 и 2 переопределен в Test1. Но потом через кастин указывается какой именно интерфейс брать, где абстрактный метод.
// Чтобы вывести переменную, нужно в саут помещать interface1.a или interface2.a. Название интерфейса + переменная. Переменная не видна, в отличи от метода, если также ее вызывать как метод.




// Задание 2
// Рассмотрите данный код:

//class Employee {
//    void sleep() { System.out.println("Employee sleeps"); } }
//class Doctor extends Employee {
//    void sleep() { System.out.println("Doctor sleeps"); } }
//class Test2 {
//    public static void main(String [] args) {
//        Employee e = new Employee();
//// some code
//        e.sleep();
//        x.sleep();
//    }
//}

//     Какие выражения (по отдельности) могут быть написаны на строке //some code чтобы на экран выводилось:
//        Employee sleeps
//        Doctor sleeps

// Варианты:
//        A) Employee x = new Employee();
//        B) Employee x = new Doctor();
//        C) Doctor x = new Doctor();
//        D) Doctor x = new Employee();
//        E) Employee x = (Doctor)new Employee();
//        F) Doctor x = (Doctor)new Employee();






// Задание 3
// Каков будет результат компиляции и запуска данного кода?

class Animal {
}
class Mouse extends Animal {
    void abc() {
        def(new Animal(), new Mouse());
        def((Mouse) new Animal(), new Mouse());
    }
    void def(Animal a1, Mouse m1) {
        Mouse m2 = (Mouse) a1;
        Animal a2 = (Animal) m1;
    }
    public static void main(String[] args) {
        new Mouse().abc();
    }
}

