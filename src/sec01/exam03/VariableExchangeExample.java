package sec01.exam03;

public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 35;
		int y = 55;
		System.out.println("x:" + x + "y:" + y );
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("x:" + x + "y:" + y );
	}

}
