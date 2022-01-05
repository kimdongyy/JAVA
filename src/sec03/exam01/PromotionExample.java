package sec03.exam01;

public class PromotionExample {

	public static void main(String[] args) {

		byte byteValue = 10;
		int intValue = byteValue;
		
		System.out.println("intValue: " + intValue);
		
		char charValue = '°¡';
		intValue = charValue;
		
		System.out.println("intValue: " + intValue);
		
		intValue = 10;
		long longValue = intValue;
		
		System.out.println(longValue);
		
		longValue = 30;
		float floatValue = longValue;
		
		System.out.println("floatValue =" + floatValue);
		
		floatValue = 100.0f;
		double doubleValue = floatValue;
		
		System.out.println("doubleValue" + doubleValue);
		}

}
