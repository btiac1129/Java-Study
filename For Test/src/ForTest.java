
public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 10; i++) {
			System.out.println("¾È³çÇÏ¼¼¿ä");			
		}
		
		for (int i = 0; i < 100; i++) {
			System.out.println(i + 1);
		}
		
		for (int i = 2; i <= 9; i++) {
//			System.out.println("2 x 1 = 2");
//			System.out.println("2 x 2 = 4");
//			...
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + i*j);				
			}
		}
	}

}
