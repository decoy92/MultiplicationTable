import java.util.Scanner;

public class MultiplicationTableApp {

	public static void main(String[] args) {
//		// 2단 (한줄 복사 단축키 : 컨트롤+알트+위/아래)
//		System.out.println("---- 2단 ----");
//		System.out.println(2 * 1);
//		System.out.println(2 * 2);
//		System.out.println(2 * 3);
//		System.out.println(2 * 4);
//		System.out.println(2 * 5);
//		System.out.println(2 * 6);
//		System.out.println(2 * 7);
//		System.out.println(2 * 8);
//		System.out.println(2 * 9);
//		
//		// 3단 (줄 위치 변경 : 알트+위/아래)
//		System.out.println("---- 3단 ----");
//		System.out.println(3 * 1);
//		System.out.println(3 * 2);
//		System.out.println(3 * 3);
//		System.out.println(3 * 4);
//		System.out.println(3 * 5);
//		System.out.println(3 * 6);
//		System.out.println(3 * 7);
//		System.out.println(3 * 8);
//		System.out.println(3 * 9);
//		
//		// 4단
//		System.out.println("---- 4단 ----");
//		int result = 4 * 1;
//		System.out.println(result);
//		result = 4 * 2;
//		System.out.println(result);
//		result = 4 * 3;
//		System.out.println(result);
//		result = 4 * 4;
//		System.out.println(result);
//		result = 4 * 5;
//		System.out.println(result);
//		result = 4 * 6;
//		System.out.println(result);
//		result = 4 * 7;
//		System.out.println(result);
//		result = 4 * 8;
//		System.out.println(result);
//		result = 4 * 9;
//		System.out.println(result);
		
//		// 5단은 값 입력 및 변수 활용
//		System.out.println("구구단 중 출력할 단은? : ");
//		Scanner scanner = new Scanner(System.in); // in을 통해서 입력값을 받을 수 있음
//		int number = scanner.nextInt(); // number : 변수
//		System.out.println(number * 1);
//		System.out.println(number * 2);
//		System.out.println(number * 3);
//		System.out.println(number * 4);
//		System.out.println(number * 5);
//		System.out.println(number * 6);
//		System.out.println(number * 7);
//		System.out.println(number * 8);
//		System.out.println(number * 9);
		
//		// 6단 (while문 활용)
//		int i = 1; // 1~9. 시작점=1
//		while(i < 10) { // 어디까지 반복을 할 것인가. (1~9 = 10미만)
//			System.out.println(6 * i); // 6단
//			i = i + 1; // 1씩 증가
//						
//		}
//		
//		// 7단 (for문 활용)
//		for(int j = 1; j < 10; j++) {
//			System.out.println(7 * j);
			
			
		//8, 9단 (값 입력 및 조건문 활용)
		System.out.println("구구단 중 출력할 단은? : ");
		Scanner scanner = new Scanner(System.in); // in을 통해서 입력값을 받을 수 있음
		int number = scanner.nextInt(); // number : 변수
		System.out.println("사용자가 입력한 값 : " + number);
		
		if (number < 2 || number > 9) { // 논리연산자 || 를 써서 더 간단히 표현.
			System.out.println("2 이상, 9 이하의 값만 입력할 수 있습니다.");
//		} else if (number > 9) {
//			System.out.println("2 이상, 9 이하의 값만 입력할 수 있습니다.");
		} else {
			for(int i = 1; i < 10; i++) {
				System.out.println(number * i);
		}
			
	}
			
 }
		
}