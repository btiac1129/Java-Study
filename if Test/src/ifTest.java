
public class ifTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		
		if (a < 20) {
			System.out.println("a�� 20���� �۽��ϴ�.");
		}
		
		if (a < 10) {
			System.out.println("a�� 10���� �۽��ϴ�.");
		}
		
		if (a < 1) {
			System.out.println("a�� 1���� �۽��ϴ�.");
		} else {
			System.out.println("a�� 1���� ũ�ų� �����ϴ�.");
		}
		
		if (a < 1) {
			System.out.println("a�� 1���� �۽��ϴ�.");
		} else if (a < 10) {
			System.out.println("a�� 1���� ũ�ų� ������ 10���� �۽��ϴ�.");
		} else if (a < 20) {
			System.out.println("a�� 10���� ũ�ų� ������ 20���� �۽��ϴ�.");
		} else {
			System.out.println("a�� 20���� ũ�ų� �����ϴ�.");
		}
	}

}
