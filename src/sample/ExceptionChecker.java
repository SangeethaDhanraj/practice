package handlers;


public class ExceptionChecker {
public static void firstMethod(){
	System.out.println("Hi");
	System.out.println("Helo");
	try{
		System.out.println("statements inside try");
		int i=4/0;
		System.out.println(i);
		System.out.println("statements inside try after exception");
	}catch(RuntimeException e){
		System.out.println("1st catch block");
	}
	
	System.out.println("statement after exceptions");
	System.out.println("statements");
}

public static void secondMethod() throws Exception{
	System.out.println("2nd method");
	
	int i=4/0;
	System.out.println(i);
	
	System.out.println("statement after exceptions");
	System.out.println("statements");
}


public static void thirdMethod() throws Exception{
	System.out.println("Hi");
	System.out.println("Helo");
	try{
		System.out.println("1st line inside try block");
		System.out.println("2st line inside try block");
		int i=4/0;
		System.out.println(i);
		System.out.println("3st line inside try block");
		System.out.println("4st line inside try block");
	}catch(RuntimeException e){
		System.out.println("catch block");
	}
	
	
	System.out.println("nice thing");
	System.out.println("very good");
	
	String s=null;
	System.out.println(s.length());
	
	System.out.println("statement after exceptions");
	System.out.println("statements");
	
}
public static void main(String[] args) throws Exception {
	firstMethod();
	try{
		secondMethod();
	}catch(ClassCastException e){
		System.out.println(e);
	}finally {
		thirdMethod();
	}
}


}
