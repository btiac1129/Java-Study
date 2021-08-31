
public class Class {
	
	public void method1 () {
		System.out.println("메서드 1번입니다.");
		method2();
	}
	
	public void method2 () {
		System.out.println("메서드 2번입니다.");
	}
	
	public void add(int a, int b) {
		int result = a + b;
		System.out.println("정수 연산 : a + b = " + result);
	}
	
	// 메소드의 오버로딩
	// 클래스 내부에서 메서드의 이름은 같고 매개 변수만 다르게 해서 메서드를 작성하는 것.
	public void add(int a, int b, int c) {
		int result = a + b + c;
		System.out.print(("정수 3개 연산 : a + b + c = " + result);
	}
	
	public int resultAdd(int a, int b) {
		int result = a + b;
		return result;
	}
}
