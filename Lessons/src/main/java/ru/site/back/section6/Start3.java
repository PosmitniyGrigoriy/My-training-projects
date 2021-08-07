package ru.site.back.section6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Function;

// Интерфейс Predicate<T>

public class Start3 {
    public static void main(String[] args) {

        Student student1 = new Student("Олег", 20, 'М', 4, 'A');
        Student student2 = new Student("Максим", 22, 'М', 5, 'F');
        Student student3 = new Student("Виктор", 21, 'М', 4, 'C');
        Student student4 = new Student("Мария", 22, 'Ж', 5, 'B');
        Student student5 = new Student("Виктория", 21, 'Ж', 4, 'A');
        Student student6 = new Student("Игорь", 18, 'М', 1, 'B');

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        System.out.println("------");
        printStudents(students, student -> student.getCourse() == 5);
        students.removeIf(student -> student.getGrade() == 'B'); // Метод removeIf использует 1 параметр - предикейт. Нужно прописывать на место предикейта лаябду. Так как у предикейта 1 абстрактный метод boolean test(T t), то это условие, результат тру или фолс, что подходит для этого метода removeIf. Если объект подходит под критерий, то удаляется из коллекции.
        System.out.println("------");
        printStudents(students, student -> student.getCourse() == 5);
        System.out.println("------");

        // Строку students.removeIf(student -> student.getGrade() == 'B'); можно оформить еще так (в две строки ниже):
        Predicate<Student> checkStudentBySex = (student -> student.getSex() == 'М');
        Predicate<Student> checkStudentByGrade = (student -> student.getGrade() == 'A'); // Писать так, чтобы потом через переменную много раз использовать эту лямбда выражение.
        students.removeIf(checkStudentByGrade);
        // Выше две лямбды сохранные в предикейт переменные. На 1 строке 1 условие. Итого 2 строки 2 условия. Можно как по отдельности использовать условия, так и объединить. Пример ниже.
        Predicate<Student> checkStudentByMix = checkStudentBySex.and(checkStudentByGrade); // Объединение происходит через and. Есть еще вместо and - or и negate. Где or - ввести объекты, если они удовлетворяют 1 или 2 проверке. Где negage - отрицать (противоположное выводется).

    }

    private static void printStudents(List<Student> students, Predicate<Student> check) {
        for(Student student : students) {
            if (check.test(student)) { // Выбираем переменную, выбираем метод, в параметры метода указываем студента
                System.out.println(student);
            }
        }
    }
}

// Интерфейс Supplier<T>
// и
// Интерфейс Consumer<T>

class Car {

    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "\n" + model + " - " + color + " - "  + engine;
    }

}

class Start10 {
    public static ArrayList<Car> createCars(Supplier<Car> supplierCar) {
        ArrayList<Car> al = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            al.add(supplierCar.get());
        }
        return al;
    }

    public static void changeCar(Car car, Consumer<Car> cunsumerCar) {
        cunsumerCar.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createCars(() -> new Car("Nissan", "BLACK", 1.5));
        System.out.println(ourCars);

        changeCar(ourCars.get(0), car -> {
            car.color = "YELLOW";
            car.engine = 2.0; } );
        System.out.println(ourCars);
    }
}


// Пакет java.util.function.*;
// Интерфейс Predicate<T> - принимает на вход один параметр и позволяет не создавать свои абстрактные методы, которые состоят из одного параметра. Плюс, используя стандартный интерфейс, код будет понятен другим программистам.
// Абстрактный метод: boolean test(T t);
// Используется методом removeIf().

// Интерфейс Supplier<T> - поставщик (сэплАиэ)
// Абстрактный метод T get();

// Интерфейс Consumer<T> - потребитель (кэнсЮмэ)
// Абстрактный метод void accept(T t); // Метод называется принимать объект типа Т (эксЭпт)
// Используется методом forEach

// Интерфейс Function<T, R> - функция (фанкшин). Принимает в параметры два значения: на вход и на выход. На вход первый параметр, на выход - второй параметр. Если нужно на вход и на выход разные типы данных подавать, то использовать этот интерфейс.
// Абстрактный метод R apply(T t); // эплай


// Лямбда выражения использует метод forEach().
class forEachTestMethode {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(5, 1, 77, 36, 14, 62, 12);
        // Новый вариант
        numbers.forEach(number -> System.out.println(number));

        // Старый вариант
        for(Integer number : numbers) {
            System.out.println(number);
        }

        //
        numbers.forEach(number -> {
            System.out.println(number);
            number *= 2;
            System.out.println(number);
        });

    }
}
