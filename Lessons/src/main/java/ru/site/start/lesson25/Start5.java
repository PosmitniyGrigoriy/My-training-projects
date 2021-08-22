package ru.site.start.lesson25;

public class Start5 {
    public static void main(String[] args) {
        String[] array = {"Привет", "Пока", "Ок"};
        Object[] array2 = array;
        // В array2 можно положить array, так как любой массив строк можно положить в массив объектов (Object).   */

        // Но не все объекты можно положить в массив строк. Поэтому нужно кастить.
        String[] array3 = (String[])array2;

//        array3[0] = new StringBuilder("QQQ"); // Так нельзя писать. Будет коспиляционная ошибка. array3 типа String, его нулевой элемент может содержать StringBuilder? Нет.
        array2[0] = new StringBuilder("QQQ"); // Так можно написать, но во время ран тайм будет иксепшин. Переменная array2 имеет ссылку на array. А Array имеет тип String. Получается в array2 можно положить объекты типа String, а здесь StringBuilder. Поэтому и ошибка. Нельзя ложить один тип в другой, когда типы не совместимы.
    }
}

// Ниже другая тема.

class Test10 {
    int a = 5;
    void abc() {
        System.out.println("Ok 1");
    }
}

class Test20 extends Test10 {
    int a = 8;
    void abc() {
        System.out.println("Ok 2");
    }
}

class Test30 extends Test20 {
    int a = 10;
    void abc() {
        super.abc(); // Вызывается метод abc с класса Test20. Но метод abc с класса Test10 в теле класса Test30 не получится вызывать. Нельзя дважды написать super.super.abc();
        System.out.println("Ok 3");
    }
}

class Q111 {
    public static void main(String[] args) {
        Test30 test30 = new Test30();
        System.out.println(test30.a); // 10
        System.out.println(((Test20)test30).a); // 8
        System.out.println(((Test10)test30).a); // 5
        test30.abc();
    }
}

// Из-за того, что переменные относятся к кэмпаил тайм баиндин, то они сразу определяются какая будет работать, исходя из указанного типа. когда кастится переменная - меняется тип и сразу определяется переменная, которая будет работать.
