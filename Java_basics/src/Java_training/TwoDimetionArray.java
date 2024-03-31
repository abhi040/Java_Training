package Java_training;

public class TwoDimentionArray {

	public static void main(String[] args) {
		
		int x[][]=new int[3][5];
		
		x[0][0]=1;
		x[0][1]=2;
		x[0][2]=3;
		x[0][3]=4;
		x[0][4]=5;
		
		x[1][0]=1;
		x[1][1]=2;
		x[1][2]=3;
		x[1][3]=4;
		x[1][4]=5;
		
		x[2][0]=1;
		x[2][1]=2;
		x[2][2]=3;
		x[2][3]=4;
		x[2][4]=5;
		
		for(int row=0;row<x.length;row++) {
			for(int col=0;col<x[0].length;col++) {
				System.out.println(x[row][col]);
			}
		}
		
	}

}
