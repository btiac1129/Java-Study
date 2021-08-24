import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		
		switch(a) {
		case 1 :
			System.out.println("1 입니다.");
			break;
		case 2:
			System.out.println("2 입니다.");
			break;
		case 3: 
			System.out.println("3 입니다.");
			break;
		default :
			System.out.println("1, 2, 3입니다.");
			break;
		}
		
		try {
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			System.out.println("숫자를 입력하세요 : ");
			String str1 = br.readLine();
			int num1 = Integer.parseInt(str1);
			System.out.println("숫자를 입력하세요 : ");
			String str2 = br.readLine();
			int num2 = Integer.parseInt(str2);
			System.out.println("연산자(+, -, *, /)를 입력하세요 : ");
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
