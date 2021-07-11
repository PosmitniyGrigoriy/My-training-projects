package ru.site.section4;

import java.util.*;

public class Start {
	
	public static void main(String[] args) {
		
		// *********************************************************************
		
		// Iterable<String> tests0 = new МОЖНО_ВСТАВИТЬ_ЛЮБОЙ_КЛАСС_ИЗ_КОЛЛЕКЦИИ<>();
		// Collection<String> tests0 = new МОЖНО_ВСТАВИТЬ_ЛЮБОЙ_КЛАСС_ИЗ_КОЛЛЕКЦИИ<>();
		
		// *********************************************
		
		// List
		List<String> test1 = new ArrayList<>();
		ArrayList<String> test2 = new ArrayList<>();
		List<String> test3 = new LinkedList<>();
		LinkedList<String> test4 = new LinkedList<>();
		List<String> test5 = new Vector<>();
		Vector<String> test6 = new Vector<>();
		List<String> test7 = new Stack<>();
		Stack<String> test8 = new Stack<>();
		Vector<String> test9 = new Stack<>();
		
		// *********************************************
		
		// Set + вложенные интерфейсы
		Set<String> test10 = new HashSet<>();
		HashSet<String> test11 = new HashSet<>();
		Set<String> test12 = new LinkedHashSet<>();
		LinkedHashSet<String> test13 = new LinkedHashSet<>();
		Set<String> test14 = new TreeSet<>();
		TreeSet<String> test15 = new TreeSet<>();
		SortedSet<String> test16 = new TreeSet<>();
		NavigableSet<String> test17 = new TreeSet<>();
		
		// *********************************************
		
		// Queue + вложенные интерфейсы
		Queue<String> test18 = new PriorityQueue<>();
		Queue<String> test19 = new ArrayDeque<>();
		Queue<String> test20 = new LinkedList<>();
		AbstractQueue<String> test21 = new PriorityQueue<>();
		PriorityQueue<String> test22 = new PriorityQueue<>();
		ArrayDeque<String> test23 = new ArrayDeque<>();
		Deque<String> test24 = new ArrayDeque<>();
		Deque<String> test25 = new LinkedList<>();
		
		// *********************************************
		
		// Map + вложенные интерфейсы
		
		Map<String, String> test26 = new HashMap<>();
		Map<String, String> test27 = new LinkedHashMap<>();
		Map<String, String> test28 = new Hashtable<>();
		Map<String, String> test29 = new TreeMap<>();
		HashMap<String, String> test30 = new HashMap<>();
		LinkedHashMap<String, String> test31 = new LinkedHashMap<>();
		Hashtable<String, String> test32 = new Hashtable<>();
		TreeMap<String, String> test33 = new TreeMap<>();
		SortedMap<String, String> test34 = new TreeMap<>();
		NavigableMap<String, String> test35 = new TreeMap<>();
				
		// *********************************************************************
		
		List<String> test50 = new ArrayList<>();
		test50.add(null);
		test50.add(null);
		test50.add("йй");
		test50.add("йй");
		System.out.println(test50); // [null, йй, йй]
		
		// *********************************************
		
		List<String> test51 = new ArrayList<>(180);
		test51.add("Олег");
		
		// *********************************************
		
		Map<Integer, String> mapPeople = new HashMap<>();
		mapPeople.put(5, "Игорь");
		mapPeople.put(3, "Алена");
		mapPeople.put(8, "Мария");
		mapPeople.put(4, "Полина");
		mapPeople.put(10, "Виталий");
		mapPeople.put(1, "Максим");
		mapPeople.put(12, "Максим");
		mapPeople.putIfAbsent(12, "Виталий");
		System.out.println(mapPeople);
		System.out.println(mapPeople.get(10));
		System.out.println(mapPeople.keySet());
		System.out.println(mapPeople.values());
		System.out.println(mapPeople.containsKey(444));
		System.out.println(mapPeople.containsKey(4));
		System.out.println(mapPeople.containsValue("Утюг"));
		System.out.println(mapPeople.containsValue("Мария"));
		
		// Результат вывода:
//		{1=Максим, 3=Алена, 4=Полина, 5=Игорь, 8=Мария, 10=Виталий, 12=Максим}
//		Виталий
//		[1, 3, 4, 5, 8, 10, 12]
//		[Максим, Алена, Полина, Игорь, Мария, Виталий, Максим]
//		false
//		true
//		false
//		true
		
		// *********************************************
		
//		Map<Integer, String> mapPeople2 = new HashMap<>();
//		mapPeople2.put(5, null);
//		mapPeople2.put(null, "Алена");
////		mapPeople2.put(null, null);
//		System.out.println(mapPeople2);
//	
//		// Результат вывода: {null=Алена, 5=null}
		
		// *********************************************
		
		Map<String, Integer> mapTexts = new HashMap<>(16, 0.75F);
		
		LinkedHashMap<Integer, Integer> lhmNumbers = new LinkedHashMap<>(20, 0.75F, true);
		LinkedHashSet<Integer> lhsNumbers = new LinkedHashSet<>(20, 0.75F);
		
	}

}
