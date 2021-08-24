
public class ifTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		
		if (a < 20) {
			System.out.println("a는 20보다 작습니다.");
		}
		
		if (a < 10) {
			System.out.println("a는 10보다 작습니다.");
		}
		
		if (a < 1) {
			System.out.println("a는 1보다 작습니다.");
		} else {
			System.out.println("a는 1보다 크거나 같습니다.");
		}
		
		if (a < 1) {
			System.out.println("a는 1보다 작습니다.");
		} else if (a < 10) {
			System.out.println("a는 1보다 크거나 같지만 10보단 작습니다.");
		} else if (a < 20) {
			System.out.println("a는 10보다 크거나 같지만 20보단 작습니다.");
		} else {
			System.out.println("a는 20보다 크거나 같습니다.");
		}
	}

}
