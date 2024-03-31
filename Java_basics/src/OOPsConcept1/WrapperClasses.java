package OOPsConcept1;

public class WrapperClasses {

	public static void main(String[] args) {
		
		String s = "100";
		int a = Integer.parseInt(s);
				System.out.println(a+20);
				
		String g = "22.98";
		double z = Double.parseDouble(g);
		System.out.println(z+10);
		
		
		int q = 10;
		String x = String.valueOf(q);
		System.out.println(20+x);
	}

}
