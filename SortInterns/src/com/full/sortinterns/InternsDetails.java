package com.full.sortinterns;

import java.util.Date;

public class InternsDetails {
	String name;
	int age;
	Date dateOfJoining;
	
	public InternsDetails(String name, int age, Date dateOfJoining) {
		this.name = name;
		this.age = age;
		this.dateOfJoining = dateOfJoining;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}


}
