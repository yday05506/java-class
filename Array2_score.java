package Array;
import java.util.Scanner;
public class Array2_score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] score = new int[5][3];
		int win = 0;
		int[] add = new int[5];
		int max = 0;
		int[] rank = new int[score.length];
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
				add[i] += score[i][j];
				if(add[i] > max) {
					max = add[i];
					win = i+1;
				}
			}
			System.out.println();
			add[i] = 0;
		}
		
		for(int i = 0; i < score.length; i++)
			rank[i] = 1;
		for(int i = 0; i < score.length-1; i++) {
			for(int j = i+1; j < score.length; j++) {
				if(add[i] < add[j]) rank[i]++;
				else if(add[i] > add[j]) rank[j]++;
			}
		}
		
		//출력
		System.out.println("=======================================");
		for(int i = 0; i < sub_title.length; i++) 
				System.out.print("\t" + sub_title[i]);
		System.out.print("\t합계");
		System.out.println("\t순위");
		System.out.println("=======================================");
		
		for(int i = 0; i < score.length; i++) {
			System.out.print((i+1) + "조 : \t");
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println(add[i]);
		}
		System.out.println("=======================================");
		System.out.print("최고팀 : " + win + "조");
		//System.out.print(win + "조 : " + max);
	}
}
