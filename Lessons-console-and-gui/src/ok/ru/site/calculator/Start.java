// Урок от Project of unknown source

package ok.ru.site.calculator;

import java.util.Scanner;

public class Start {
   
    public static void main(String[] args) {
           
    	// Variant one
    	int resultPlus;
    	int resultMinus;
    	int resultMultiply;
    	int resultDivide;
    	
        Scanner in = new Scanner(System.in);
        System.out.print("Значение A: ");
        int a = in.nextInt();
        System.out.print("Значение B: ");
        int b = in.nextInt();
        System.out.printf("\n" + "A: %d", a);
        System.out.printf("\n" + "B: %d", b);

        resultPlus = a + b;
        System.out.println("\n" + "\n" + "Результат сложения: " + "\t" + resultPlus);
        
        resultMinus = a - b;
        System.out.println("Результат вычитания: " + "\t" + resultMinus);
        
        resultMultiply = a * b;
        System.out.println("Результат умножения: " + "\t" + resultMultiply);
        
        resultDivide = a / b;
        System.out.println("Результат деления: " + "\t" + resultDivide);
        
        in.close();
    	
        // Variant two
//    	Options operations = new Options ();
//    	operations.operations(4, 2, '+'); // Доступные операции: +, -, * и /
//    	operations.operations(4, 2, '-'); // Доступные операции: +, -, * и /
//    	operations.operations(4, 2, '*'); // Доступные операции: +, -, * и /
//    	operations.operations(4, 2, '/'); // Доступные операции: +, -, * и /
        
    }
}
