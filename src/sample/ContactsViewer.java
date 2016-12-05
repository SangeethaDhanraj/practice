package sample;

import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ContactsViewer {
	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		Map<String, String> contacts = new TreeMap<>();
		
		contacts.put("98848490", "home");
		contacts.put("98848491", "home");
		contacts.put("98848292", "home");
		contacts.put("98848493", "office");
		contacts.put("98848494", "office");
		contacts.put("98848492", "office");
		contacts.put("98848495", "others");
		contacts.put("98848496", "others");
		contacts.put("98948496", "others");
		
		Map<String, Map<String, String>> usersInfo = new TreeMap<>();
		usersInfo.put("yokesh", contacts);
		usersInfo.put("sangeetha", contacts);
		
		System.out.println("Type your name to get your contact numbers");
		String user = input.next();
	
		
		
		//get user phone numbers
		Map<String, String> userContacts = usersInfo.get(user);
		
		if(userContacts != null) {			
			for(Entry<String, String> e : userContacts.entrySet()) {
				System.out.println(e.getValue() + " : " + e.getKey());
			}
		} else {
			System.out.println("sorry we dont have your info in our database");
		}
	}
	
}