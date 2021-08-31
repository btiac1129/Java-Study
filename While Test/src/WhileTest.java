
public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		
		while (a < 100) {
			a = a + a;
			System.out.printf("%d ", a);
		}
		
		// TODO 정수 1부터 시작하여 2, 3, 5로 나누어 떨어지지 않는 수를 총 100개 출력하는 프로그램을 작성하시오
		int num = 1;
		int count = 1;
		while (count <= 100) {
			if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0) {
				System.out.printf("%d \n", num);
				count += 1;
			}
			num += 1;
		}
	}

}
