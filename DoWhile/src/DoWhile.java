import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		
		do {
			a = a + a;
			System.out.printf("%d ", a);
		} while( a < 100 );
		
		try {
			InputStreamReader ir = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(ir);
			String str;
			
			do {
				str = br.readLine();
			} while ( Integer.parseInt(str) < 100 );			
		} catch(Exception e) {
			
		}
	}	

}
