
public class Print {

	public static void main(String [] args) {
		// println : () 안의 내용을 출력하고 한 줄 내려준다. 
		System.out.println("안녕하세요.");
		System.out.println("반갑습니다!");
		// print : () 안의 내용을 출력하고 한 줄 내려주지 않는다. 
		System.out.print("감사합니다.");
		System.out.print("안녕하세요.");
		// System.out.println 을 사용할 때 () 안에 아무런 내용을 적지 않으면
		// 아무런 내용을 출력하지 않고 밑으로 내려준다. 
		System.out.println();
		System.out.println("테스트");
		
		// 이번에는 숫자를 출력한다. 
		System.out.println(100);
	}
}
