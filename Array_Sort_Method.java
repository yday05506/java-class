package Array;
import java.util.Scanner;
public class Array_Sort_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int temp;
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
		sort(a);
		
		//b 정렬
		sort(b);
		
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
		for(int i = 0; i < c.length && c[i] != 0; i++)
			System.out.print(c[i] + "\t");
	}
	
	static void sort(int[] arr) {
		int temp;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}

