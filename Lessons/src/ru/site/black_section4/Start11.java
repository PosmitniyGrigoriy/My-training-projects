package ru.site.section4;

import java.util.*;

public class Start11 {

	public static void main(String[] args) {
		
		Queue<Integer> queueNumbers = new PriorityQueue<>();
		queueNumbers.add(5);
		queueNumbers.add(1);
		queueNumbers.add(7);
		queueNumbers.add(3);
		queueNumbers.add(9);
		queueNumbers.add(6);
		System.out.println(queueNumbers.element());
		System.out.println(queueNumbers);
		
		System.out.println(queueNumbers.remove() + " - " + queueNumbers);
		System.out.println(queueNumbers.remove() + " - " + queueNumbers);
		System.out.println(queueNumbers.remove() + " - " + queueNumbers);
		System.out.println(queueNumbers.remove() + " - " + queueNumbers);
		System.out.println(queueNumbers.remove() + " - " + queueNumbers);
		System.out.println(queueNumbers.remove() + " - " + queueNumbers);
		
		
		System.out.println();
		
		
		Queue<String> queueNames = new LinkedList<>();
		queueNames.offer("é30");
		queueNames.offer("à2");
		queueNames.offer("é3");
		queueNames.offer("é4");
		queueNames.offer("é5");
		queueNames.offer("é6");
		queueNames.remove("é4");
		System.out.println(queueNames.element());
		System.out.println(queueNames);
		
		System.out.println(queueNames.poll() + " - " + queueNames);
		System.out.println(queueNames.poll() + " - " + queueNames);
		System.out.println(queueNames.poll() + " - " + queueNames);
		System.out.println(queueNames.poll() + " - " + queueNames);
		System.out.println(queueNames.poll() + " - " + queueNames);
		System.out.println(queueNames.poll() + " - " + queueNames);
		System.out.println(queueNames.poll() + " - " + queueNames);
		System.out.println(queueNames.poll() + " - " + queueNames);
		
		
		System.out.println();
		
		
		Queue<Integer> queueNumbers2 = new PriorityQueue<>();
		queueNumbers2.add(5);
		queueNumbers2.add(1);
		queueNumbers2.add(7);
		queueNumbers2.add(3);
		queueNumbers2.add(9);
		queueNumbers2.add(6);
		System.out.println(queueNumbers2);
		
		System.out.println(queueNumbers2.poll() + " - " + queueNumbers2.element() + " - " + queueNumbers2);
		System.out.println(queueNumbers2.poll() + " - " + queueNumbers2.element() + " - " + queueNumbers2);
		System.out.println(queueNumbers2.poll() + " - " + queueNumbers2.element() + " - " + queueNumbers2);
		System.out.println(queueNumbers2.poll() + " - " + queueNumbers2.element() + " - " + queueNumbers2);
		System.out.println(queueNumbers2.poll() + " - " + queueNumbers2.element() + " - " + queueNumbers2);
		System.out.println(queueNumbers2.poll() + " - " + queueNumbers2);
		
		
		System.out.println();
		
		
		Queue<Integer> queueNumbers21 = new PriorityQueue<>();
		queueNumbers21.add(5);
		queueNumbers21.add(1);
		queueNumbers21.add(7);
		queueNumbers21.add(3);
		queueNumbers21.add(9);
		queueNumbers21.add(6);
		System.out.println(queueNumbers21);
		
		System.out.println(queueNumbers21.poll() + " - " + queueNumbers21.peek() + " - " + queueNumbers21);
		System.out.println(queueNumbers21.poll() + " - " + queueNumbers21.peek() + " - " + queueNumbers21);
		System.out.println(queueNumbers21.poll() + " - " + queueNumbers21.peek() + " - " + queueNumbers21);
		System.out.println(queueNumbers21.poll() + " - " + queueNumbers21.peek() + " - " + queueNumbers21);
		System.out.println(queueNumbers21.poll() + " - " + queueNumbers21.peek() + " - " + queueNumbers21);
		System.out.println(queueNumbers21.poll() + " - " + queueNumbers21);
		
		
		System.out.println();
		
		
		PriorityQueue<Integer> priorityQueueNumbers = new PriorityQueue<>();
		priorityQueueNumbers.add(5);
		priorityQueueNumbers.add(1);
		priorityQueueNumbers.add(7);
		priorityQueueNumbers.add(3);
		priorityQueueNumbers.add(9);
		priorityQueueNumbers.add(6);
		System.out.println(priorityQueueNumbers);
		
		System.out.println(priorityQueueNumbers.peek());
		
		
		System.out.println("--------------------------------");
		
		
		Deque<Integer> dequeNumbers = new ArrayDeque<>();
		dequeNumbers.add(10);
		dequeNumbers.add(11);
		dequeNumbers.add(12);
		System.out.println(dequeNumbers);
		dequeNumbers.addLast(5);
		System.out.println(dequeNumbers);
		dequeNumbers.addFirst(3);
		System.out.println(dequeNumbers);
		dequeNumbers.addFirst(4);
		System.out.println(dequeNumbers);
		dequeNumbers.addLast(99);
		System.out.println(dequeNumbers);
		dequeNumbers.removeFirst();
		System.out.println(dequeNumbers);
		dequeNumbers.removeLast();
		System.out.println(dequeNumbers);
		dequeNumbers.pollFirst();
		dequeNumbers.pollFirst();
		dequeNumbers.pollFirst();
		dequeNumbers.pollFirst();
		dequeNumbers.pollFirst();
		dequeNumbers.pollFirst();
		dequeNumbers.pollFirst();
		dequeNumbers.pollFirst();
		dequeNumbers.pollFirst();
		dequeNumbers.pollFirst();
		dequeNumbers.pollFirst();
		dequeNumbers.pollFirst();
		System.out.println(dequeNumbers);
		
		
		System.out.println();
		
		
		Deque<Integer> dequeNumbers2 = new ArrayDeque<>();
		dequeNumbers2.add(10);
		dequeNumbers2.add(4);
		dequeNumbers2.add(24);
		dequeNumbers2.add(7);
		dequeNumbers2.add(12);
		System.out.println(dequeNumbers2);
		
		System.out.println(dequeNumbers2.getFirst());
		System.out.println(dequeNumbers2.getLast());
		
		System.out.println(dequeNumbers2.peekFirst());
		System.out.println(dequeNumbers2.peekLast());
		
	}

}
