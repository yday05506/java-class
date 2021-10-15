package Array;
import java.util.Scanner;
public class Array2_score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] score = new int[5][3];
		int win = 0;
		int add = 0;
		int max = 0;
		String[] sub_title = {"완성도", "창의성", "이해도"};
		
		for(int i = 0; i < score.length; i++) {
			System.out.println("- " + (i+1) + "조 -");
			for(int j = 0; j < score[i].length; j++) {
				while(true) {
					System.out.print(sub_title[j] + " : ");
					score[i][j] = sc.nextInt();
					if(score[i][j] >= 0 && score[i][j] <= 20)
						break;
				}
				add += score[i][j];
				if(add > max) {
					max = add;
					win = i+1;
				}
			}
			System.out.println();
			add = 0;
		}
		
		System.out.println("=======================================");
		for(int i = 0; i < sub_title.length; i++) 
				System.out.print("\t" + sub_title[i]);
		System.out.println();
		System.out.println("=======================================");
		
		for(int i = 0; i < score.length; i++) {
			System.out.print((i+1) + "조 : \t");
			for(int j = 0; j < score[i].length; j++) 
				System.out.print(score[i][j] + "\t");
			System.out.println();
		}
		System.out.println("=======================================");
		System.out.print("최고팀 : " + win + "조");
		//System.out.print(win + "조 : " + max);
	}
}
