package com.full.sortinterns;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class SortInterns {
	private ArrayList<InternsDetails> internsList = new ArrayList<InternsDetails>();
	private Scanner scanner;
	int age1, age2, i, j;
	String name1, name2;
	Date date1, date2;
	InternsDetails temp;

	private void showMenu() {

		int option;
		scanner = new Scanner(System.in);

		System.out.println("-------------Menu-------------");
		System.out.println("1. List by Alphabetical order");
		System.out.println("2. List by Age");
		System.out.println("3. List by Date of joining");
		System.out.println("4. Exit");
		System.out.println("Choose the option");

		option = scanner.nextInt();

		switch (option) {
		case 1:
			displayByName();
			showMenu();

		case 2:
			displayByAge();
			showMenu();

		case 3:
			displayByDateOfJoining();
			showMenu();

		case 4:
			System.out.println("Exits succesfully");
			System.exit(0);

		default:
			System.out.println("you have chosen a wrong option, choose again");
			showMenu();
		}
	}

	private void addInterns(InternsDetails intern) {
		internsList.add(intern);
	}

	private ArrayList<InternsDetails> sortByName(ArrayList<InternsDetails> list) {
		int lengthOfArray = internsList.size();
		for (i = 0; i < lengthOfArray; i++) {
			for (j = 0; j < lengthOfArray; j++) {

				name1 = internsList.get(i).name;
				name2 = internsList.get(j).name;

				if (name1.compareToIgnoreCase(name2) < 0) {
					temp = internsList.get(i);
					internsList.set(i, internsList.get(j));
					internsList.set(j, temp);
				} else if (name1.compareToIgnoreCase(name2) > 0) {
					continue;
				} else if (name1.compareToIgnoreCase(name2) == 0) {

					date1 = internsList.get(i).dateOfJoining;
					date2 = internsList.get(j).dateOfJoining;

					if (date1.compareTo(date2) < 0) {
						temp = internsList.get(i);
						internsList.set(i, internsList.get(j));
						internsList.set(j, temp);
					} else if (date1.compareTo(date2) > 0 || date1.compareTo(date2) == 0) {
						continue;
					}
				}
			}
		}

		return list;

	}

	private void displayByName() {
		ArrayList<InternsDetails> sortedByAge = sortByName(internsList);
		for (InternsDetails intern : sortedByAge) {
			System.out.println(
					"Name: " + intern.name + "	 Age: " + intern.age + "   Date of joining: " + intern.dateOfJoining);
		}
	}

	private ArrayList<InternsDetails> sortByAge(ArrayList<InternsDetails> list) {
		int lengthOfArray = internsList.size();
		for (i = 0; i < lengthOfArray; i++) {
			for (j = 0; j < lengthOfArray; j++) {
				age1 = internsList.get(i).age;
				age2 = internsList.get(j).age;

				if (age1 < age2) {
					temp = internsList.get(i);
					internsList.set(i, internsList.get(j));
					internsList.set(j, temp);
				} else if (age1 > age2) {
					continue;
				} else if (age1 == age2) {
					name1 = internsList.get(i).name;
					name2 = internsList.get(j).name;

					if (name1.compareToIgnoreCase(name2) < 0) {
						temp = internsList.get(i);
						internsList.set(i, internsList.get(j));
						internsList.set(j, temp);
					} else if (name1.compareToIgnoreCase(name2) > 0) {
						continue;
					}
				}
			}
		}

		return list;
	}

	private void displayByAge() {
		ArrayList<InternsDetails> sortedByAge = sortByAge(internsList);
		for (InternsDetails intern : sortedByAge) {
			System.out.println(
					"Name: " + intern.name + "	 Age: " + intern.age + "   Date of joining: " + intern.dateOfJoining);
		}
	}

	private ArrayList<InternsDetails> sortByDateOfJoining(ArrayList<InternsDetails> list) {
		int lengthOfArray = internsList.size();
		for (i = 0; i < lengthOfArray; i++) {
			for (j = 0; j < lengthOfArray; j++) {
				date1 = internsList.get(i).dateOfJoining;
				date2 = internsList.get(j).dateOfJoining;

				if (date1.compareTo(date2) < 0) {
					temp = internsList.get(i);
					internsList.set(i, internsList.get(j));
					internsList.set(j, temp);
				} else if (date1.compareTo(date2) > 0) {
					continue;

				} else if (date1.compareTo(date2) == 0) {
					name1 = internsList.get(i).name;
					name2 = internsList.get(j).name;

					if (name1.compareToIgnoreCase(name2) < 0) {
						temp = internsList.get(i);
						internsList.set(i, internsList.get(j));
						internsList.set(j, temp);
					} else if (name1.compareToIgnoreCase(name2) > 0) {
						continue;
					}
				}
			}
		}

		return list;
	}

	private void displayByDateOfJoining() {
		ArrayList<InternsDetails> sortedByAge = sortByDateOfJoining(internsList);
		for (InternsDetails intern : sortedByAge) {
			System.out.println(
					"Name: " + intern.name + "	 Age: " + intern.age + "   Date of joining: " + intern.dateOfJoining);
		}
	}

	public static void main(String[] args) throws Exception {
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		SortInterns sortInternsObj = new SortInterns();

		sortInternsObj.addInterns(new InternsDetails("Sangeetha", 25, format.parse("21-11-2016")));
		sortInternsObj.addInterns(new InternsDetails("Avani", 26, format.parse("15-11-2016")));
		sortInternsObj.addInterns(new InternsDetails("Ragav", 24, format.parse("15-11-2016")));
		sortInternsObj.addInterns(new InternsDetails("Sai", 22, format.parse("1-10-2016")));
		sortInternsObj.addInterns(new InternsDetails("Kamesh", 21, format.parse("1-10-2016")));
		sortInternsObj.addInterns(new InternsDetails("Shaik", 23, format.parse("1-10-2016")));
		sortInternsObj.addInterns(new InternsDetails("Abinaya", 22, format.parse("1-12-2016")));
		sortInternsObj.addInterns(new InternsDetails("Sangeetha", 25, format.parse("1-11-2016")));

		sortInternsObj.showMenu();

	}

}
