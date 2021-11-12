package Class;

import java.util.Scanner;

public class MakePointEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Point P1 = new Point(0, 0);
	}

}

class Point {
	Scanner sc = new Scanner(System.in);
	
	int x;
	int y;
	
	Point(int xx, int yy) {
		x = xx;
		y = yy;
	}
}