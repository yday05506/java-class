package Array;

public class ArrayExam13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[4][]; a[0] = new int[1]; a[1] = new int[2]; a[2] = new int[3]; a[3] = new int[4];
		int k = 1;
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++)
				a[i][j] = k++;
		}
		
		System.out.println("--------자바 실행--------");
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++)
				System.out.print(a[i][j] + "\t");
			System.out.println();
		}
	}

}
