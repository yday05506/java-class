package Array;
import java.util.Scanner;
public class Array2_score {

	//선언
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 입력 : ");
		int inwon = sc.nextInt();
		System.out.print("평가 항목 수 입력 : ");
		int content = sc.nextInt();
		int[][] score = new int[inwon][content+2];	//총점, 순위
		int win = 0;
		//int[] add = new int[5];
		int max = 0;
		//int[] rank = new int[score.length];
		String[] sub_title = {"완성도", "창의성", "이해도", "발표력", "공공성"};
		int temp = 0;
		int tot = content;	//0, 1, 2 항목 수 번째 방이 합계(3) 방
		int rank = content+1;	//0, 1, 2 항목 수 번째 방이 순위(4) 방
		int line_su = 22+content*8;
		
		//입력
		for(int i = 0; i < score.length; i++) {
			System.out.println("- " + (i+1) + "조 -");
			for(int j = 0; j < score[i].length-2; j++) {
				while(true) {
					System.out.print(sub_title[j] + " : ");
					score[i][j] = sc.nextInt();
					if(score[i][j] >= 0 && score[i][j] <= 20)
						break;
				}
			}
			System.out.println();
			score[i][content] = 0;
		}
	
		//합계
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j <score[i].length-2; j++) {
				score[i][tot] += score[i][j];
				if(score[i][tot] > max) {
					max = score[i][tot];
					win = i+1;
				}
			}
		}
		
		//최고팀 비교
		for(int i = 0; i < score.length; i++)
			score[i][rank] = 1;
		for(int i = 0; i < score.length-1; i++) {
			for(int j = i+1; j < score.length; j++) {
				if(score[i][tot] < score[j][tot]) score[i][rank]++;
				else if(score[i][tot] > score[j][tot]) score[j][rank]++;
			}
		}
		
		//순위
		for(int i = 0; i < score.length-1; i++) {
			for(int j = 0; j < score[i].length-2; j++) {
				if (score[i][j] > score[i][j+1]) {
					temp = score[i][j];
					score[i][j] = score[i][j+1];
					score[i][j+1] = temp;
				}
			}
		}
	
		//출력
		line(line_su, '&');
		for(int i = 0; i < content; i++) 
				System.out.print("\t" + sub_title[i]);
		System.out.print("\t합계");
		System.out.println("\t순위");
		line(line_su, '=');
		
		for(int i = 0; i < score.length; i++) {
			System.out.print((i+1) + "조 : \t");
			for(int j = 0; j < score[i].length-2; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.print(score[i][tot] + "\t");
			System.out.println(score[i][rank] +"\t");
		}
		line(line_su, '$');
		System.out.print("최고팀 : " + win + "조");
		//System.out.print(win + "조 : " + max);
	}
	
	static void line(int su, char ch) {
		for(int i = 0; i < su; i++)
			System.out.print(ch);
		System.out.println();
	}
}
