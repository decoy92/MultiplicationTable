
public class MultiplicationTableArrayApp {

	public static void main(String[] args) {
		int[] result = new int[9]; // ������ 9�� ������ �迭
		for(int i=0; i < result.length; i++) { // ���� ����� result�� ��ƾ� ��
			result[i] = 2 * (i + 1); // ���α׷��� ������ 0,1,2 ������ / i=0���� �����ؼ� +1 = 1���� ����	
		}
		
		for(int i=0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
