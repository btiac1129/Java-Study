
public class ClassTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ü ����
		Class1 c1 = new Class1();
		
		// ����� ����
		c1.va = 100;
		System.out.println(c1.va);
		
		c1.setVa(1000);
		System.out.println(c1.getVa());
		
		Class1 c2 = new Class1();
		c2.va = 200;
		System.out.println(c2.va);
		
		c2.setVa(2000);
		System.out.println(c2.getVa());
	}

}
