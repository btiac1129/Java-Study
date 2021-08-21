
public class ConstValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("정수: %d\n", 100);
		System.out.printf("정수: %d %d\n", 200, 300);
		
		System.out.printf("%d ~ %d\n", -2147483648, 2147483647);
		System.out.printf("%d ~ %d\n", -2147483649L, 2147483648l);
	
		System.out.printf("%c\n", 'a');
		
		System.out.printf("%f\n", 123.456);
		System.out.printf("%2.2f\n", 123.456);
		System.out.printf("%.2f\n", 123.456);
		
		System.out.printf("%10d\n", 10);
		System.out.printf("%010d\n", 10);
		
		System.out.printf("%s\n", "반갑습니다");
		System.out.printf("%s %d\n", "안녕하세요", 200);
	}

}
