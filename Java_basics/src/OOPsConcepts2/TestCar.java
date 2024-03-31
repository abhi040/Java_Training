package OOPsConcepts2;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start();
		b.theftsafty();
		b.refuel();
		b.engine();
		
		System.out.println("**********");
		
		Car c=new BMW();
		c.start();
		c.refuel();
		c.start();
		
		System.out.println("***********");
		
		

	}

}
