package sample;
import java.util.TreeMap;
import java.util.Map;
public class Person {
	private String name;
	
	private Map<String, String> phoneNumbers = new TreeMap<>();	//String number, String type
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
    }
	
	public Map<String,String> getPhoneNumbers() {
		return phoneNumbers;
	}
	
	public void addNumber(String number, String type) {
		phoneNumbers.put(number, type);
	}
}