package ru.site.start.lesson25;

public class Start3 {
}

class w2 {
    public static void main(String[] args) {
        Jumpable j = new Man();
        Man m = new Man();
        Student s = new Student();
        if(j instanceof Man) { System.out.println("j is Man"); } // j на что ссылается? на Man (то есть на new Man()). Всегда проверяется объект, который был создан, а не тип. j - это какой объект? Man. Man имеет отношение к Jumpable? Да. Man имплементирует Jumpable. Не сам, но через суперкласс Human.
        if(m instanceof Human) { System.out.println("m is Human"); }
//        if(s instanceof Human) { System.out.println("s is Human"); } // Будет компиляционная ошибка, так как Student - это класс, и у этого класса нет наследования и имплементирования. Но этот класс может иметь саб-класс, и саб-класс может наследовать класс Human. Но если саб-класс будет наследоваться на Student, то второй раз наследование нельзя сделать на класс Human. А здесь сравнивается s - это Human? Нет. И не может быть. Поэтому ошибка. Два суперкласса у саб-класса быть не может в наследовании, поэтому джава делает такой анализ и не допускает такой instanceof. Выдает компиляционную ошибку.
        if(s instanceof Jumpable) { System.out.println("s is Jumpable"); } // Между student и jumpable тоже нет связи is a. мы знаем что связи нет, потому что видим. но компилятор не знает. Student s (до равно) может ссылаться на саб класс Student. Компилятор не знает имплементировал ли саб-класс Student интерфейс Jumpable. Компилятор знает, что сам класс не имплементировал интерфейс Jumpable (Student), но про саб-класс он не знает.
        // Если будет указан класс в instanceof, то будет ошибка, как в примере выше на две строки. А если будет указан интерфейс, то уже компиляционной ошибки нет, просто не выведет этот саут, если связи не будет, а там связи нет, так что саут не выведется (будет false). Если будет саб-класс и он имплементирует Jumpable, или основной класс Student имплементирует Jumpable, то будет true.
    }
}

interface Jumpable {}
class Human implements Jumpable {}
class Man extends Human {}
class Student {}
