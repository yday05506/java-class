package Class;

class Tri {
	int bottom;
	int height;
	//double area2;	//나누는 수식이 들어가는 건 double로 해주는 것이 좋음
	
	double area() {
		//area2 = (double)bottom * (double)height / 2;
		return (double)bottom * height / 2;
	}
}

public class Tri_Test {

	public static void main(String[] args) {
		Tri T1 = new Tri();
		T1.bottom = 3;
		T1.height = 5;
		//T1.area();
		System.out.println(T1.area());
	}

}
