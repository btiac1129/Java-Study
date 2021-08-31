
public class ForTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Q1.
		for (int i=0; i<3; i++) {
			for (int k=0; k<3; k++) {
				System.out.printf("%d ", k + 1 + (3 * i));
			}
			System.out.println();			
		}
		System.out.println();	
		
		for (int i=0; i<3; i++) {
			for (int k=0; k<3; k++) {
				System.out.printf("%d ", 3 - k + (3 * i));
			}
			System.out.println();
		}
		System.out.println();	
		
		for (int i=0; i<3; i++) {
			for (int k=0; k<3; k++) {
				System.out.printf("%d ", 3 * k + i + 1);
			}
			System.out.println();
		}
		System.out.println();	
	}

}
