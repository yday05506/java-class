package Class;

class Square1 {
	int width;
	int height;
	int idNum;
	static int sqld = 0;
	
	public Square1() {	//클래스와 동일한 이름의 생성자 함수
		idNum = sqld++;	//Square 생성자 함수를 이용하여 객체를 생성 후 Sqld를 증가
	}
}

public class Static_Sample {

	public static void main(String[] args) {
		
	}

}
