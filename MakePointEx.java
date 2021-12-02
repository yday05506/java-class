package Class;

import java.util.Scanner;

public class MakePointEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Point1 P1 = new Point1(0, 0);
		System.out.print("처음 x값 입력 : ");
		int x = sc.nextInt();
		System.out.print("처음 y값 입력 : ");
		int y = sc.nextInt();
		
		System.out.print("이동 할 x값 입력 : ");
		int xx = sc.nextInt();
		int x1 = P1.x + xx;
		System.out.print("이동 할 y값 입력 : ");
		int yy = sc.nextInt();
		int y1 = P1.y + yy;
		
		System.out.println("x, y의 좌표 : " + x1 + ", " + y1);
	}

}

class Point1 {
	int x;
	int y;
	
	Point1(int xx, int yy) {
		x = xx;
		y = yy;
	}
}