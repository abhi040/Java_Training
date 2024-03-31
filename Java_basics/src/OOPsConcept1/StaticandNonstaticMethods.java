package OOPsConcept1;

public class StaticandNonstaticMethods {
	
	String Name="Tom";
	static int age=25;

	public static void main(String[] args) {
		
		sum();
		StaticandNonstaticMethods.sum();
		
		StaticandNonstaticMethods obj=new StaticandNonstaticMethods();
		obj.sendmail();
		System.out.println(obj.Name);
		//System.out.println(obj.age);

	}
	
	public void sendmail() {
		System.out.println("This is sum method");
	}
	
	public static void sum() {
		System.out.println("This is static method");
	}

}
