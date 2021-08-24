
public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1 = 1 + 2 * 3;
		System.out.println("1 + 2 * 3 : " + a1);
	
		int a2 = (1 + 2) * 3;
		System.out.println("(1 + 2) * 3 : " + a2);

		// ���� ������ ����
		boolean bool1 = true;
		System.out.println("boo1 : " + bool1);
		System.out.println("!bool1 : " + !bool1);
		
		int i1 = 100;
		System.out.printf(" i1 : %32s\n", Integer.toBinaryString(i1));
		System.out.printf("~i1 : %32s\n", Integer.toBinaryString(~i1));
		
		System.out.println(~i1); // -101
		System.out.println(~i1 + 1); // -100, ��ǻ���� ���� ǥ��, 2�� ������ ���
		
		// ��ȣ ����
		System.out.println(+i1); 
		System.out.println(-i1);
	
		// ���� ����
		System.out.println("++i1 : " + ++i1);
		System.out.println(i1);
		System.out.println("--i1 : " + --i1);
		System.out.println(i1);
		
		// cast
		i1 = 214712458;
		
		short s1 = (short)i1;
		long l1 = i1; 
		System.out.println(s1); // ū ���� ���� �Ϳ� �־ ���� �߻�, ����ȯ => ������ �� ���. 
		System.out.println(l1); // �������� ���
		
		// ������2
		System.out.println("100 + 200 = " + (100 + 200));
		System.out.println("100 - 200 = " + (100 - 200));
		System.out.println("100 * 200 = " + (100 * 200));
		System.out.println("100 / 200 = " + (100 / 200));
		System.out.println("100 % 200 = " + (100 % 200));
		
		// ���ڿ��� �������� ���� ��� �������� ���ڿ��� �ٲ��.
		System.out.println("100" + 200 + 300); // 200, 300�� ���ڿ��� �ٲ��.
		System.out.println(100 + 200 + "300"); // 300300
		
		// ����Ʈ ������
		System.out.printf("%32s %d \n",  Integer.toBinaryString(100), 100);
		// ���������� ����Ʈ�� �� �� �ϸ�, 2�� ���� ȿ���� �ִ�.
		System.out.printf("%32s %d \n", Integer.toBinaryString(100 >> 1), 100 >> 1);
		// ���������� �� �� ����Ʈ�� �ϸ�, 2�� ����, �� 4�� ���� ȿ���� �ִ�.
		System.out.printf("%32s %d \n", Integer.toBinaryString(100 >> 2), 100 >> 2);
		
		// �������� ����Ʈ�� ���ϱ� ȿ���� �ִ�.
		System.out.printf("%32s %d \n", Integer.toBinaryString(200), 200);
		System.out.printf("%32s %d \n", Integer.toBinaryString(200 << 1), 200 << 1);
		System.out.printf("%32s %d \n", Integer.toBinaryString(200 << 2), 200 << 2);
		
		System.out.printf("%32s %d \n", Integer.toBinaryString(-100), -100);
		System.out.printf("%32s %d \n", Integer.toBinaryString(-100 >> 1), -100 >> 1);
		System.out.printf("%32s %d \n", Integer.toBinaryString(-100 >>> 1), -100 >>> 1);
	
		// ���� ������
		System.out.println("100 > 10 : " + (100 > 10));
		System.out.println("100 < 10 : " + (100 < 10));
		System.out.println("100 >= 10 : " + (100 >= 10));
		System.out.println("100 <= 10 : " + (100 <= 10));
		System.out.println("100 == 10 : " + (100 == 10));
		System.out.println("100 != 10 : " + (100 != 10));
		
		// ��Ʈ ������ &, |, ^
		System.out.println();
		System.out.printf("%32s %d \n", Integer.toBinaryString(100), 100);
		System.out.printf("%32s %d \n", Integer.toBinaryString(200), 200);
		System.out.printf("%32s %d \n", Integer.toBinaryString(100 & 200), 100 & 200);
		System.out.printf("%32s %d \n", Integer.toBinaryString(100 | 200), 100 | 200);
		System.out.printf("%32s %d \n", Integer.toBinaryString(100 ^ 200), 100 ^ 200);
	
		// �� ������ &&, &, ||, |
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
		
		System.out.println(++k1 > 100 && ++k2 > 200); // ������ true�� �� ������ �ϰ� �ȴ�.
		System.out.println(k1 + " " + k2);
		
		k1 = 100;
		k2 = 200;
		// && �� ù ��°�� true�� �ƴ� ���, �� ������ �� �ʿ䰡 ��� ������ ������� �ʴ´�. 
		System.out.println(++k1 < 100 && ++k2 > 200);
		System.out.println(k1 + " " + k2);
		
		k1 = 100;
		k2 = 200;
		// &�� �ϳ��� ��쿡��, �� ������ �����̾, �� ������ �����Ѵ�.
		System.out.println(++k1 < 100 & ++k2 > 200);
		System.out.println(k1 + " " + k2);
		
		k1 = 100;
		k2 = 200;
		// ||�� �� ������ ���̶�, �� ������ �������� �ʴ´�.
		System.out.println(++k1 > 100 || ++k2 > 200);
		System.out.println(k1 + " " + k2);
	
		k1 = 100;
		k2 = 200;
		// | ������ �ϳ��� ���, �� ���Ǳ��� �����Ѵ�. 
		System.out.println(++k1 > 100 | ++k2 > 200);
		System.out.println(k1 + " " + k2);
		
		// ���� ������.
		int k3 = 10 > 20 ? 100 : 200;
		System.out.println(k3); //200
		
		// ���� ���� ������
		k1 = 100;
		k2 = 100;
		System.out.println((k1 += 2) + " " + (k2 = k2 + 2)); // 102, 102
		System.out.println((k1 /= 2) + " " + (k2 = k2 / 2)); // 51 51
		
		// ������ ���� ������
		// ������ ++a, --a 
		// ������ a++, a--
		k1 = 100;
		k2 = ++k1;
		System.out.println(k1 + " " + k2);
		
		k1 = 100;
		k2 = k1++;
		System.out.println(k1 + " " + k2); // 101 100
	}
}


// Ư�� ���� ���� casting�ؼ� ������ ����ִ� ���� ���� ����!