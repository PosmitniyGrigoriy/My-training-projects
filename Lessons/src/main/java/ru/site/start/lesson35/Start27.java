package ru.site.start.lesson35;

public class Start27 {
}

// Задание 27
// Что будет результатом компиляции и запуска данного кода?

class A {

    int a = 3;

    int returnA() {
        System.out.println("Klass A " + a);
        return a;
    }

}

class B extends A {

    int a = 5;

    public int returnA() {
        System.out.println("Klass B " + a);
        return a;
    }

    public static void main(String[] args) {
        A test1 = new B();
        System.out.println(test1.a + " " + test1.returnA());
        B test2 = (B) test1;
        System.out.println(test2.a + " " + test2.returnA());
    }

}

// Результат вывода:

// Klass B 5
// 3 5
// Klass B 5
// 5 5

// Объяснение к коду:
/**
 * Класс В хайдит переменную а и переопределяет метод returnA.
 * Test1 ссылается на new B().
 * В первом сауте: System.out.println(test1.a + " " + test1.returnA());
 * Переменная а test1.a кэмпаил тайм определяется по типу класса А. Готовится на вывод 3,
 * но пока не выводится, так как еще не весь известен первый саут (там еще метод есть в сауте).
 * test1.returnA() ссылается на объект класса B (... = new B();), поэтому метод будет переопределен
 * и выведется "Klass B " + 5. Также метод, кроме сауте имеет еще return int. Вернет еще 5.
 * И к первой 3 нужно дописать еще 5. Получается вывод в две строки:
 * // Klass B 5
 * // 3 5
 *
 * Затем переменная test2 ссылается на тот же объект, что и test1, но test1 кастится до B.
 * Далее идет второй саут: System.out.println(test2.a + " " + test2.returnA());
 * Переменная а определяется кэпмаил тайм: test2.a. Выводится из класса В, потому что тип В. Выведется 5.
 * Затем идет test2.returnA() - метод вызывается из класса В. Это ран тайм определяется.
 * Метод returnA() в классе В выводит на экран "Klass B " + 5. И возвращает 5. Было 5 и дописалось еще 5.
 * // Klass B 5
 * // 5 5
 */