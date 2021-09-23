
public class MultiplicationTableArrayApp {

	public static void main(String[] args) {
		int[] result = new int[9]; // 정수를 9개 가지는 배열
		for(int i=0; i < result.length; i++) { // 곱셈 결과를 result에 담아야 함
			result[i] = 2 * (i + 1); // 프로그래밍 순서는 0,1,2 순서로 / i=0부터 시작해서 +1 = 1부터 시작	
		}
		
		for(int i=0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
