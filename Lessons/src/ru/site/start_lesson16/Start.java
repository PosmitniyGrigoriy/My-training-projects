package ru.site.lesson16;

import org.w3c.dom.Text;

public class Start {

	public static void main(String[] args) {
		
		// 2 варианта вывода текста
		String text1 = "text1";
		String text2 = new String("text2");
		System.out.println(text1);
		System.out.println(text2);
		
		// new создает каждый раз новый объект
		
		String s4 = "Hello";
		String s5 = "Hello";
		System.out.println("Hello");
		
		// Изначально string pool пустой. Далее в s4, s5, sout указываются значения. Но так как указывается одно и тоже, то в стринг пул добавляется одно значение. И все эти 3 объекта ссылаются на 1 значение в стринг пуле. Если было бы добавление через new, то в стринг пул добавлялись каждый раз новые значения, даже, если они одинаковые по тексту.
		// Через s4 создатся 1 раз в стринг пуле значение, далее s5 и саут будет ссылаться на s4.
		
		// На экземпляр можно добавлять final. Если внутри метода будут указаны аргументы, то потом их нельзя будет изменить, вызвав элемент.
//		final Start2 start2 = new Start2("BMW", "X6", "black", 25000);
		
		// immutable - нельзя изменить String
		
		// Стринг хранит свое значение в прайвэт массиве и имеет фиксированную длину
		
//		Если написать в стринг "Привет", то это слово поместится в массив.
		
		String text3 = "Привет";
//		final private array value = {'П', 'р', 'и', 'в', 'е', 'т'};
//		Прайвэт массив значит, что массив может быть видет только внутри класса стринг. Также перед прайвэт написно файнал. Значение стринга "Привет" нельзя изменить. Также этот стринг имеет фиксированную длину в массиве. На этот объект можно потом ссылаться, чтобы получить значение, но изменить объект нельзя.
//		C помощью стринг пула можно экономить память компьютера. Если в цикл поместить саут, то он 10 раз выведется, но всего лишь 1 раз создастся в стринг пуле, и все 10 раз будет ссылаться на один объект, и займет мало памяти. Если будет создаваться стринг объект через new, то будет создано 10 объектов в стринг пуле, даже если будет одинаковый текст. Все 10 раз будут ссылаться на свой объект. 1 к 1. И так 10 раз.

//		Методы String:
		
//		1) Метод length() => int - выводит длину стринга.
		
		String text10 = "I go to school";
		int result = text10.length();
		System.out.println(result);
		
//		2) Метод charAt(#) => String - указывается номер символа и выводится буква, которая в прайвэт массиве под этим номером.
//		Ниже слово и порядковый номер в прайвэт массиве всех элментов:
//		I go to school
		
//		I   g o   t o   s c h  o  o  l
//		0 1 2 3 4 5 6 7 8 9 10 11 12 13
		
//		Если написать test10.charAt(6); , то выведется буква t, так как она под 5 номером. Начинается массив с 0.
		
		System.out.println(text10.charAt(5));
		
//		3) Метод indexOf(int ch) => int - выводит порядковый номер элемента в прайвэт массиве.
//		   Метод indexOf(String s) => int - тоже самое.
//		   Метод indexOf(int ch, int fromIndex) => int 
//		   Метод indexOf(String c, int fromIndex) => int
//		   Важно: где char, там использовать '', где String там использовать "".
//		   Важно 2: на 1 и 3 строке внутри метода int ch - это char ch. Указывать нужно внутри метода 'x'.ы
		
		System.out.println(text10.indexOf('z')); // -1
		System.out.println(text10.indexOf("to")); // 5
		System.out.println(text10.indexOf('t', 7)); // -1
		System.out.println(text10.indexOf("t", 0)); // 5
		
//		Если внутри методе будет указано не существующее значение, то выведется -1. Относится к char и к String и к цифре, откуда искать нужно.
		
//		Чтобы понять какой индекс буквы Е, нужно написать:
		String text = new String("Оренбург");
		System.out.println(text.indexOf("е")); // 2
		
//		Если будет две одинаковые буквы О, то указать откуда начать поиск.
		String text5 = new String("Попополь");
		System.out.println(text5.indexOf("о", 2)); // Со второго элемента массива начнется поиска, а найдется нужное значение в 3 элементе массива
		
//		Если будет указан не существующий символ, который нужно найти, то выведется -1.
//		Если будет указан не существующий элемент массива, с которого нужно искать, то выведется -1.
		
//		4) Метод startWith(String prefix) => boolean - проверяет совпадает ли начало слова
//		   Метод startWith(String prefix, index from) => boolean - проверяет совпадает ли часть слова, начиная с указанного элемента массива
		
//		В первом варианте указать "под", если было слово подушка, то выведется true. Поиск начинается с 0 элемента. Регистр учитывать, чтобы было true.
//		Во втором варианте указать часть слова и указать с какого элемента начать искать.
		
		String text20 = new String("Подушка");
		System.out.println(text20.startsWith("Под")); // true - начало совпало
		System.out.println(text20.startsWith("пев")); // false - начало не совпало
		System.out.println(text20.startsWith("ушк", 3)); // true - совпало с 3, 4, 5 элементами
		System.out.println(text20.startsWith("Под", 5)); // false - не совпало с 5, 6, 7 элементами
		
//		5) Метод endsWith(String sufffix) => boolean
		
		System.out.println(text20.endsWith("ушка")); // true - конец совпал
		
//		6) Метод substring(int beginIndex) => String - выводит слово с указанного элемента массива
//		   Метод substring(int beginIndex, int endIndex) => String - выводит слово с указанного элемента и по какой-то элемент массива
	       
		String text33 = new String("Примерочная");
		System.out.println(text33.substring(2)); // С какого элемента массива выводить слово.
		System.out.println(text33.substring(2, 6)); // С какого элемента массива и по какой выводить слово. Важно: последний элемент (6) не учитывается. Учитывается 2, 3, 4, 5.
		
		// Стринг сам никогда не меняется
		
//		7) Метод trim() => String - удаляет до фразы и после фразы пробелы
//		Если указано слово ("     text     text2     "), то этот метод удалит первый и третий отступ с пробелами (удаляются пробелы вначале фразы и в конце фразы). Итоговый результат будет таким: ("text     text2").
		
		String text34 = new String("     text     text2     ");
		System.out.println(text34);
		System.out.println(text34.trim());
		
//		8) replace(char oldChar, char new Char) => String - меняет указанный символ на другой символ
//		   replace(String oldChar, String newChar) => String - меняет указанный символ или часть фразы на другую часть фразы или символ - этот метод что-то не выводится, но он работает.
				   
		String text35 = new String("Компьютор");
		System.out.println(text35.replace('о', 'а')); // Сделано изменение оригинального стринга на мгновение
		System.out.println(text35.replace("ь", "ъ")); // Сделано изменение оригинального стринга на мгновение
		System.out.println(text35); // После двух изменений выше, выводится все равно начальный стринг.
		
		// Если 1 раз стринг был указан, то его нельзя изменить (оригинал). Копию можно, но на мгновение и если после копии вывести по переменной исходный стринг, то копия пропадет и выведется оригинальный вариант.
		
		// replace метод создает новый объект
		
//		9) concat(String str) => String
		String text40 = new String("      Привет, ");
		String text41 = new String("друг!      ");
		System.out.println(text40.concat(text41));
		System.out.println(text40 + text41);
		
//		10) toLowerCase() => String - все буквы будут маленькими
		
//		11) toApperCase() => String - все буквы будут большими
		
//		12) contains(String str) => boolean
		
//		contains - содержит
		
//		Метод chaining выполняет последовательно слева направо все:
		System.out.println(text40.concat(text41).trim().replace("друг", "брат").substring(2, 10));
		
		String text100 = new String("Text");
		String text101 = new String("Text");
		System.out.println(text100 == text101);
		System.out.println(text100.equals(text101));
		
//		text100 => ссылается на область памяти 1
//		text101 => ссылается на область памяти 2
//		Если использовать ==, то будет фолс. Если использовать для стринга иквелс, то будет тру. Но если иквелс использовать для экземпляра, то будет фолс, так как нужно для тру дополнительно прописать еще код для сравнения.
		
//		== используется для сравнения примитивов и стрингов обычных (не через new).
//		equals используется для сравнения объектов (стринг и экземпляров).
		
		System.out.println();
		
		String text200 = "Text";
		String text201 = "Text";
		System.out.println(text200 == text201);
		System.out.println(text200.equals(text201));
		
//		Стринг пул создает 1 объект Text. Так как в text200 и text201 одинаковый текст, то с text201 не создается второй раз, а ссылается на объект text200. Поэтому выводит true.
		
		System.out.println();
		
		String text300 = "Привет";
		String text301 = "ПриВеТ";
		System.out.println(text300 == text301);
		System.out.println(text300.equals(text301));
		
		System.out.println(text300.equalsIgnoreCase(text301)); // Если такой метод использовать equaldIgnoreCase, то будет игнорироваться регистр и будет true.
		
		System.out.println("------");
		
//		isBlank - возвращает boolean (true - если есть обычные пробелы или табовские пробелы, false - буквы, слова, иные символы)
		// Если будет пробел, пробелы, табовские пробелы, то будет true. В остальных случаях будет false (если будут слова, символы другие).
		
		String s200 = "Привет";
		String s201 = "    ";
		System.out.println(s200.isBlank());
		System.out.println(s201.isBlank());
		
		System.out.println("------");
		
//		isEmpty - возвращает boolean (true - если есть обычные пробелы или табовские пробелы, false - буквы, слова, иные символы)
		// Если будет стринг такой "", то будет true, если будет " ", или будет внутри что-то написано, то будет false. Только при пустом "" будет true, а при заполненных false.
		
		String s202 = "Привет";
		String s203 = "			"; // три табовских пробела
		String s204 = ""; // ничего не написано
		String s205 = " "; // один пробел
		String s206 = "    "; // несколько пробелов
		String s207 = "white"; // слово
		String s208 = "@@$@%#!"; // символы
		System.out.println(s202.isEmpty());
		System.out.println(s203.isEmpty());
		System.out.println(s204.isEmpty());
		System.out.println(s205.isEmpty());
		System.out.println(s206.isEmpty());
		System.out.println(s207.isEmpty());
		System.out.println(s208.isEmpty());
		
		System.out.println("------");
		
//		strip - удаляет пробелы и тады до первого слова и после последнего слова
//		stripLeading - удаляет пробелы и табы до первого слова
//		stripTrailing - удаляет пробелы и табы после последнего слова
		
		// Метод strip лучше также, как метод trim(). Распознает пробелы, табы и так далее и удаляет до начала первого слова и после последнего слова.
		
		String s209 = "   "; // пробелы
		String s210 = "   			white   		"; // пробелы и табы и слово и пробелы и табы
		System.out.println(s209.strip());
		System.out.println(s210.strip());
		System.out.println(s210.stripLeading());
		System.out.println(s210.stripTrailing());
		
	}

}
