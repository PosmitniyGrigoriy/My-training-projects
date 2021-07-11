package ru.site.lesson20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class Start {

	private String name;
	private int age;
	
	Start() {
	}
	
	Start(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " " + age;
	}
	
	
	public static void main(String[] args) {
		
//		ArrayList<Integer> array = new ArrayList<>();
//		array.add(10);
//		array.add(2);
//		array.add(5);
//		array.add(1);
//		
//		array.remove(2);
//		System.out.println(array);
//		
//		ArrayList<String> array2 = new ArrayList<>();
//		array2.add("Text1");
//		array2.add("Text5");
//		array2.add("Text3");
//		array2.add("Text2");
//		
//		array2.remove("Text5");
//		System.out.println(array2);
//		
//		
//		int text = 11;
//		Object[] name = new Object[4];
////		name[0] = new String[] {"text111"}; // Так уже выводит область памяти в Стринге вместо текста
//		name[0] = new int[] {5}; // Так тоже выводит область памяти в инте, вместо цифры
//		name[1] = 8;
//		name[2] = "Text333";
//		for(Object result : name) {
//			System.out.println(result);
//		}
//		
//		System.out.println();
//		
//		for(int i = 0; i < name.length; i++) {
//			System.out.println(name[i]);
//		}
		

		
//		StringBuilder cc = new StringBuilder("ttt");
//		StringBuilder gg = new StringBuilder("zzz");
//		
//		ArrayList<StringBuilder> array2 = new ArrayList<StringBuilder>();
//		array2.add(new StringBuilder("text55"));
//		array2.add(new StringBuilder("text5"));
//		array2.add(cc);
//		array2.add(gg);
////		System.out.println(array2);
//		
//		
//		
//		ArrayList array = new ArrayList();
//		array.add(10);
//		array.add(2);
//		array.add(5);
//		array.add(1);
//		array.add("text");
//		array.add(new Start("Григорий", 29));
//		array.add(new StringBuilder("Григорий"));
//		array.add(55);
//		
//		Start start100 = new Start();
//		array.add(start100);
//		
//		array.remove(2);
////		System.out.println(array);
//		
//		array.set(0, 55);
////		System.out.println(array);
//		
//		ArrayList array3 = new ArrayList();
////		array3.addAll(array);
//		array3.add("SSSSSSSSSSSSSSS");
//		array3.add("SSSSSSSSSSSSSSS");
//		array3.add("SSSSSSSSSSSSSSS");
////		System.out.println(array3);
//		
//		
////		array.addAll(array3);
//		array.addAll(0, array3);
////		System.out.println(array);
//		
////		array.clear();
////		System.out.println();
//		System.out.println(array);
//		
//		System.out.println(array.isEmpty());
		
		
//		ArrayList<StringBuilder> array5 = new ArrayList<>();
//		array5.add(new StringBuilder("text10"));
//		array5.add(new StringBuilder("text25"));
//		array5.add(new StringBuilder("text50"));
//		
//		
////		array5.get(0).append("AAA");
//
//		for(int i = 0; i < array5.size(); i++) {
//			array5.get(i).append("AAA");
//		}
//		
//		
//		
//		for(StringBuilder s : array5) {
//			System.out.print(s + " ");
//		}
//		System.out.println();
		
//		ArrayList<String> array6 = array5;
//		ArrayList array6 = new ArrayList();
//		array6.add(new Start("Григорий", 30));
		
//		System.out.println(array5);
//		System.out.println(array5.toString());
		
		
		
//		ArrayList<StringBuilder> array5 = new ArrayList<>();
//		array5.add(new StringBuilder("text10"));
//		array5.add(new StringBuilder("text25"));
//		array5.add(new StringBuilder("text50"));
////		array5.get(1).append("!!!");
//		array5.set(1, new StringBuilder("sss"));
//		
//		
//		ArrayList<StringBuilder> array6 = array5;
////		ArrayList<StringBuilder> array7 = new ArrayList<>();
//		
//		
//		ArrayList<StringBuilder> array7 = new ArrayList();
//		array7 = (ArrayList<StringBuilder>) array5.clone();;
//		
//		
//		System.out.println(array5);
//		System.out.println(array6);
//		System.out.println(array7);
		
		
		
//		ArrayList<StringBuilder> list1 = new ArrayList<>();
//		ArrayList<StringBuilder> list3 = list1;
//		
//		list1.add(new StringBuilder("text10"));
//		list1.add(new StringBuilder("text25"));
//		list1.add(new StringBuilder("text50"));
//		list1.set(1, new StringBuilder("sss"));
//
////		ArrayList<StringBuilder> list2 = (ArrayList<StringBuilder>) list1.clone();
//
//		Object array6 = new ArrayList<>();
//		array6 = list1.clone();
//		
////		ArrayList<StringBuilder> array6 = new ArrayList();
////		array6 = (ArrayList<StringBuilder>) list1.clone();;
//		
//		
//		System.out.println(list1);
////		System.out.println(list2);
//		System.out.println(array6);
//		System.out.println(list3);
		
		
		
//		ArrayList<StringBuilder> array6 = (ArrayList<StringBuilder>) array5.clone();
//		System.out.println(array6);
		
//		Object array6 = new ArrayList<>();
//		array6 = array5.clone();
//		System.out.println(array6);
	
		
//		for(StringBuilder s : array6) {
//			System.out.print(s + " ");
//		}
//		
		
//		ArrayList<StringBuilder> array6 = new ArrayList();
//		array6 = (ArrayList<StringBuilder>) array5.clone();
//		System.out.println(array6);
		
		
		
//		ArrayList<StringBuilder> list1 = new ArrayList<>();
//		
//		list1.add(new StringBuilder("text25"));
//		list1.add(new StringBuilder("text10"));
//		list1.add(new StringBuilder("text50"));
//		
//		StringBuilder[] sb1 = list1.toArray(new StringBuilder[10]);
		
//		for(Object o : sb1) {
//			System.out.println(o);
//		}
//		list1.
		
		
//		List<StringBuilder> array2 = Arrays.asList(sb1);
//		System.out.println(array2);
		
		
		
//		ArrayList<Integer> array40 = new ArrayList<>();
//		array40.add(222);
//		array40.add(44);
//		array40.add(55);
//		array40.add(342);
//		Collections.sort(array40);
//		System.out.println(array40);
		
		
//		Integer[] array55 = new Integer[4];
//		array55[0] = 222;
//		array55[1] = 44;
//		array55[2] = 55;
//		array55[3] = 342;
//		List<Integer> ttt = Arrays.asList(array55);
//		Collections.sort(ttt);
//		System.out.println(ttt);
		
		
//		ArrayList<Integer> array40 = new ArrayList<>();
//		array40.add(222);
//		array40.add(44);
//		array40.add(55);
//		array40.add(342);
//		
//		ArrayList<Integer> array41 = new ArrayList<>();
//		array41.add(222);
//		array41.add(44);
//		array41.add(55);
//		array41.add(342);
//		
//		ArrayList<Integer> array42 = array40;
//		
//		System.out.println(array40 == array41);
//		System.out.println(array42 == array40);
//		System.out.println(array40.equals(array41));
//		System.out.println(array42.equals(array40));
		
		
//		ArrayList<Integer> array40 = new ArrayList<>();
//		array40.add(222);
//		array40.add(44);
//		array40.add(55);
//		array40.add(342);
//		
//		Iterator<Integer> array41 = array40.iterator();
//		while(array41.hasNext()) {
//			
//			array41.next();
//			array41.remove();
//		}
		
		
		
//		ListIterator<Integer> array42 = array40.listIterator();
//		while(array42.hasNext()) {
//			array42.next();
//		}
//		while(array42.hasPrevious()) {
//			System.out.println(array42.previous());
//		}
		
		
		
		
//        ArrayList array1 = new ArrayList();
//        array1.add(10);
//        array1.add(20);
//        array1.add(30);
//        array1.add(45);
//        array1.add(50);
//        
//        ListIterator itr = array1.listIterator();
//        System.out.println("array1 in forward order");
//        while(itr.hasNext())
//        {
//            System.out.println(itr.next());
//        }
//        
//        System.out.println("array1 in reverse order");
//        while(itr.hasPrevious())
//        {
//            System.out.println(itr.previous());
//        }
        
		
		
//		int[] array10 = {1, 2, 3, 4, 5};
//		int[] array20 = {1, 2, 3, 8};
//		int[] array30 = {1, 2, 3, 8};
//		char[] array40 = {'п', 'р', 'и', 'в', 'е', 'т'};
//		char[] array50 = {'п', 'р', 'и', 'в', 'и', 'в', 'к', 'а'};
//		char[] array60 = {'п', 'р', 'и', 'в', 'и', 'в', 'к', 'а'};
//		
//		System.out.println(Arrays.compare(array30, array20)); //0
//		System.out.println(Arrays.compare(array10, array20)); // -1
//		System.out.println(Arrays.compare(array20, array10)); // 1
//		
//		System.out.println(Arrays.compare(array60, array50)); //0
//		System.out.println(Arrays.compare(array40, array50)); // 6 - 10 = -3
//		System.out.println(Arrays.compare(array50, array40)); // 10 - 6 = 3
		
		// Ответ выше закомментированный по выводу разницы в чаре. Там -3 и 3. Это правильные ответы. Но считать нужно или на 6 элемента, с со следующего, тогда сойдется, или 10-ку не учитывать, и тогда тоже сойдется. Какой-то один из этих вариантов верный. Тоже самое и в противоположную сторону.
		
//		А Б В Г Д Е Ё Ж З И
//		1 2 3 4 5 6 7 8 9 10
		

//		char[] array40 = {'п', 'р', 'и', 'в', 'е', 'т'};
//		char[] array50 = {'п', 'р', 'и', 'в', 'е', 'т', 'я'};
//		
//		System.out.println(Arrays.compare(array40, array50)); //-1
//		System.out.println(Arrays.compare(array50, array40)); // 1
		
		
//		char[] array40 = {'п', 'р', 'и', 'в', 'е', 'т'};
//		char[] array50 = {'п', 'р', 'и', 'в', 'е', 'т', 'я'};
//		char[] array60 = {'п', 'р', 'и', 'в', 'е', 'т', 'я'};
//		
//		System.out.println(Arrays.mismatch(array40, array50)); // 6 (на Я расхождение)
//		System.out.println(Arrays.mismatch(array50, array40)); // 6 (на Я расхождение)
//		System.out.println(Arrays.mismatch(array50, array60)); // -1
	
		
//		char[] array50 = {'п', 'р', 'и', 'в', 'и', 'в', 'к', 'а'};
//		char[] array60 = {'п', 'р', 'и', 'в', 'е', 'т', 'я'};
//		System.out.println(Arrays.mismatch(array50, array60)); // 4
		
		
//		String[] array = {"5", "2", "4", "1", "0"};
//		List<String> list = List.of(array);
//		System.out.println(list);
		
		Map<Integer, String> listPeople = new HashMap<>();
		listPeople.put(900, "Олег");
		listPeople.put(901, "Михаил");
		listPeople.put(902, "Виктор");
		listPeople.put(903, "Никита");
		listPeople.put(904, "Никита");
		listPeople.put(901, "Аня");
		listPeople.remove(903);
		listPeople.remove(904, "Никита");
		System.out.println(listPeople);
		
	}

}
