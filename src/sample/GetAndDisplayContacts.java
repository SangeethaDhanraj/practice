package sample;

import java.util.*;
import java.util.Map.Entry;

public class GetAndDisplayContacts {

	private static Scanner scanner;
	private static Scanner input;

	private static Map<String, Map<String, Set<String>>> mapping = new HashMap<String, Map<String, Set<String>>>();

	public static void showMenu() {

		int option;
		scanner = new Scanner(System.in);

		System.out.println("-------------Menu-------------");
		System.out.println("1. Add User");
		System.out.println("2. View contact Details");
		System.out.println("3. Exit");
		System.out.println("Choose the option");

		option = scanner.nextInt();

		switch (option) {
		case 1:
			addUser();
			showMenu();
			break;

		case 2:
			viewContactDetails();
			showMenu();
			break;

		case 3:
			System.out.println("Exits succesfully");
			System.exit(0);

		default:
			System.out.println("you have chosen a wrong option, choose again");
			showMenu();
		}
	}

	public static Map<String, Map<String, Set<String>>> addUser() {
		System.out.println("Enter user name:");
		String employeeName = scanner.next();
		mapping.put(employeeName, getContacts(employeeName));
		return mapping;
	}

	public static Map<String, Set<String>> getContacts(String name) {
		Set<String> workContactNumbers = new HashSet<String>();
		Set<String> homeContactNumbers = new HashSet<String>();
		Set<String> otherContactNumbers = new HashSet<String>();
		input = new Scanner(System.in);
		do {

			System.out.println("Enter contact type: (Work, Home, Others)");
			String type = input.next();

			if (type.equalsIgnoreCase("Work")) {
				System.out.println("Enter valid 10 digit number");
				String value = input.next();
				if ((value.matches("\\d{10}")) || (value.matches("\\d{3}-\\d{7}"))) {
					workContactNumbers.add(value);
				} else {
					System.out.println("check the number");
				}
			} else if (type.equalsIgnoreCase("Home")) {
				System.out.println("Enter valid 10 digit number");
				String value = input.next();

				if ((value.matches("\\d{10}")) || (value.matches("\\d{3}-\\d{7}"))) {
					homeContactNumbers.add(value);
				} else {
					System.out.println("check the number");
				}
			} else if (type.equalsIgnoreCase("Others")) {
				System.out.println("Enter valid 10 digit number");
				String value = input.next();
				if ((value.matches("\\d{10}")) || (value.matches("\\d{3}-\\d{7}"))) {

					otherContactNumbers.add(value);
				} else {
					System.out.println("check the number");
				}
			} else {
				System.out.println("you have chosen wrong type");
			}
			System.out.println("Do you want to add more numbers? (Y/N)");

		} while ((input.next()).equalsIgnoreCase("y"));

		Map<String, Set<String>> map = new HashMap<String, Set<String>>();
		map.put("Work", workContactNumbers);
		map.put("Home", homeContactNumbers);
		map.put("Other", otherContactNumbers);
		return map;
	}

	public static void viewContactDetails() {
		System.out.println("Enter user name to get contact details");
		String searchingEmployeeName = scanner.next();

		Map<String, Set<String>> userInfo = mapping.get(searchingEmployeeName);

		if (userInfo != null) {
			for (Entry<String, Set<String>> e : userInfo.entrySet()) {
				System.out.println(e.getKey() + " : " + printString(e.getValue()));
			}
		} else {
			System.out.println("sorry we dont have your info in our database");
		}

	}

	public static String printString(Set<String> set) {
		String values = "  ";
		for (String temp : set) {
			values += temp + " ";
		}
		return values;
	}

	public static void main(String[] args) {
		showMenu();
	}

}
