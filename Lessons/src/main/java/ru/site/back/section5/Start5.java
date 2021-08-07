package ru.site.back.section5;

// Локальные вложенные классы - локальны для какого-то метода или блока кода
public class Start5 {

    public static void main(String[] args) {

        Math2 math2 = new Math2();
        math2.getResult();

    }

}

class Math2 {
    public void getResult() {

        int a = 10;
        a = 4;

        // Класс Delenie недоступен вне метода getResult. Чтобы класс был виден, нужно создать объект Math2 и вызвать метод getResult.
        // Локальные переменные внутри тела метода не могут быть статичны, так как их не вызвать вне тела метода, тоже самое и у вложенных классов. Их нельзя делать стэтик.
        // Вложенные классы повышают инкапсуляцию
        // Локальные вложенные классы располагаются в блоках кода таких, как, метод или кэнстрактэ.

        // Локальный вложенный класс может обращаться к элементам блока, в котором он написан при условии, что они final или effectively final. final - это переменная которую нельзя поменять. а effectively final - это переменная без final, int delemoe = 20, и на второй строке меняем значение delimoe = 14; тогда эту переменную нельзя использовать в коде, так как она изменена, а это не final. Без файнал тоже можно использовать переменные, но менять их нельзя. В локальных классах такие переменные использовать нельзя. Переменные на две строки писать в методе, а не в классе.
        /**
         * Если написать int delimoe = 21 в классе Math2 (не в классе Delinie), то вместо метода getDelimoe() можно использовать переменную.
         * Будет работать. Если указать final, то ниже нельзя будет изменить переменную delimoe = 10 (уже без инт). Но если так написать (на второй строке новое значение), то нельзя будет использовать эту переменнюу внутри иннер класса, так как переменная должна быть final или effectively final.
         */
        // При написании вложенного класса можно наследовать другой класс и можно имплементировать интерфейс.
        // Уровень доступа у вложенных классов дэфайл. Нельзя сделать паблик.Это вложенный класс, а не основной. а вложенный не вызвать, если он паблик.

        class Delenie {

            public void test() {
//                System.out.println(a); // Нельзя использовать переменную, так как она изменена. Можно использовать файнал переменную.
            }

            void changeVariable() {
//                a = 3; // Менять переменную нельзя (в этом примере), а в примере выше - нельзя вывести переменную, так как она изменена.
            }

            private int delimoe;
            private int delitel;

            public int getDelimoe() {
                return delimoe;
            }

            public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }

            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }

            public int getChastnoe() {
                return delimoe / delitel;
            }

            public int getOstatok() {
                return delimoe % delitel;
            }
        }

        Delenie delenie = new Delenie();
        delenie.setDelimoe(21);
        delenie.setDelitel(4);
        System.out.println("Делимое = " + delenie.getDelimoe());
        System.out.println("Делитель = " + delenie.getDelitel());
        System.out.println("Частное = " + delenie.getChastnoe());
        System.out.println("Остаток = " + delenie.getOstatok());

    }

}