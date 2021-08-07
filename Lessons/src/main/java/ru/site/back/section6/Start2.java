package ru.site.back.section6;

public class Start2 {

    static void def(I i) {
        System.out.println(i.abc("Привет"));
    }

    public static void main(String[] args) {
        def((String str) -> { return str.length(); });
    }

}

interface I {
    int abc(String text);
}