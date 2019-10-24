package com.bext;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

public class HashMapTests {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void createEmptyHashMapTest() {
		System.out.println("============== createEmptyHashMapTest =================");
		HashMapRoad hashMapRoad = new HashMapRoad();
		HashMap miHashMap = hashMapRoad.createEmptyHashMap();
		assertTrue((miHashMap != null));
		if (miHashMap != null ) hashMapRoad.showMap(miHashMap);
		assertEquals(miHashMap.isEmpty(), true);
	}

	@Test
	public void createEmptyHashMapInitCapacityTest() {
		System.out.println("============== createEmptyHashMapInitCapacityTest =================");
		HashMapRoad hashMapRoad = new HashMapRoad();
		HashMap miHashMap = hashMapRoad.createEmptyHashMapInitialCapacity(20);
		assertTrue((miHashMap != null));
		if (miHashMap != null ) hashMapRoad.showMap(miHashMap);
		assertEquals(miHashMap.isEmpty(), true);
	}
	
	@Test
	public void createEmptyHashMapTestInitCapLoadFac() {
		System.out.println("============== createEmptyHashMapTestInitCapLoadFac =================");
		HashMapRoad hashMapRoad = new HashMapRoad();
		HashMap miHashMap = hashMapRoad.createEmptyHashMapInitialCapacityFactorLoad(20, 0.82f);
		assertTrue((miHashMap != null));
		if (miHashMap != null ) hashMapRoad.showMap(miHashMap);
		assertEquals(miHashMap.isEmpty(), true);
	}
	
	@Test
	public void createEmptyHashMapFromMapTest() {
		System.out.println("============== createEmptyHashMapFromMapTest =================");
		HashMapRoad hashMapRoad = new HashMapRoad();
		HashMap miHashMapOrig = hashMapRoad.createEmptyHashMap();
		HashMap miHashMap = hashMapRoad.createEmptyHashMapFromMap( miHashMapOrig);
		assertTrue((miHashMap != null));
		if (miHashMap != null ) hashMapRoad.showMap(miHashMap);
		assertEquals(miHashMap.isEmpty(), true);
	}
	
	@Test
	public void fillHashMapTest() {
		System.out.println("============== fillHashMapTest =================");
		HashMapRoad hashMapRoad = new HashMapRoad();
		hashMapRoad.fillHashMap();
		assert(true);
	}
	
	@Test
	public void putIfAbsentTest() {
		System.out.println("============== putIfAbsentTest =================");
		HashMapRoad hashMapRoad = new HashMapRoad();
		HashMap hashmap = hashMapRoad.createEmptyHashMap();
		hashmap.put(1, "uno");
		hashmap.put(2, "dos");
		hashmap.put(3, "tres");
		hashmap.put(4, "cuatro");
		hashmap.put(5, "cinco");
		System.out.println(hashmap);
		hashmap.put(1, "UNO");
		System.out.println(hashmap);
		System.out.println("hashmap.put() overwrites on key");
		hashmap.putIfAbsent(2, "DOS");
		System.out.println(hashmap);
		System.out.println("hashmap.putifAbsent() not overwrites on key");
		assertTrue(hashmap.get(2).equals("dos"));
	}
	
	@Test
	public void containsKeyORValue() {
		System.out.println("============== containsKeyORValue =================");
		HashMapRoad hashMapRoad = new HashMapRoad();
		HashMap hashmap = hashMapRoad.createEmptyHashMap();
		hashmap.put(1, "uno");
		hashmap.put(2, "dos");
		hashmap.put(3, "tres");
		hashmap.put(4, "cuatro");
		hashmap.put(5, "cinco");
		System.out.println(hashmap);
		System.out.println("hashmap.containsKey(2) : " + hashmap.containsKey(2));
		System.out.println("hashmap.containsValue(\"cuatro\") : " + hashmap.containsValue("cuatro"));
		System.out.println("hashmap.containsKey(99) : " + hashmap.containsKey(99));
		System.out.println("hashmap.containsValue(\"NO ESTA\") : " + hashmap.containsValue("NO ESTA"));
		
		assertTrue(hashmap.containsKey(2));
		assertTrue(hashmap.containsValue("cuatro"));
		assertFalse(hashmap.containsKey(99));
		assertFalse(hashmap.containsValue("NO ESTA"));
	}
	
	@Test
	public void sizeAndClear() {
		System.out.println("============== sizeAndClear =================");
		HashMapRoad hashMapRoad = new HashMapRoad();
		HashMap hashmap = hashMapRoad.createEmptyHashMap();
		hashmap.put(1, "Uno");
		hashmap.put(2, "Dos");
		hashmap.put(3, "Tres");
		hashmap.put(4, "Cuatro");
		hashmap.put(5, "Cinco");
		System.out.println(hashmap);
		System.out.println("hashmap.size() : " + hashmap.size());
		assertEquals(5, hashmap.size());
		hashmap.clear();
		System.out.println("hashmap.clear()");
		System.out.println(hashmap);
		System.out.println("hashmap.size() : " + hashmap.size());
		assertEquals(0, hashmap.size());
	}
	
	@Test
	public void getKeys() {
		System.out.println("============== getKeys =================");
		HashMapRoad hashMapRoad = new HashMapRoad();
		HashMap hashmap = hashMapRoad.createEmptyHashMap();
		hashmap.put(1, "Uno");
		hashmap.put(2, "Dos");
		hashmap.put(3, "Tres");
		hashmap.put(4, "Cuatro");
		hashmap.put(5, "Cinco");
		System.out.println(hashmap);
		Set set = hashmap.keySet();
		set.forEach((k) -> System.out.print(k + ", ")); System.out.println();
		assertTrue(set.contains(5));
	}
	
	@Test
	public void getValues() {
		System.out.println("============== getValues =================");
		HashMapRoad hashMapRoad = new HashMapRoad();
		HashMap hashmap = hashMapRoad.createEmptyHashMap();
		hashmap.put(1, "Uno");
		hashmap.put(2, "Dos");
		hashmap.put(3, "Tres");
		hashmap.put(4, "Cuatro");
		hashmap.put(5, "Cinco");
		System.out.println(hashmap);
		Collection values = hashmap.values();
		values.forEach((k) -> System.out.print(k + ", ")); System.out.println();
		assertTrue(values.contains("Tres"));
	}
	
	@Test
	public void remove() {
		System.out.println("============== remove =================");
		HashMapRoad hashMapRoad = new HashMapRoad();
		HashMap hashmap = hashMapRoad.createEmptyHashMap();
		hashmap.put("uno", "1111");
		hashmap.put("dos", "2222");
		hashmap.put("tres", "3333");
		hashmap.put("cuatro", "4444");
		hashmap.put("cinco", "5555");
		hashmap.put("seis", "REMOVER");
		hashmap.put("seisB", "NOREMOVER");
		System.out.println(hashmap);
		assertTrue(hashmap.get("seis").equals("REMOVER"));
		hashmap.remove("seis");
		System.out.println("hashmap.remove(\"seis\")");
		System.out.println(hashmap);
		hashmap.remove("seisB", "XXX");
		System.out.println("hashmap.remove(\"seisB\", \"XXX\")");
		System.out.println(hashmap);
		hashmap.remove("seisB", "NOREMOVER");
		System.out.println("hashmap.remove(\"seisB\", \"NOREMOVER\");");
		System.out.println(hashmap);
		assertFalse(hashmap.containsKey("seisB"));
	}
	
	@Test
	public void replace() {
		System.out.println("============== replace =================");
		HashMapRoad hashMapRoad = new HashMapRoad();
		HashMap hashmap = hashMapRoad.createEmptyHashMap();
		hashmap.put("uno", "1111");
		hashmap.put("dos", "2222");
		hashmap.put("tres", "3333");
		hashmap.put("cuatro", "4444");
		hashmap.put("cinco", "5555");
		hashmap.put("seis", "A REEMPLAZAR");
		hashmap.put("siete", "VALIDADO");
		System.out.println(hashmap);
		assertTrue(hashmap.get("seis").equals("A REEMPLAZAR"));
		hashmap.replace("seis", "6666");
		System.out.println("hashmap.replace(\"seis\", \"6666\")");
		System.out.println(hashmap);
		hashmap.replace("siete", "NO ES", "OK7777");
		System.out.println("hashmap.replace(\"siete\", \"NO ES\", \"OK7777\")");
		System.out.println(hashmap);
		hashmap.replace("siete", "VALIDADO", "OK7777");
		System.out.println("hashmap.replace(\"siete\", \"VALIDADO\", \"OK7777\")");
		System.out.println(hashmap);
		assertTrue(hashmap.get("siete").equals("OK7777"));
	}
	
	@Test
	public void traverse() {
		System.out.println("============== traverse =================");
		HashMapRoad hashMapRoad = new HashMapRoad();
		HashMap<Integer,String> hashmap = hashMapRoad.createEmptyHashMap();
		hashmap.put(1, "Uno");
		hashmap.put(2, "Dos");
		hashmap.put(3, "Tres");
		hashmap.put(4, "Cuatro");
		hashmap.put(5, "Cinco");
		System.out.println(hashmap);
		System.out.println("--- forEach");
		hashmap.forEach((k,v) -> System.out.println("key: " + k + " value: " + v));
		System.out.println("--- for");
		for (Map.Entry mapElement : hashmap.entrySet()) {
			System.out.println("key: " + mapElement.getKey() + " value: " + mapElement.getValue());
		}
		
		System.out.println("--- iterator");
		Iterator iterator = hashmap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry mapElement = (Map.Entry)iterator.next();
			System.out.println("key: " + mapElement.getKey() + " value: " + mapElement.getValue());
		}
		
		assertTrue(true);
	}
}
