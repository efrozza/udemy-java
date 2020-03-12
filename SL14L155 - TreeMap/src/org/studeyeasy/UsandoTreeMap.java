package org.studeyeasy;

import java.util.HashMap;
import java.util.Map;

public class UsandoTreeMap {

	public static void main(String[] args) {


		Map<Integer, String> timesEuropa = new HashMap<>();
		
		timesEuropa.put(3, "PSG");
		timesEuropa.put(5, "Barcelona");
		timesEuropa.put(4, "Real Madrid");
		
		for (Map.Entry<Integer, String> entry : timesEuropa.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
