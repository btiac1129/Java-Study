
public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		
		while (a < 100) {
			a = a + a;
			System.out.printf("%d ", a);
		}
		
		// TODO ���� 1���� �����Ͽ� 2, 3, 5�� ������ �������� �ʴ� ���� �� 100�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		int num = 1;
		int count = 1;
		while (count <= 100) {
			if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0) {
				System.out.printf("%d \n", num);
				count += 1;
			}
			num += 1;
		}
	}

}
