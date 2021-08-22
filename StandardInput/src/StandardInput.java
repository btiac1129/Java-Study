/*
 * System.in 을 이용하면 글자 하나를 입력받을 수 있다. 
 * BufferedReader를 이용하면 라인 단위의 입력이 가능하다. 
 * 
 * */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StandardInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			int a1 = System.in.read();
//			// 다음 번 입력을 받기 위해 System.in.read() 를 2번 더 써야 한다.
//			System.in.read();
//			System.in.read();
//			System.out.println("a1 : " + a1);
//			int a2 = System.in.read();
//			System.out.println("a2 : " + a2);
		
			/*
			 * System.in.read() 로 입력 받을 때, 사용자가 몇 글자 입력할 지 예측할 수 없다는 이슈가 있고,
			 * 한 개씩만 입력 받을 수 있다는 한계가 있어서 잘 사용하지 않는다.
			 * 
			 * */
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			
			// BufferedReader 를 사용하게 되면, 글자 입력 후 <엔터>를 누를 때 추가되는 두 개의 글자까지도 한꺼번에 입력받는다. 
			// 그래서 CR과 LF 때문에 입력 두 번을 더 받아야 하는 것은 하지 않으면 된다.
			String str = br.readLine(); // 라인 단위로 입력 받고 싶을 때.
			System.out.println(str);
			
			// int 형태의 값을 char 형태로 형변환(casting)
			char c1 = (char)System.in.read();
			System.out.println("c1 : " + c1);
		} catch (Exception e) {
			
		}
	}

}