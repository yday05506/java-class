import java.util.Scanner;
public class DowhileMax {
	public static void main( String args[ ] ) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int num = 1;
		int max = num;
		System.out.print("������ �Է� : ");
		do {
			num = sc.nextInt( );
			if ( num > max ) max = num;
			i++;
		}
		while ( num != 0 );
		System.out.print("�ִ� �� : " + max);
	}
}