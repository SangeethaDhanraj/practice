package sample;

public class SimpleMultiplyer {

	public boolean multipleOf3Or5Only(int n) {
	    if(n%3==0||n%5==0){
	    	if(n%3==0 && n%5==0)
	    	{
	    		return false;
	    	}
	    	return true;
	    	}
	    else{
    		return false;
    	}
    
	}

	public static void main(String[] args) {
		SimpleMultiplyer result=new SimpleMultiplyer();
		System.out.println("multipleOf3Or5Only(6) --> " + result.multipleOf3Or5Only(6));
		System.out.println("multipleOf3Or5Only(20) --> " + result.multipleOf3Or5Only(20));
		System.out.println("multipleOf3Or5Only(15) --> " + result.multipleOf3Or5Only(15));
		System.out.println("multipleOf3Or5Only(33) --> " + result.multipleOf3Or5Only(33));
		System.out.println("multipleOf3Or5Only(30) --> " + result.multipleOf3Or5Only(30));
	}

}
