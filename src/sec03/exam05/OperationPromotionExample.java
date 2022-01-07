package sec03.exam05;

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		int intValue3 = byteValue1 + byteValue2;
		//bytevalue1 = int타입으로 변환돼서 int타입에 저장해야함
		
		System.out.println(intValue3);
		
		char charvalue1 = 'A';
		char charvalue2 = 1;
		
		int intValue2 = charvalue1 + charvalue2;
		//char도 int로 선변환
		System.out.println((char)intValue2);
		//문자로 나타내고싶을시 char로 강제변환. 
		
		int intValue5 = 10;
		int intValue4 = intValue5 / 4;
		
		System.out.println(intValue4);
		//정수라 소숫점 버렷음
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double result = (double) x / y;
		System.out.println(result);
		
	}

}
