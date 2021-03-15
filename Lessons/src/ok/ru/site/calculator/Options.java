package ok.ru.site.calculator;

public class Options {
	
	public int operations(int a, int b, char operation) {
        
        int result;
        
        if (operation == '*') {
        	result = a * b;
        	System.out.println("Результат умножения: " + "\t" + result);
        } else if (operation == '/') {
        	result = a / b;
        	System.out.println("Результат деления: " + "\t" + result);
        } else if (operation == '+') {
        	result = a + b;
        	System.out.println("Результат сложения: " + "\t" + result);
    	} else {
    		result = a - b;
        	System.out.println("Результат вычитания: " + "\t" + result);
    	}
        return result;
        
	}

}
