package sample;
import java.util.*;
import java.util.Map.Entry;

public class ContactDetails {
private static Scanner scanner;
private static Scanner input;
public static Map<String, Set<String>> getContacts(String name)
{
	Set<String> workContactNumbers=new TreeSet<String>();
	Set<String> homeContactNumbers=new TreeSet<String>();
	Set<String>otherContactNumbers=new TreeSet<String>();
	input = new Scanner(System.in);
	System.out.println("how many work contact numbers your going to save?");
int	workNumbersCount=input.nextInt();
System.out.println("Type the numbers you want save");
for(int i=0;i<workNumbersCount;i++)
{
	workContactNumbers.add(input.next());
} 
System.out.println("How many home contact numbers your numbers your going to save?");
	int homeNumbersCount=input.nextInt();
	System.out.println("Type the numbers you want save");
	for(int i=0;i<homeNumbersCount;i++)
	{
		homeContactNumbers.add(input.next());
	}
	System.out.println("How many other contact numbers your going to save?");
	int otherNumbersCount=input.nextInt();
	System.out.println("Type the numbers you want save");
	for(int i=0;i<otherNumbersCount;i++)
	{
		otherContactNumbers.add(input.next());
	}
	Map<String,Set<String>> map=new TreeMap<String,Set<String>>();
	map.put("Work", workContactNumbers);
	map.put("Home", homeContactNumbers);
	map.put("Other", otherContactNumbers);
	return map;
}

public static String printString(Set<String> set) {
	String values="  " ;
	for(String temp : set)
	{
		values+= temp + " ";
	}
	return values;
}

	public static void main(String[] args) {
		
		Map<String,Map<String,Set<String>>> mapping=new TreeMap<String,Map<String,Set<String>>>();
		scanner = new Scanner(System.in);
		System.out.println("Enter how many employees database your going to save?");
		int employeesCount=scanner.nextInt();
		for(int i=0;i<employeesCount;i++)
		{
		System.out.println("Enter employee name:");
		String employeeName=scanner.next();
		mapping.put(employeeName,getContacts(employeeName));
		}
		
		System.out.println("Enter employee name to get contact details");
		 String searchingEmployeeName=scanner.next();
		 
		 Map<String,Set<String>> userInfo=mapping.get(searchingEmployeeName);
		 
		 if(userInfo != null) {			
				for(Entry<String,Set<String>> e : userInfo.entrySet()) {
					System.out.println(e.getKey() + " : " + printString(e.getValue()));
				}
			} else {
				System.out.println("sorry we dont have your info in our database");
			}
		 
		 
	}

}
