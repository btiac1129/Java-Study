
public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ConstructorTest();
		new ConstructorTest(10);
		new ConstructorTest(100, 200);
	}

	// �Ű������� ���� ������ - default ������
	public ConstructorTest () {
		System.out.println("Default ������");
	}
	// �Ű������� �ִ� ������
	public ConstructorTest(int a) {
		System.out.println("�Ѱ� ���� ���� �� : " + a);
	}
	
	public ConstructorTest(int a, int b) {
		System.out.println("�� ���� �� : " + (a + b));
	}
}
