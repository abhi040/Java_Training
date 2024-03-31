package OOPsConcepts2;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		
		
		ArrayList ar = new ArrayList();
		
		ar.add(300);
		ar.add(200);
		ar.add(100);
		
		
		System.out.println(ar.size());
		
		ar.add("Tom");
		ar.add(22.98);
		ar.add('A');
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(3));
		
		
		for (int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(400);
		
		System.out.println("********************");
		
		ArrayList ar2= new ArrayList();
		ar2.add('A');
		ar2.add("Test");
		ar2.add(22.97);
		
		ArrayList ar3=new ArrayList();
		ar3.add("harry");
		ar3.add(25);
		
		ar3.addAll(ar2);
		
		for(int i=0;i<ar3.size();i++) {
			System.out.println(ar3.get(i));	
		}
		
		System.out.println("*********************");
		
		
		ar3.removeAll(ar2);
		
		for(int i=0;i<ar3.size();i++) {
			System.out.println(ar3.get(i));
		}
		
		System.out.println("*********************");
		
		ArrayList ar4= new ArrayList();
		ar4.add('A');
		ar4.add("Test");
		ar4.add(22.97);
		
		ArrayList ar5=new ArrayList();
		ar5.add("Test");
		ar5.add(25);
		
		ar5.retainAll(ar4);
		
		for(int i=0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
		
	}
	


}
