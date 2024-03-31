package OOPsConcept1;

public class LOcalvsGlobal {

	String name = "Tom";
	int age = 25;
	
	public static void main(String[] args) {
		
		int i=10;
		int j =20;
		
		System.out.println(i);
		
		LOcalvsGlobal obj = new LOcalvsGlobal();
	    System.out.println(obj.age);
	    
	    obj.sum();
	    int s = obj.sum();
	    System.out.println(s);
	    
	    
		

	}

	
	public int sum(){
		LOcalvsGlobal obj = new LOcalvsGlobal();
	    System.out.println(obj.name);
		
		int a = 20;
		int b =30;
		int c = a+b;
		
		return c;
        		

	    
	    
	}
	
	
}
