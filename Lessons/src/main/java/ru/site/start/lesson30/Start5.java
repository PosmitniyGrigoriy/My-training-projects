package ru.site.start.lesson30;

import java.util.ArrayList;

public class Start5 {

    public static void main(String[] args) {

        testInferenceType testInferenceType = new testInferenceType(); // v1
        var testInferenceType2 = new testInferenceType(); // v2 - var позвол€ет сократить код, джава поймет какой тип нужно вместо var использовать, так как после равно указан класс = new ...  огда будет компил€ци€ кода, то var заменитс€ на название класса.

        //  ак можно еще писать var:
        var a = 30; // Integer
        var b = 3.0f; // Float
        var c = 3044944848447444L; // Long
        var array = new String[]{"sss", "xxx"}; // Array

        Object obj1 = "ѕривет";
        var obj2 = obj1;

        ArrayList<String> listTexts = new ArrayList<>();
        for(var s : listTexts) { // var заменитс€ на тип String
            System.out.println(s);
        }

        // “акже var можно указать в параметры метода (левую часть л€мбды) вместо типа. “огда var заменитс€ на тип в абстрактном методе

        var result = abc(); // Ёто к методу ниже

    }

    static double abc() { return 3.14; };

}

// local variable type inference. inference - подразумиваемый, делать вывод
// var. var относитс€ только к локальным переменным. var можно писать только в каком-то методе, а не в классе сразу (вне метода)
// var нельз€ писать в параметрах метода
// Ќельз€ писать var h; Ќужно сразу значение указывать, чтобы джава определила тип
// Ќельз€ писать var x = null; так как null - не пон€тно какой тип
// Ќельз€ писать statis var abc() { return 3.14 ; }; в return type нельз€ писать var
// var использовать так, чтобы код был читабельным. в случае с методом выше. в методе указан ритен тайп, а когда метод вызываетс€ в мэин, там вар и не пон€тно что должен вернуть метод.  од должен быть читабельным.

class testInferenceType {

}