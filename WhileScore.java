import java.util.Scanner;
public class WhileScore {
	public static void main ( String args[ ] ) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int sum = 0;
		System.out.print("성적 입력 : ");
		int n = sc.nextInt( );

		while ( n != 0) {
			sum += n;
			n = sc.nextInt( );
			i++;
		}
		System.out.println("점수의 합 : " + sum);
		System.out.print("점수의 평균 : " + (double)(sum / (i-1) ) );
	}
}