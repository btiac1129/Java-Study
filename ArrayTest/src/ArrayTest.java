
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a1 = new int[10];
		int a2 [] = new int[10];
		
		// 배열의 개수
		System.out.println("a1의 개수 : " + a1.length);
		System.out.println("a2의 개수 : " + a2.length);
	
		int [] a3 = {1, 2, 3};
		System.out.println("a3의 개수 : " + a3.length);
		
		for (int i = 0; i < a3.length; i++) {
			System.out.printf("a3[%d] = %d \n", i, a3[i]);
		}
		
		// 다차원 배열
		int [] a4 [] = new int[3][5];
		int a5 [][] = new int[3][5];
		
		System.out.println("a4의 갯수 : " + a4.length);
		System.out.println("a4[0]의 갯수 : " + a4[0].length);
		
		int [][] a6 = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		for (int i = 0; i < a6.length; i++) {
			for (int k = 0; k < a6[i].length; k++) {
				System.out.printf("a[%d][%d] = %d \n", i, k, a6[i][k]);
			}
		}
	}
}
