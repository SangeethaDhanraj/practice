package sample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Test {
	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		System.out.println("Type your name to get your contact numbers");
		String user = input.next();
		if(user.equals("yokesh")) {
			ContactInfo h = new ContactInfo();
			Map<String, Map<String, List<String>>> m = new HashMap<>();
			m.put("yokesh", h.allContacts());
			Iterator<?> i = m.get("yokesh").keySet().iterator();
			while (i.hasNext()) {
				String key = (String) i.next();
				System.out.println(key + " " + h.printstring(m.get("yokesh").get(key)));
			}
				
			}else{
				System.out.println("sorry we dont have your info in our database");
		}
	}
	
}