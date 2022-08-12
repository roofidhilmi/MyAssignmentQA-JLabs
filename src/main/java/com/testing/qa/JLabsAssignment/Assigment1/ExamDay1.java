package com.testing.qa.JLabsAssignment.Assigment1;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExamDay1 {

	public static void main(String[] args) {
		
			//-- dalam class TreeSet ini data-data dapat dibuat secara urut berdasarkan ascending
			TreeSet<Integer> number = new TreeSet<>();
			number.add(100);
			number.add(50);
			number.add(70);
			number.add(125);
			number.add(25);
			number.add(90);
			
			for(int item : number) {
				System.out.println(item);
			}
			System.out.println("=========================");
			
			TreeSet<String> huruf = new TreeSet<>();
			huruf.add("Muhammad Hilmi");
			huruf.add("Dinda");
			huruf.add("Farah");
			huruf.add("Rainaldi");
			huruf.add("Andre");
			
			for(String alphabet : huruf) {
				System.out.println(alphabet);
			}
			System.out.println("=========================");
			
			//-- TreeMap: 
			//-- TreeMap<Key, Value> objek = new TreeMap<>();
			TreeMap<String, Integer> NomorRumah = new TreeMap<>();
			NomorRumah.put("Hilmi", 10);
			NomorRumah.put("Dinda", 308);
			NomorRumah.put("Muhammad", 50);
			
			for(Map.Entry<String, Integer> rumah : NomorRumah.entrySet()) {
				System.out.println("Nomor Rumah dari " + rumah.getKey()+ " adalah " + rumah.getValue());
			}

	}

}
