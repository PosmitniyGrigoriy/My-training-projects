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
