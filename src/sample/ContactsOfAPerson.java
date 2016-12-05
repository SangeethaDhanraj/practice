package sample;

import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Scanner;

public class ContactsOfAPerson {
	private static Scanner input;

	public static void main(String[] args) {
		
		Map<String, Person> users = new TreeMap<>();
		
		Person p = new Person("yokesh");
		p.addNumber("98848489", "home");
		p.addNumber("98848491", "home");
		p.addNumber("98848292", "home");
		p.addNumber("98848493", "office");
		p.addNumber("98848494", "office");
		p.addNumber("98848492", "office");
		p.addNumber("98848495", "others");
		p.addNumber("98848496", "others");
		p.addNumber("98948496", "others");
		
		users.put(p.getName(), p);
		
		Person p1 = new Person("sabitha");
		p1.addNumber("98848490", "home");
		p1.addNumber("98848491", "home");
		p1.addNumber("98848292", "home");
		p1.addNumber("98848493", "office");
		p1.addNumber("98848494", "office");
		p1.addNumber("98848492", "office");
		p1.addNumber("98848495", "others");
		p1.addNumber("98848496", "others");
		p1.addNumber("98948496", "others");
		
		users.put(p1.getName(), p1);
		
		try{
		System.out.println("Enter the name to get your contacts");
		input=new Scanner(System.in);
		String user = input.next();
		
		Person person = users.get(user);
		Map<String,String> contacts= person.getPhoneNumbers();
		if(contacts != null) {			
			for(Entry<String, String> e : contacts.entrySet()) {
				System.out.println(e.getValue() + " : " + e.getKey());
			}
		} 
		}catch(NullPointerException e) {
			System.out.println("sorry we dont have your info in our database");
		}
		
		
	}
	
}