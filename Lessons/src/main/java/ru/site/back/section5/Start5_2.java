package ru.site.back.section5;

public class Start5_2 {

    public static void main(String[] args) {
        class Slojenie implements Math3 {

            @Override
            public int doOperation(int a, int b) {
                System.out.println(a+b);
                return a+b;
            }
        }

        Slojenie slojenie = new Slojenie();
        slojenie.doOperation(5, 3);

    }

}

interface Math3 {
    int doOperation(int a, int b);
}