package OOPsConcept1;

public class Function {

	public static void main(String[] args) {
		
		Function obj=new Function();
			obj.test();
			int z=obj.sum();
			System.out.println(z);
			String p=obj.qa();
			System.out.println(p);
			double q=obj.add();
			System.out.println(q);
			
		
	}	
		public void test() {
			System.out.println("This is test method");
		}
		
		public int sum() {
			System.out.println("This is sum method");
			int a=10;
			int b =20;
			int c = a+b;
			return c;
			
		}
		
		public String qa() {
			System.out.println("This is QA method");
			String s = "Hello QA";
			return s;
		}
		
		public double add() {
			double a = 10.33;
			double c = 20.15;
			double b = a+c;
			return b;
		}

}
