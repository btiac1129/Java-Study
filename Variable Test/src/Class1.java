
public class Class1 {
	// Ŭ������ ��� ����
	int a;
	
	public void method1 () {
		int a = 20;
		
		// ���� ������ Ŭ������ ��� ���� ���� ���� ��� ���� ������ �켱�� �ȴ�.
		System.out.println("�޼���1�� ���� ���� a : " + a);
		
		// this�� ����ϸ� �ڱ� �ڽ��� Ŭ���� Class1�� ��� ������ a�� �����Ѵ�.
		System.out.println("Ŭ������ ��� ���� a : " + this.a);
	}
	
	public void method2 () {
		int a = 30;
		System.out.println("�޼���2�� ���� ���� a : " + a);
	}
}
