
public class MultiplicationTableMainApp {

	public static void main(String[] args) {
		for(int i=2; i < 10; i++) {
			int[] result = MultiplicationTableMethodApp.calculate(i);
			MultiplicationTableMethodApp.print(result);	
		}
	}								
}
