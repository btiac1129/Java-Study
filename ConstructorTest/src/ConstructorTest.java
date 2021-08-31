
public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ConstructorTest();
		new ConstructorTest(10);
		new ConstructorTest(100, 200);
	}

	// 매개변수가 없는 생성자 - default 생성자
	public ConstructorTest () {
		System.out.println("Default 생성자");
	}
	// 매개변수가 있는 생성자
	public ConstructorTest(int a) {
		System.out.println("넘겨 받은 점수 값 : " + a);
	}
	
	public ConstructorTest(int a, int b) {
		System.out.println("두 수의 합 : " + (a + b));
	}
}
