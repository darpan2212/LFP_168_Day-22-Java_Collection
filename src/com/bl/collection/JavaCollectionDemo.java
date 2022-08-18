package com.bl.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class JavaCollectionDemo {

	public static void main(String[] args) {

		doListDemo();
		doStackDemo();
		doQueueDemo();
		doSetDemo();

		doMapDemo();
	}

	private static void doMapDemo() {
		System.out.println("____________In MapDemo______________");

		Map<Integer, String> map = new HashMap<>();

		map.put(101, "Rakesh");
		map.put(102, "Ashish");
		map.put(103, "Ravi");
		map.put(104, "Ashish");
		map.put(104, "Garima");

		Iterator<Entry<Integer, String>> itr = map.entrySet().iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		for (int i = 0; i < map.size(); i++) {
			Entry<Integer, String> ent = (Entry) map.entrySet().toArray()[i];
			System.out.println(ent.getKey() + " : " + ent.getValue());
		}
	}

	private static void doSetDemo() {
		System.out.println("____________In SetDemo______________");

		Set<String> set = new HashSet<>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Amit");

		Iterator<String> itr = set.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	private static void doQueueDemo() {
		System.out.println("____________In queueDemo______________");

		Queue<Student> queue = new PriorityQueue<>();

		Student s1 = new Student();
		s1.age = 20;
		s1.name = "Amit";
		s1.rollNo = 2;

		queue.add(s1);

		Student s2 = new Student();
		s2.age = 20;
		s2.name = "Vijay shekhar";
		s2.rollNo = 3;

		queue.add(s2);

		Student s3 = new Student();
		s3.age = 20;
		s3.name = "Raj";
		s3.rollNo = 1;

		queue.add(s3);

//		System.out.println("Queue's first element (peek): "+queue.peek());
//		System.out.println("Queue's first element (poll): "+queue.poll());

		Iterator<Student> itr = queue.iterator();

		while (itr.hasNext()) {
			Student s = itr.next();
			System.out.println(s.rollNo + "\t" + s.name + "\t" + s.age);
		}

		System.out.println("First element : " + queue.element().name);
		System.out.println("First element : " + queue.peek().name);
		System.out.println("First element poll out: " + queue.poll().name);
		System.out.println("First element remove out: " + queue.remove().name);
		itr = queue.iterator();

		while (itr.hasNext()) {
			Student s = itr.next();
			System.out.println(s.rollNo + "\t" + s.name + "\t" + s.age);
		}

	}

	private static void doListDemo() {

		System.out.println("____________In doListDemo______________");

		List<String> list = new LinkedList<>();

		list.add("Jack");
		list.add("Mack");
		list.add("Jeff");
		list.add("Elon");

		Iterator<String> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	private static void doStackDemo() {

		System.out.println("____________In doStackDemo______________");

		Stack<String> stack = new Stack<>();

		stack.push("Ayush");
		stack.push("Rakesh");
		stack.push("Ramesh");
		stack.push("Aakash");
		stack.push("Ashish");
		stack.push("Garima");

		System.out.println("Popped element -> " + stack.pop());
		System.out.println("Popped element -> " + stack.pop());

		Iterator<String> itr = stack.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}