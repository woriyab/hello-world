import java.time.LocalDateTime;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello Java World!");
		
		int second = LocalDateTime.now().getSecond();
		if(second % 2 == 0 ) {
			System.out.println(second + "짝수입니다.");
		
		}else {
			System.out.println(second + "홀수입니다.");
		}
	}
}
