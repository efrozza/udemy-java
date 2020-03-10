package org.studyeasy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class UsoMap {

	public static void main(String[] args) {

		Map<Integer, String> student = new HashMap<>();

		student.put(1, "Estudante 1");
		student.put(2, "Estudante 2");
		student.put(3, "Estudante 3");
		student.put(4, "Estudante 4");
		student.put(5, "Estudante 5");
		student.put(6, "Estudante 6");

		for (Map.Entry<Integer, String> entry : student.entrySet()) {
			// System.out.println(entry);
			System.out.println("key   " + entry.getKey() + " value " + entry.getValue());

		}

		System.out.println(student.get(1));

		// esse for dara o mesmo resultado do map

		for (Integer key : student.keySet()) {
			System.out.println("key " + key + "value: " + student.get(key));
		}

		Iterator<Entry<Integer, String>> entry = student.entrySet().iterator();

		while (entry.hasNext()) {
			Entry<Integer, String> temp = entry.next();
			System.out.println(temp.getKey() + "value " + temp.getValue());
		}

	}

}
