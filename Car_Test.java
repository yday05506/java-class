package Class;

//클래스 정의
class Car {
	String 모델명;
	String 제조사;
	void speedUp(){
		System.out.println(모델명 + " Speed Up");
	}
	
	void stop() {
		System.out.println(모델명 + " Stop");
	}
	
	Car(){
		System.out.println("기본 생성자");
	}	//return 타입이 없고 메서드 형태와 같고 클래스 이름을 갖고 있는 것을 생성자라고 부름 -> 쓸 일이 없으면 생략 가능
	
	Car(String model, String comp) {	//생성자 Constructer
		모델명 = model;
		제조사 = comp;
	}
}

public class Car_Test {

	public static void main(String[] args) {
		Car morning = new Car("모닝", "현대");	//생성자
		Car sm3 = new Car("SM3", "삼성");
//		morning.모델명 = "모닝";
//		morning.제조사 = "현대";
		morning.speedUp();
		morning.stop();
//		sm3.모델명 = "SM3";
//		sm3.제조사 = "삼성";
		sm3.speedUp();
		sm3.stop();
	}

}
