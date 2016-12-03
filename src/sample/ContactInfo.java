package sample;
import java.util.*;
public class ContactInfo {

	public Map<String,List<String>> allContacts(){
		 List<String> home = new ArrayList<>();
	      
	      home.add("044-7534565");
	      home.add("9867530065");
	      home.add("9867344565");
	      
	      
	     
			 List<String> work = new ArrayList<>();
		      
		      work.add("044-7534565");
		      work.add("9867530065");
		      work.add("9867344565");
		      
				 List<String> others = new ArrayList<>();
			      
				 others.add("0447534565");
				 others.add("9867530065");
				 others.add("9867344565");
				 
				 Map<String,List<String>> map=new LinkedHashMap<>();
			      map.put("Home", home);
			      map.put("Work", work);
			      map.put("Others", others);
				 
			     
	      return map;
	
	 
	}
	public String printstring(List<String> list) {
		String values="\n";
		for(int i =0 ; i < list.size();i++ )
		{
			values+= list.get(i) + "\n";
		}
		return values;
	}
	
}

