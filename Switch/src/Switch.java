import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		
		switch(a) {
		case 1 :
			System.out.println("1 �Դϴ�.");
			break;
		case 2:
			System.out.println("2 �Դϴ�.");
			break;
		case 3: 
			System.out.println("3 �Դϴ�.");
			break;
		default :
			System.out.println("1, 2, 3�Դϴ�.");
			break;
		}
		
		try {
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			System.out.println("���ڸ� �Է��ϼ��� : ");
			String str1 = br.readLine();
			int num1 = Integer.parseInt(str1);
			System.out.println("���ڸ� �Է��ϼ��� : ");
			String str2 = br.readLine();
			int num2 = Integer.parseInt(str2);
			System.out.println("������(+, -, *, /)�� �Է��ϼ��� : ");
			char op = (char)System.in.read();
			
			switch(op) {
			case '+':
				System.out.printf("%d", (num1 + num2));
				break;
			case '-':
				System.out.printf("%d", (num1 - num2));
				break;
			case '*':
				System.out.printf("%d", (num1 * num2));
				break;
			case '/':
				System.out.printf("%d", (num1 / num2));
				break;
			}
		} catch (Exception e) { }
	}

}
