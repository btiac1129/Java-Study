/*
 * System.in �� �̿��ϸ� ���� �ϳ��� �Է¹��� �� �ִ�. 
 * BufferedReader�� �̿��ϸ� ���� ������ �Է��� �����ϴ�. 
 * 
 * */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StandardInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			int a1 = System.in.read();
//			// ���� �� �Է��� �ޱ� ���� System.in.read() �� 2�� �� ��� �Ѵ�.
//			System.in.read();
//			System.in.read();
//			System.out.println("a1 : " + a1);
//			int a2 = System.in.read();
//			System.out.println("a2 : " + a2);
		
			/*
			 * System.in.read() �� �Է� ���� ��, ����ڰ� �� ���� �Է��� �� ������ �� ���ٴ� �̽��� �ְ�,
			 * �� ������ �Է� ���� �� �ִٴ� �Ѱ谡 �־ �� ������� �ʴ´�.
			 * 
			 * */
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			
			// BufferedReader �� ����ϰ� �Ǹ�, ���� �Է� �� <����>�� ���� �� �߰��Ǵ� �� ���� ���ڱ����� �Ѳ����� �Է¹޴´�. 
			// �׷��� CR�� LF ������ �Է� �� ���� �� �޾ƾ� �ϴ� ���� ���� ������ �ȴ�.
			String str = br.readLine(); // ���� ������ �Է� �ް� ���� ��.
			System.out.println(str);
			
			// int ������ ���� char ���·� ����ȯ(casting)
			char c1 = (char)System.in.read();
			System.out.println("c1 : " + c1);
		} catch (Exception e) {
			
		}
	}

}