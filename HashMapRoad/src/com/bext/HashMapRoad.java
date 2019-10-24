package com.bext;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapRoad {

	public static void main(String[] args) {
		HashMap mapSI= createEmptyHashMap();
		showMap( mapSI);
	}

	public static HashMap createEmptyHashMap() {
		HashMap<String, Integer> mapSI = new HashMap();
		return mapSI;
	}
	
	public static HashMap createEmptyHashMapInitialCapacity(int initCapacity) {
		HashMap<String, Integer> mapSI = new HashMap( initCapacity);
		return mapSI;
	}
	
	public static HashMap createEmptyHashMapInitialCapacityFactorLoad(int initCapacity, float loadFactor) {
		HashMap<String, Integer> mapSI = new HashMap( initCapacity, loadFactor);
		return mapSI;
	}
	
	public static HashMap createEmptyHashMapFromMap(HashMap hashMap) {
		HashMap<String, Integer> mapSI = new HashMap( hashMap);
		return mapSI;
	}
	
	public static void fillHashMap() {
		HashMap<String, Integer> hashMap = createEmptyHashMap();
		hashMap.put("uno", 1);
		hashMap.put("dos", 2);
		hashMap.put("tres", 3);
		hashMap.put("tres", 33);
		hashMap.put("cuatro", 4);
		hashMap.put("CUATRO", 4);
		hashMap.put("cinco", 5);
		
		System.out.println("== hashMap");
		for (Map.Entry mapElement : hashMap.entrySet()) {
			System.out.println("key: " + mapElement.getKey() + " value: " + mapElement.getValue());
		}
		
		HashMap<String, Integer> hashMap2 = createEmptyHashMap();
		hashMap2.put("sies", 6);
		hashMap2.put("siete", 7);

		System.out.println("== hashMap2");
		hashMap2.forEach((k,v) -> System.out.println("key: " + k + " value: " + v));
		
		hashMap2.putAll(hashMap);
		
		System.out.println("hashMap2.putAll(hashMap);");
		System.out.println("== hashMap");
		hashMap.forEach((k,v) -> System.out.println("key: " + k + " value: " + v));
		System.out.println("== hashMap2");
		hashMap2.forEach((k,v) -> System.out.println("key: " + k + " value: " + v));
	}
	
	public static Set getKeys(HashMap map) {
		Set set = map.keySet();
		
		return set; 
	}
	
	
	public static void showMap(HashMap<String, Integer> map) {
		if (map.isEmpty()) { 
			System.out.println("map is Emply");
		} else {
			System.out.println(map);
		}
		
	}

}
