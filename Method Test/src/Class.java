
public class Class {
	
	public void method1 () {
		System.out.println("�޼��� 1���Դϴ�.");
		method2();
	}
	
	public void method2 () {
		System.out.println("�޼��� 2���Դϴ�.");
	}
	
	public void add(int a, int b) {
		int result = a + b;
		System.out.println("���� ���� : a + b = " + result);
	}
	
	// �޼ҵ��� �����ε�
	// Ŭ���� ���ο��� �޼����� �̸��� ���� �Ű� ������ �ٸ��� �ؼ� �޼��带 �ۼ��ϴ� ��.
	public void add(int a, int b, int c) {
		int result = a + b + c;
		System.out.print(("���� 3�� ���� : a + b + c = " + result);
	}
	
	public int resultAdd(int a, int b) {
		int result = a + b;
		return result;
	}
}