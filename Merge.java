package Array;
import java.util.Scanner;
public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int temp = 0;
		//방 잡기
		int[] a = new int[5];
		int[] b = new int[5];
		int[] c = new int[10];
		
		//a 데이터 입력
		System.out.print("데이터 입력 : ");
		for(int i = 0; i < a.length; i++)
			a[i] = sc.nextInt();
		
		//b 데이터 입력
		System.out.print("두 번째 데이터 입력 : ");
		for(int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		
		//a 정렬
		for(int i = 0; i < a.length; i++) {
			for(int j = i+1; j < a.length; j++) {
				if(a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		//b 정렬
		for(int i = 0; i < b.length; i++) {
			for(int j = i+1; j < b.length; j++) {
				if(b[i] > b[j]) {
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		
		//a 출력
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + "\t");
		System.out.println();
	
		//b 출력
		for(int i = 0; i < b.length; i++)
			System.out.print(b[i] + "\t");
		System.out.println();
		
		//merge
		int x = 0, y=0, z=0;
		while(true) {
			if(a[x] < b[y]) {
				c[z] = a[x];
				x++;
				z++;
			}
			else if (a[x] > b[y]) {
				c[z] = b[y];
				y++;
				z++;
			}
			else {
			c[z] = a[x];
				x++;
				y++;
				z++;
			}
						
			if(x == a.length || y == b.length)
				break;
		}
		
		//남은 방에 데이터값 대입
		if(x == a.length) {
			for(int i = y; i < b.length; i++) {
				c[z] = b[i];
				z++;	
			}
		}
		else {
			for(int i = x; i < a.length; i++) {
				c[z] = a[i];
				z++;
			}
		}
		
		//c 출력
		for(int i = 0; i < c.length; i++)
			System.out.print(c[i] + "\t");
	}

}
