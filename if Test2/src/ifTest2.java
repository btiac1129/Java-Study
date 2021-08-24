import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * 사용자에게 숫자를 입력받아 짝수인지 홀수인지 0인지 구분하는 프로그램을 작성하겠다.
 * */
public class ifTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// 사용자로부터 숫자를 입력받는다. 
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			System.out.print("숫자를 입력해주세요 : ");
			String str = br.readLine();
			int number = Integer.parseInt(str);
			// 숫자를 구분한다. 
			int flag = number % 2;
			// 결과를 출력한다.
			if (number == 0) {
				System.out.println("입력하신 숫자는 0입니다.");
			} else if (flag == 0) {
				System.out.println("입력하신 숫자는 짝수입니다.");
			} else if (flag == 1) {
				System.out.println("입력하신 숫자는 홀수입니다.");
			}
		} catch (Exception e) { }
		
		try {
			// 숫자를 입력 받는다.
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			System.out.println("숫자를 입력해주세요 : ");
			String str = br.readLine();
			int number = Integer.parseInt(str);
			// 숫자를 구분한다. 
			int flag = number % 3;
			// 결과를 출력한다. 
			if (number == 0) {
				System.out.println("입력하신 숫자는 0입니다.");
			} else if (flag == 0) {
				System.out.println("입력하신 숫자는 3의 배수입니다.");
			} else if (flag != 0) {
				System.out.println("입력하신 숫자는 3의 배수가 아닙니다.");
			}
		} catch (Exception e) { }
	}

}
