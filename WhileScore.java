import java.util.Scanner;
public class WhileScore {
	public static void main ( String args[ ] ) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int sum = 0;
		System.out.print("���� �Է� : ");
		int n = sc.nextInt( );

		while ( n != 0) {
			sum += n;
			n = sc.nextInt( );
			i++;
		}
		System.out.println("������ �� : " + sum);
		System.out.print("������ ��� : " + (double)(sum / (i-1) ) );
	}
}