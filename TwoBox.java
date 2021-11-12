package Class;

public class TwoBox {

	public static void main(String[] args) {
		Box B1 = new Box(1, 2, 3);
		Box B2 = new Box(4, 5, 6);
		
		B1.volume(2);
		System.out.println();
		B2.volume(4);
	}

}

class Box {
	int width;
	int height;
	int depth;
	
	Box (int wi, int he, int dep) {
		width = wi;
		height = he;
		depth = dep;
	}
	
	int calc_v() {
		return width*height*depth;
	}
	
	int calc_v(int t) {
		return width*height*depth*t;
	}
	
	void volume(int times) {
		System.out.println("가로 : " + width);
		System.out.println("세로 : " + height);
		System.out.println("높이 : " + depth);
		System.out.println(times + "배 부피 : " + calc_v(times));
	}
}
