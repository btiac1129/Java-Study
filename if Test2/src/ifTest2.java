import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * ����ڿ��� ���ڸ� �Է¹޾� ¦������ Ȧ������ 0���� �����ϴ� ���α׷��� �ۼ��ϰڴ�.
 * */
public class ifTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// ����ڷκ��� ���ڸ� �Է¹޴´�. 
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			System.out.print("���ڸ� �Է����ּ��� : ");
			String str = br.readLine();
			int number = Integer.parseInt(str);
			// ���ڸ� �����Ѵ�. 
			int flag = number % 2;
			// ����� ����Ѵ�.
			if (number == 0) {
				System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
			} else if (flag == 0) {
				System.out.println("�Է��Ͻ� ���ڴ� ¦���Դϴ�.");
			} else if (flag == 1) {
				System.out.println("�Է��Ͻ� ���ڴ� Ȧ���Դϴ�.");
			}
		} catch (Exception e) { }
		
		try {
			// ���ڸ� �Է� �޴´�.
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			System.out.println("���ڸ� �Է����ּ��� : ");
			String str = br.readLine();
			int number = Integer.parseInt(str);
			// ���ڸ� �����Ѵ�. 
			int flag = number % 3;
			// ����� ����Ѵ�. 
			if (number == 0) {
				System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
			} else if (flag == 0) {
				System.out.println("�Է��Ͻ� ���ڴ� 3�� ����Դϴ�.");
			} else if (flag != 0) {
				System.out.println("�Է��Ͻ� ���ڴ� 3�� ����� �ƴմϴ�.");
			}
		} catch (Exception e) { }
	}

}
