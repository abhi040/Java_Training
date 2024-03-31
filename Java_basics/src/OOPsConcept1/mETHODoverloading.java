package OOPsConcept1;

public class mETHODoverloading {

	public static void main(String[] args) {
		
		mETHODoverloading obj = new mETHODoverloading();
		obj.sum();
		obj.sum(30);
		obj.sum(50, 60);

	}
	
	public void sum () {
		System.out.println("This is first method");
	}
	
	public void sum(int i) {
		System.out.println(i);
	}
	
	public void sum (int i, int b) {
		System.out.println(i+b);
	}

}
