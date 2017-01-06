package com.firstservler;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Anniversery {
	String year;

	public Anniversery(String year) {
		this.year = year;
	}

	public String getYear() {
		return year;
	}

	public ArrayList<String> findValue() {
		Map<String, ArrayList<String>> anniversaryList = new HashMap<>();
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Happy 1st Anniversery");
		list1.add("You got ring as a gift");
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Happy 2nd Anniversery");
		list2.add("You got Necklece as a gift");
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("Happy 3rd Anniversery");
		list3.add("You got car as a gift");
		ArrayList<String> list4 = new ArrayList<String>();
		list4.add("Happy 4th Anniversery");
		list4.add("You got bike as a gift");
		ArrayList<String> list5 = new ArrayList<String>();
		list5.add("Happy 5th Anniversery");
		list5.add("You got Bangle as a gift");
		anniversaryList.put("1", list1);
		anniversaryList.put("2", list2);
		anniversaryList.put("3", list3);
		anniversaryList.put("4", list4);
		anniversaryList.put("5", list5);
		ArrayList<String> result = anniversaryList.get(getYear());

		return result;

	}

}
