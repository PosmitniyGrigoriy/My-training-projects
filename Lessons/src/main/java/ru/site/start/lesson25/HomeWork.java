package ru.site.start.lesson25;

public class HomeWork {

    public static void main(String[] args) {

        Animal3 a1 = new Mechenosec("Имя 1");
        Animal3 a2 = new Pingvin("Имя 2");
        Animal3 a3 = new Lev("Имя 3");
        Mechenosec a4 = new Mechenosec("Имя 4");
        Pingvin a5 = new Pingvin("Имя 5");
        Lev a6 = new Lev("Имя 6");
        Fish a7 = new Mechenosec("Имя 7");
        Bird a8 = new Pingvin("Имя 8");
        Mammal a9 = new Lev("Имя 9");
        Speakable a10 = new Pingvin("Имя 10");
        Speakable a11 = new Lev("Имя 11");

        Speakable[] arraySpeakables = { a5, a6, a8, a9, a10, a11 };
        Animal3[] arrayAnimals = { a1, a2, a3, a4, a5, a6, a7, a8, a9 };

        System.out.println("Эти объекты связаны с интерфейсом Speakable");
        System.out.println("\n==========================================\nОбъекты, связанные с Animal3\n");
        for (Speakable entity : arraySpeakables) {
            if (entity instanceof Animal3) {
                System.out.println(((Animal3) entity).name);
                ((Animal3) entity).eat();
                ((Animal3) entity).sleep();
            }
        }
        System.out.println("\n==========================================\nОбъекты, связанные с Speakable\n");
        for (Speakable entity : arraySpeakables) {
            if (entity instanceof Speakable) {
                ((Speakable) entity).speek();
            }
        }
        System.out.println("\n==========================================\nОбъекты, связанные с Mechenosec\n");
        for (Speakable entity : arraySpeakables) {
            if (entity instanceof Mechenosec) {
                System.out.println(((Mechenosec) entity).name);
                ((Mechenosec) entity).eat();
                ((Mechenosec) entity).sleep();
                ((Mechenosec) entity).swim();
            }
        }
        System.out.println("\n==========================================\nОбъекты, связанные с Pingvin\n");
        for (Speakable entity : arraySpeakables) {
            if (entity instanceof Pingvin) {
                System.out.println(((Pingvin) entity).name);
                ((Pingvin) entity).eat();
                ((Pingvin) entity).sleep();
                ((Pingvin) entity).speak();
                ((Pingvin) entity).fly();
            }
        }
        System.out.println("\n==========================================\nОбъекты, связанные с Lev\n");
        for (Speakable entity : arraySpeakables) {
            if (entity instanceof Lev) {
                System.out.println(((Lev) entity).name);
                ((Lev) entity).eat();
                ((Lev) entity).sleep();
                ((Lev) entity).speek();
                ((Lev) entity).run();
            }
        }
        System.out.println("\n==========================================\nОбъекты, связанные с Fish\n");
        for (Speakable entity : arraySpeakables) {
            if (entity instanceof Fish) {
                System.out.println(((Fish) entity).name);
                ((Fish) entity).eat();
                ((Fish) entity).sleep();
                entity.speek();
                ((Fish) entity).swim();
            }
        }
        System.out.println("\n==========================================\nОбъекты, связанные с Bird\n");
        for (Speakable entity : arraySpeakables) {
            if (entity instanceof Bird) {
                System.out.println(((Bird) entity).name);
                ((Bird) entity).eat();
                ((Bird) entity).sleep();
                ((Bird) entity).speek();
                ((Bird) entity).fly();
            }
        }
        System.out.println("\n==========================================\nОбъекты, связанные с Mammal\n");
        for (Speakable entity : arraySpeakables) {
            if (entity instanceof Mammal) {
                System.out.println(((Mammal) entity).name);
                ((Mammal) entity).eat();
                ((Mammal) entity).sleep();
                ((Mammal) entity).speek();
                ((Mammal) entity).run();
            }
        }

        System.out.println("\nЭти объекты связаны с абстрактным классом Animal3");
        System.out.println("\n==========================================\nОбъекты, связанные с Bird\n");
        for (Speakable entity : arraySpeakables) {
            if (entity instanceof Bird) {
                Bird b = (Bird)entity;
                System.out.println(b.name);
                b.eat();
                b.sleep();
                b.speek();
                b.fly();
            }
        }
        System.out.println("\n==========================================\nОбъекты, связанные с Mammal\n");
        for(Animal3 entity : arrayAnimals) {
            if(entity instanceof Mammal) {
                Mammal m = (Mammal)entity;
                System.out.println(m.name);
                m.run();
                m.eat();
                m.speek();
                m.sleep();
            }
        }

    }

}

abstract class Animal3 {

    String name;

    Animal3(String name) {
        this.name = name;
    }

    abstract void eat();
    abstract void sleep();

}

abstract class Fish extends Animal3 {

    String name;

    Fish(String name) {
        super(name);
        this.name = name;
    }

    void sleep() {
        System.out.println("Vsegda interesno nablydat, kak spyat ribi");
    }

    abstract void swim();

}

abstract class Bird extends Animal3 implements Speakable {

    String name;

    Bird(String name) {
        super(name);
        this.name = name;
    }

    abstract void fly();

    public void speek() {
        System.out.println("Somebody speaks sings");
    }

}

abstract class Mammal extends Animal3 implements Speakable {

    String name;

    Mammal(String name) {
        super(name);
        this.name = name;
    }

    abstract void run();

}

interface Speakable {

    default void speek() {
        System.out.println("Somebody speaks");
    }

}

class Mechenosec extends Fish {

    String name;

    Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    public void swim() {
        System.out.println("Mechenosec krasivaya riba, kotoraya bistro plavaet!");
    }

    public void eat() {
        System.out.println("Mechenosec ne xishnaya riba, ona est obichniy ribiy korm!");
    }

}

class Pingvin extends Bird {

    String name;

    Pingvin(String name) {
        super(name);
        this.name = name;
    }

    public void eat() {
        System.out.println("Pingvin lyubit est ribu!");
    }

    public void sleep() {
        System.out.println("Pingvini spyat prijavshis drug k drugu!");
    }

    public void fly() {
        System.out.println("Pingvini ne umeyut letat!");
    }

    public void speak() {
        System.out.println("Pingvini ne umeyut pet kak solovyi");
    }

}

class Lev extends Mammal {

    String name;

    Lev(String name) {
        super(name);
        this.name = name;
    }

    public void eat() {
        System.out.println("Lev, kak lyuboy sishnik, lyubit myaso!");
    }

    public void sleep() {
        System.out.println("Bolshuyu chast dnya lev spit!");
    }

    public void run() {
        System.out.println("Lev - eto ne samaya bistraya koshka!");
    }

}

// Result:
