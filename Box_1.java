package Class;

public class Box_1 {

	public static void main(String[] args) {
		int my_count1 = 100;
		int my_count2 = my_count1;
		Box mybox1 = new Box(10 ,20, 30);
		Box mybox2 = mybox1;
		mybox2.width = 10;
		mybox2.height = 50;
		mybox2.depth = 30;
		
		System.out.println("Box 1의 밑면 : " + mybox1.width + ", 세로 : " + mybox1.height + ", 높이 : " + mybox1.depth);
		
		System.out.println("Box 2의 밑면 : " + mybox2.width + ", 세로 : " + mybox2.height + ", 높이 : " + mybox2.depth);
	}

}

class Box {
	int width;
	int height;
	int depth;
	
	Box (int wi, int he, int de) {
		width = wi;
		height = he;
		depth = de;
	}
}
