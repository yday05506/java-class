package Array;

public class ArrayExam12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[7][10];
		//int k = 1;
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++)
				//a[i][j] = k++;
				//a[i][j] = i * 4  + (j+1);
				a[i][j] = i * a[i].length + (j+1);
		}
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++)
				System.out.print(a[i][j] + "\t");
			System.out.println();
		}
	}

}
