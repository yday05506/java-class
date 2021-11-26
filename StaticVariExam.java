package Class;

public class StaticVariExam {

	public static void main(String[] args) {
		System.out.println("생성된 학생 객체 수는 " + Student1.count + "입니다.");
		Student1 kim = new Student1();
		System.out.println("생성된 학생 객체 수는 " + Student1.count + "입니다.");
		System.out.println("생성된 학생 객체 수는 " + kim.count + "입니다.");
		Student1 jang = new Student1();
		System.out.println("생성된 학생 객체 수는 " + Student1.count + "입니다.");
		System.out.println("생성된 학생 객체 수는 " + jang.count + "입니다.");
		Student1 bak = new Student1();
		System.out.println("생성된 학생 객체 수는 " + Student1.count + "입니다.");
	}
}

class Student1 {
	String name;
	int grade;
	static int count = 0;
	public Student1() {
		count++;
	}
}
