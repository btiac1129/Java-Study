
public class Class1 {
	// 클래스의 멤버 변수
	int a;
	
	public void method1 () {
		int a = 20;
		
		// 지역 변수와 클래스의 멤버 변수 명이 같은 경우 지역 변수가 우선시 된다.
		System.out.println("메서드1의 지역 변수 a : " + a);
		
		// this를 사용하면 자기 자신인 클래스 Class1의 멤버 변수인 a에 접근한다.
		System.out.println("클래스의 멤버 변수 a : " + this.a);
	}
	
	public void method2 () {
		int a = 30;
		System.out.println("메서드2의 지역 변수 a : " + a);
	}
}
