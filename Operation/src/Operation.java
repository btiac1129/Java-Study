
public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1 = 1 + 2 * 3;
		System.out.println("1 + 2 * 3 : " + a1);
	
		int a2 = (1 + 2) * 3;
		System.out.println("(1 + 2) * 3 : " + a2);

		// 단항 연산자 예제
		boolean bool1 = true;
		System.out.println("boo1 : " + bool1);
		System.out.println("!bool1 : " + !bool1);
		
		int i1 = 100;
		System.out.printf(" i1 : %32s\n", Integer.toBinaryString(i1));
		System.out.printf("~i1 : %32s\n", Integer.toBinaryString(~i1));
		
		System.out.println(~i1); // -101
		System.out.println(~i1 + 1); // -100, 컴퓨터의 음수 표현, 2의 보수의 방법
		
		// 부호 연산
		System.out.println(+i1); 
		System.out.println(-i1);
	
		// 증감 연산
		System.out.println("++i1 : " + ++i1);
		System.out.println(i1);
		System.out.println("--i1 : " + --i1);
		System.out.println(i1);
		
		// cast
		i1 = 214712458;
		
		short s1 = (short)i1;
		long l1 = i1; 
		System.out.println(s1); // 큰 것을 작은 것에 넣어서 문제 발생, 형변환 => 엉뚱한 값 출력. 
		System.out.println(l1); // 정상적인 출력
		
		// 연산자2
		System.out.println("100 + 200 = " + (100 + 200));
		System.out.println("100 - 200 = " + (100 - 200));
		System.out.println("100 * 200 = " + (100 * 200));
		System.out.println("100 / 200 = " + (100 / 200));
		System.out.println("100 % 200 = " + (100 % 200));
		
		// 문자열과 숫자형을 더할 경우 숫자형이 문자열로 바뀐다.
		System.out.println("100" + 200 + 300); // 200, 300이 문자열로 바뀐다.
		System.out.println(100 + 200 + "300"); // 300300
		
		// 시프트 연산자
		System.out.printf("%32s %d \n",  Integer.toBinaryString(100), 100);
		// 오른쪽으로 시프트를 한 번 하면, 2로 나눈 효과가 있다.
		System.out.printf("%32s %d \n", Integer.toBinaryString(100 >> 1), 100 >> 1);
		// 오른쪽으로 두 번 시프트를 하면, 2의 제곱, 즉 4로 나눈 효과가 있다.
		System.out.printf("%32s %d \n", Integer.toBinaryString(100 >> 2), 100 >> 2);
		
		// 왼쪽으로 시프트는 곱하기 효과가 있다.
		System.out.printf("%32s %d \n", Integer.toBinaryString(200), 200);
		System.out.printf("%32s %d \n", Integer.toBinaryString(200 << 1), 200 << 1);
		System.out.printf("%32s %d \n", Integer.toBinaryString(200 << 2), 200 << 2);
		
		System.out.printf("%32s %d \n", Integer.toBinaryString(-100), -100);
		System.out.printf("%32s %d \n", Integer.toBinaryString(-100 >> 1), -100 >> 1);
		System.out.printf("%32s %d \n", Integer.toBinaryString(-100 >>> 1), -100 >>> 1);
	
		// 관계 연산자
		System.out.println("100 > 10 : " + (100 > 10));
		System.out.println("100 < 10 : " + (100 < 10));
		System.out.println("100 >= 10 : " + (100 >= 10));
		System.out.println("100 <= 10 : " + (100 <= 10));
		System.out.println("100 == 10 : " + (100 == 10));
		System.out.println("100 != 10 : " + (100 != 10));
		
		// 비트 연산자 &, |, ^
		System.out.println();
		System.out.printf("%32s %d \n", Integer.toBinaryString(100), 100);
		System.out.printf("%32s %d \n", Integer.toBinaryString(200), 200);
		System.out.printf("%32s %d \n", Integer.toBinaryString(100 & 200), 100 & 200);
		System.out.printf("%32s %d \n", Integer.toBinaryString(100 | 200), 100 | 200);
		System.out.printf("%32s %d \n", Integer.toBinaryString(100 ^ 200), 100 ^ 200);
	
		// 논리 연산자 &&, &, ||, |
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println(2 > 1 && 3 > 2);
		System.out.println(2 > 1 && 3 < 1);
		System.out.println(2 < 1 && 3 > 2);
		System.out.println(2 < 1 && 3 < 2);
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		int k1 = 100;
		int k2 = 200;
		
		System.out.println(++k1 > 100 && ++k2 > 200); // 앞쪽이 true라서 뒤 연산을 하게 된다.
		System.out.println(k1 + " " + k2);
		
		k1 = 100;
		k2 = 200;
		// && 는 첫 번째가 true가 아닐 경우, 뒷 조건을 볼 필요가 없어서 연산이 수행되지 않는다. 
		System.out.println(++k1 < 100 && ++k2 > 200);
		System.out.println(k1 + " " + k2);
		
		k1 = 100;
		k2 = 200;
		// &가 하나일 경우에는, 앞 조건이 거짓이어도, 뒷 조건을 수행한다.
		System.out.println(++k1 < 100 & ++k2 > 200);
		System.out.println(k1 + " " + k2);
		
		k1 = 100;
		k2 = 200;
		// ||는 앞 조건이 참이라서, 뒷 조건을 수행하지 않는다.
		System.out.println(++k1 > 100 || ++k2 > 200);
		System.out.println(k1 + " " + k2);
	
		k1 = 100;
		k2 = 200;
		// | 연산자 하나일 경우, 뒷 조건까지 수행한다. 
		System.out.println(++k1 > 100 | ++k2 > 200);
		System.out.println(k1 + " " + k2);
		
		// 삼항 연산자.
		int k3 = 10 > 20 ? 100 : 200;
		System.out.println(k3); //200
		
		// 배정 대입 연산자
		k1 = 100;
		k2 = 100;
		System.out.println((k1 += 2) + " " + (k2 = k2 + 2)); // 102, 102
		System.out.println((k1 /= 2) + " " + (k2 = k2 / 2)); // 51 51
		
		// 후위형 증감 연산자
		// 전위형 ++a, --a 
		// 후위형 a++, a--
		k1 = 100;
		k2 = ++k1;
		System.out.println(k1 + " " + k2);
		
		k1 = 100;
		k2 = k1++;
		System.out.println(k1 + " " + k2); // 101 100
	}
}


// 특정 숫자 값을 casting해서 강제로 집어넣는 일은 하지 말자!