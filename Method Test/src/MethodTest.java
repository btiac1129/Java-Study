
public class MethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class c1 = new Class();
		
		c1.method1();
		
		c1.add(100, 200);
		
		int result = c1.resultAdd(500,  600);
		System.out.println("리턴 받은 값: " + result);
		
		c1.add(500,  600, 700);
	}

}
