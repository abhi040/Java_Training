package Java_training;

public class ArrayConcept {

	public static void main(String[] args) {
		
		int i[]=new int [4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=50;
		
		Object ob[]=new Object[6];
		ob[0]="Tom";
		ob[1]=25;
		ob[2]='M';
		ob[3]="4/4/1994";
		ob[4]="Pune";
		ob[5]=10000;
		
		for(int j=0;j<ob.length;j++) {
			System.out.println(ob[j]);
		}
		
				
		
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}

	}

}
