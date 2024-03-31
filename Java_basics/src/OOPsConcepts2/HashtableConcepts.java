package OOPsConcepts2;

import java.util.Hashtable;

public class HashtableConcepts {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable ();
		
		h.put(1, 100);
		h.put(2, "Tom");
		h.put(3, 'A');
		
		System.out.println(h.size());
		
		System.out.println(h.get(2));
		
		Hashtable <Integer, Integer> h1 = new Hashtable<Integer, Integer>();
		
		h1.put(1, 500);
		h1.put(2, 1000);
		
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
		
		h2.put(1, "Ashok");
		h2.put(2, "Alok");
		
		System.out.println(h2.get(2));
		

	}

}
