package ru.site.start.lesson35;

public class All {
}

// Долго записывать объявления по отдельной задаче, а если задач 46, это займет много времени.
// Поэтому чутка записал по первой и второй задаче, а дальше без этого решил делать.
// Просмотрел с 1 по 24 задачу - и без объяснений можно разобраться.


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




// Задание 3
// Какие из следующих фрагментов кода являются корректными?

// A) new Object[]{new Object(), “privet", 18, new ArrayList()};
// B) new Object[]{ “poka", new Object(), {} , new ArrayList()};
// C) new Object[]{new String[]{""}, new Object(), “ok", new ArrayList()};
// D) new Object[1]{ new Object() };

// Результат вывода:

// A и С








// Задание 4
// Что будет результатом компиляции и запуска данного кода?

//class Test {
//
//    public static void main(String[] args) {
//        ArrayList<String> al;
//        if (al != null){ al.add("1"); }
//    }
//
//}

// Результат вывода:

// Compile time error








// Задание 5
// Что будет результатом компиляции и запуска данного кода?

//class Test {
//
//    static int j = 5;
//
//    static void abc(int i) {
//        System.out.println(i);
//    }
//
//    public static void main(String[] args) {
//        abc(j++);
//        System.out.println(j);
//    }
//
//}

// Результат вывода:

// 5 и 6







// Задание 6
// Что будет результатом компиляции и запуска данного кода?

//class Test {
//
//    int x =10;
//    int a=5;
//    int b=10;
//    int c = 4;
//    public double sredArifm() {
//        if (x > 0) {
//            double avg = 0;
//            avg = (a + b + c) / 3;
//            return avg;
//        } else {
//            avg = 0;
//            return avg;
//        }
//    }
//
//}

// Результат вывода:

// Compile time error








// Задание 7
// Что будет результатом компиляции и запуска данного кода?

//class Test {
//
//    public static void main(String[] args) {
//        int a = 8;
//        do {
//            while (a++ < 12) {
//                a += 4;
//            }
//        } while (a < 4);
//        System.out.println(a);
//    }
//
//}

// Результат вывода:

// 14






// Задание 8
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
// Programma prodoljaetsya
// 18







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





// Задание 11
// Что будет результатом компиляции и запуска данного кода?

//class Book {
//
//    String bookName;
//
//    Book() {
//        Book b1 = new Book();
//        b1.bookName = "Java OCA";
//    }
//
//}
//
//class TestBook {
//
//    public static void main(String args[]) {
//        Book b2 = new Book();
//        b2.bookName = "Java OCP";
//        System.out.println(b2.bookName);
//    }
//
//}

// Результат вывода:

// StackOverflowError







// Задание 12
// Что будет результатом компиляции и запуска данного кода?

//class Test {
//
//    void abc() {
//        try {
//            def();
//            return;
//        } finally {
//            System.out.println("finally");
//        }
//    }
//
//    void def() {
//        System.out.println("def");
//        throw new StackOverflowError();
//    }
//
//    public static void main(String args[]) {
//        Test t = new Test();
//        t.abc();
//    }
//
//}

// Результат вывода:

// def
// finally
// StackOverflowError







// Задание 13
// Что будет результатом компиляции и запуска данного кода?

//class Book {
//}
//
//interface Readable {
//}
//
//class PaperBook extends Book implements Readable {
//}
//
//class ElectronicBook extends Book {
//}
//
//class TestBook {
//
//    public static void main(String args[]) {
//        Readable r = null;
//        ElectronicBook eBook = new ElectronicBook();
//        r = (Readable) eBook;
//    }
//
//}

// Результат вывода:

// ClassCastException






// Задание 14
// Что будет результатом компиляции и запуска данного кода?

//class Test {
//
//    public static void main(String[] args) {
//        String[][] array
//                = {{"A", "B", "C"}, null,
//                {"D"}, new String[8]};
//        System.out.println(array);
//        System.out.println(array[1]);
//        System.out.println(array[0][2]);
//        System.out.println(array[3][0]);
//        System.out.println(array[3][5].length());
//    }
//
//}

// Результат вывода:

// [[Ljava.lang.String;@2a139a55
// null
// C
// null
// NullPointerException






// Задание 15
// Что будет результатом компиляции и запуска данного кода?

//class Test {
//
//    public static void main(String[] args) {
//
//        boolean b = false;
//
//        if (b) {
//            System.out.println("privet1");
//        }
//
//        while (b) {
//            System.out.println("poka1");
//        }
//
//        if (1 != 1) {
//            System.out.println("privet2");
//        }
//
//        while (1 != 1) {
//            System.out.println("poka2");
//        }
//
//    }
//
//}

// Результат вывода:

// Compile time error








// Задание 16
// Что будет результатом компиляции и запуска данного кода?

//interface Jumpable{ }
//
//class Cats implements Jumpable { }
//
//class Tiger extends Cats { }
//
//class House { }
//
//class Test {
//
//    public static void main(String[] args) {
//
//        Jumpable j = new Tiger();
//        Tiger t = new Tiger();
//        House h = new House();
//        if(j instanceof Jumpable) {System.out.println("j is Jumpable");}
//        if(t instanceof Cats) {System.out.println("t is Cat");}
//        if(h instanceof Cats) {System.out.println("h is Cat");}
//
//    }
//
//}

// Результат вывода:

// Compile time error








// Задание 17
// Что будет результатом компиляции и запуска данного кода?

//class Test {
//
//    public static void main(String[] args) {
//
//        Integer i = new Integer(5);
//        Long l = new Long(10);
//        Double d = new Double(5);
//        System.out.println(i == l);
//        System.out.println(i.equals(l));
//        System.out.println(i == d);
//        System.out.println(i.equals(d));
//
//    }
//
//}

// Результат вывода:

// Compile time error







// Задание 18
// Что будет результатом компиляции и запуска данного кода?

//class Employee {
//
//    public static void main(String... args) {
//        int id;
//        double salary;
//        System.out.println(id + salary);
//    }
//
//}

// Результат вывода:

// Compile time error








// Задание 19
// Что будет результатом компиляции и запуска данного кода?

//class Employee {
//
//    String name = "Ivan";
//    int id = 5;
//
//    static void printInfo() {
//        System.out.println("Imya studena: " + name + "id: " + id);
//    }
//
//}
//
//class TestEmployee {
//
//    public static void main(String args[]) {
//        Employee emp = new Employee();
//        emp.printInfo();
//    }
//
//}

// Результат вывода:

// Compile time error








// Задание 20
// Что будет результатом компиляции и запуска данного кода?

//class Tiger {
//
//    static int counter = 0;
//
//}
//
//class TestTiger {
//
//    public static void main(String args[]) {
//
//        boolean flag = false;
//
//        while (flag = true) {
//            Tiger.counter++;
//        }
//        System.out.println(Tiger.counter);
//    }
//
//}

// Результат вывода:

// Infinite loop








// Задание 21
// Что будет результатом компиляции и запуска данного кода?

//class Walker {
//
//    public static void main(String args[]) {
//
//        boolean flag = true;
//        do
//            System.out.println("walk and enjoy");
//        flag = false;
//        while (!flag);
//    }
//
//}

// Результат вывода:

// Compile time error









// Задание 22
// Что будет результатом компиляции и запуска данного кода?

//class Test {
//
//    public static void main(String args[]) {
//
//        String s = "";
//        while (false) {
//            s += "hello";
//        }
//        System.out.println(s);
//
//    }
//
//}

// Результат вывода:

// Compile time error









// Задание 23
// Что будет результатом компиляции и запуска данного кода?

//class Test {
//
//    public static void main(String args[]) {
//
//        String array1[] = new String[][]{new String[]{"privet", "poka", "ok"}, {new String()},
//                {null}}[2];
//        String array2[] = {null};
//        String array3[] = null;
//        System.out.println(array1[0]);
//        System.out.println(array2[0]);
//        System.out.println(array3[0]);
//
//    }
//
//}

// Результат вывода:

// null
// null
// NullPointerException










// Задание 24
// Какие из следующих фрагментов кода позволяют вызвать метод abc внутри метода def?

//class MyException extends Exception { }
//
//class Test {
//
//    void abc(double d) throws MyException
//    { System.out.println(d); }
//    void def() {
//// ВСТАВЬТЕ КОД
//    }
//
//}

// A) try { abc(3.14); } catch (Exception e) { }
// B) try { new Test().abc(3.14); } catch (RuntimeException e) { }
// C) try { new Test().abc(3.14); } catch (MyException e) { }
// D) try { new Test().abc(3.14); } finally { }

// Результат вывода:

// А и С








// Задание 25
// Что будет результатом компиляции и запуска данного кода?

//class Test {
//
//    public static void main(String[] args) {
//
//        int i = 5;
//        if (i++ <= 5) {
//            System.out.println(i);
//        }
//
//    }
//
//}

// Результат вывода:

// 6









// Задание 26
// Что будет результатом компиляции и запуска данного кода?

//class Test {
//
//    public static void main(String[] args) {
//
//        int[][] array = {{1, 2}, {3, 4}};
//        int i = 5;
//
//        try {
//            array[abc()][i = 0]++;
//        } catch (Exception e) {
//            System.out.println(i + " " + array[1][1]);
//        }
//
//    }
//
//    static int abc() throws Exception {
//
//        throw new Exception();
//
//    }
//
//}


// Результат вывода:

// 5 4









// Задание 27
// Что будет результатом компиляции и запуска данного кода?

//class A {
//
//    int a = 3;
//
//    int returnA() {
//        System.out.println("Klass A " + a);
//        return a;
//    }
//
//}
//
//class B extends A {
//
//    int a = 5;
//
//    public int returnA() {
//        System.out.println("Klass B " + a);
//        return a;
//    }
//
//    public static void main(String[] args) {
//        A test1 = new B();
//        System.out.println(test1.a + " " + test1.returnA());
//        B test2 = (B) test1;
//        System.out.println(test2.a + " " + test2.returnA());
//    }
//
//}

// Результат вывода:

// Klass B 5
// 3 5
// Klass B 5
// 5 5








// Задание 28
// Что будет результатом компиляции и запуска данного кода?

//class Test {
//
//    static int a = 3;
//    public static void main(String[] args) {
//        int b = 1 + (a = 5);
//        System.out.println(b);
//    }
//
//}

// Результат вывода:

// 6








// Задание 29
// Что будет результатом компиляции и запуска данного кода?

//class A {
//
//    private int a = 3;
//    public void abc() { System.out.println("method abc"); }
//    public void def() { System.out.println("method def"); }
//
//}
//
//class B extends A {
//
//    public int a = 5;
//    public void def() { System.out.println("method def"); }
//
//}
//
//class C {
//
//    public static void main(String[] args) {
//        A test1 = new A();
//        A test2 = new B();
//        System.out.println(test1.a);
//        System.out.println(test2.a);
//    }
//
//}

// Результат вывода:

// Compile time error









// Задание 30
// Какие из конструкторов написаны корректно?

//class Student{
//
//    Student(Student st) { System.out.println("constructor 1");}
//    Student Student( ) { System.out.println("constructor 1");}
//    protected final Student( ) { System.out.println("constructor 1");}
//    void Student( ) { System.out.println("constructor 1");}
//    public static void Student(String args[ ] ) { System.out.println("constructor 1");}
//
//}

// Результат вывода:

// Первый








// Задание 31
// Что будет результатом компиляции и запуска данного кода?

//interface Jumpable{ }
//
//class Cats implements Jumpable { }
//
//class Tiger extends Cats { }
//
//class House { }
//
//class Test {
//
//    public static void main(String[] args) {
//
//        Jumpable j = new Tiger();
//        Tiger t = new Tiger();
//        House h = new House();
//        if(j instanceof Cats) {System.out.println("j is Cat");}
//        if(t instanceof Jumpable) {System.out.println("t is Jumpable");}
//        if(h instanceof Jumpable) {System.out.println("h is Jumpable");}
//
//    }
//
//}

// Результат вывода:

// j is Cat
// t is Jumpable








// Задание 32
// Что будет результатом компиляции и запуска данного кода?

//class Test{
//
//    static int x = abc(1);{
//        x = abc(2);
//    }
//
//    static{
//        x = abc(3);
//    }
//    public static void main(String args[]){
//        Test t = new Test();
//    }
//
//    static int abc(int i){
//        System.out.println(i); return i;
//    }
//
//}

// Результат вывода:

// 1
// 3
// 2







// Задание 33
// Что будет результатом компиляции и запуска данного кода?

//class Test{
//
//    public static void main(String[ ] args){
//        int[] array1 = { -3, 2, 0, 8, 1};
//        int[] array2 = { 9, 0, 4, -10 };
//        System.out.println( array1 [ (array1 = array2)[1] ] );
//    }
//
//}

// Результат вывода:

// -3








// Задание 34
// Что будет результатом компиляции и запуска данного кода?

//class Test {
//
//    public static void main(String[] args) {
//        do {
//            int a = 1;
//            System.out.println(a++);
//        } while (a < 7);
//    }
//
//}

// Результат вывода:

// Compile time error







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









// Задание 36
// Даны 2 пакета со следующими классами. Что будет результатом компиляции и запуска данного кода?

//package p1;
//
//public class A {
//    public static int x = 3;
//}
//
//package p2;
//import p1.*;
//import static p1.A.*;
//
//public class B {
//
//    static A a1 = new A();
//    static A a2 = new A();
//
//    {
//        System.out.println("Vsem xoroshego dnya!");
//    }
//
//    public static void main(String[] args) {
//        a1.x = 5;
//        a2.x = 10;
//        System.out.println(a1.x);
//    }
//
//}

// Результат вывода:

// 10








// Задание 37
// Сколько объектов будут пригодными для удаления их GC на строке с комментарием данного кода?

//class Test {
//
//    Byte b = 10;
//    Test abc(Test t) {
//        t = null;
//        return t;
//    }
//
//    public static void main(String[] args) {
//        Test t1 = new Test();
//        Test t2 = new Test();
//        Test t3 = t1.abc(t2);
//        t1 = null;
//// kommentariy
//    }
//
//}

// Результат вывода:

// 2








// Задание 38
// Что будет результатом компиляции и запуска данного кода?

//class Test2 {
//
//    int a = 3;
//
//    public static Test2 abc(Test2 test1, Test2 test2) {
//        final Test2 b = test1;
//        b.a = 5;
//        return b;
//    }
//
//    public static void main(String[] args) {
//        final Test2 t1 = new Test2();
//        Test2 t2 = new Test2();
//        Test2 t3 = abc(t1, t2);
//        System.out.println(t1 == t3);
//        System.out.println(t1.equals(t3));
//        System.out.println(t1.a == t3.a);
//    }
//
//}

// Результат вывода:

// true
// true
// true








// Задание 39
// Что будет результатом компиляции и запуска данного кода?

//class Test {
//
//    static int a = 3;
//
//    static void abc() {
//        int a = 5;
//        def();
//    }
//
//    static void def() {
//        a += 2;
//        ghi(a);
//        System.out.println(a);
//    }
//
//    static void ghi(int a) {
//        a -= 1;
//    }
//
//    public static void main(String[] args) {
//        abc();
//    }
//
//}

// Результат вывода:

// 5








// Задание 40
// Что будет результатом компиляции и запуска данного кода?

//class Test {
//
//    public static void main(String[] args) {
//
//        int a = 5;
//
//        String s = (a > 3) ? "1" : (a > 0) ? "2" : "3";
//        System.out.println(s);
//
//    }
//
//}

// Результат вывода:

// 1








// Задание 41
// Что будет результатом компиляции и запуска данного кода,
// если программу запускать с помощью следующей строки: java Test ok privet poka

//class Test {
//
//    public static void main(String[] args) {
//
//        String[] array = new String[7];
//        for (int i = 0; i < array.length; i++) {
//            if (i < args.length)
//                array[i] = args[i];
//            System.out.println(array[i].toUpperCase());
//        }
//
//    }
//
//}

// Результат вывода:

// ok
// privet
// poka
// NullPointerEception









// Задание 42
// Сколько объектов были созданы и сколько объектов будут пригодными для удаления их GC
// на строке с комментарием данного кода?

//class Test1 {
//
//    int[] array1 = {-3, 0, 3};
//
//}
//
//class Test2 {
//
//    public static void main(String[] args) {
//
//        Test1[] array2 = new Test1[5];
//        array2[0] = new Test1();
//        Test1 t = new Test1();
//        array2[1] = t;
//        t = null;
//        array2[1] = null;
//
//// kommentariy
//
//    }
//
//}

// Результат вывода:

// Созданы: 5
// Пригодны для удаления: 2








// Задание 43
// Что будет результатом компиляции и запуска данного кода?

//class Test {
//
//    public static void main(String[] args) {
//        String s1 = "ok";
//        String s2 = s1;
//        s1 += "!!!";
//        System.out.println(s1 + ", " + s2 + ", " + (s1 == s2) + ", " + s1.equals(s2));
//        StringBuilder sb1 = new StringBuilder("ok");
//        StringBuilder sb2 = sb1;
//        sb1.append("!!!");
//        System.out.println(sb1 + ", " + sb2 + ", " + (sb1 == sb2) + ", " + sb1.equals(sb2));
//    }
//
//}

// Результат вывода:

// ok!!!, ok, false, false
// ok!!!, ok!!!, true, true







// Задание 44
// Что будет результатом компиляции и запуска данного кода?

//class Test {
//
//    public static void main(String[] args) {
//        while (true) {
//            System.out.println("privet");
//        }
//        System.out.println("poka");
//    }
//
//}

// Результат вывода:

// Compile time error








// Задание 45
// Что будет результатом компиляции и запуска данного кода?

//class Test {
//
//    static String s = "";
//
//    public static void main(String[] args) {
//        try {
//            throw new RuntimeException();
//        } catch (Exception e1) {
//            try {
//                try {
//                    throw new Exception();
//                } catch (Exception e2) {
//                    s += "1";
//                }
//                throw new Exception();
//            } catch (Exception e3) {
//                s += "2";
//            } finally {
//                s += "3";
//            }
//        } finally {
//            s += "4";
//        }
//        System.out.println(s);
//    }
//
//}

// Результат вывода:

// 1234










// Задание 46
// Что будет результатом компиляции и запуска данного кода?

//class Test {
//
//    static String s = "";
//
//    public static void main(String[] args) {
//        int[] array = {1, 2, 5, 8};
//        for (int a : array) {
//            for (int j = 0; j < 4; j++) {
//                if (a > 1.5 && a < 6) {
//                    continue;
//                }
//                System.out.println(a);
//                if (j == 1)
//                    break;
//                continue;
//            }
//            continue;
//        }
//    }
//
//}

// Результат вывода:

// 1
// 1
// 8
// 8
