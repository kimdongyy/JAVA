package sec03.exam05;

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		int intValue3 = byteValue1 + byteValue2;
		//bytevalue1 = intŸ������ ��ȯ�ż� intŸ�Կ� �����ؾ���
		
		System.out.println(intValue3);
		
		char charvalue1 = 'A';
		char charvalue2 = 1;
		
		int intValue2 = charvalue1 + charvalue2;
		//char�� int�� ����ȯ
		System.out.println((char)intValue2);
		//���ڷ� ��Ÿ��������� char�� ������ȯ. 
		
		int intValue5 = 10;
		int intValue4 = intValue5 / 4;
		
		System.out.println(intValue4);
		//������ �Ҽ��� ������
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double result = (double) x / y;
		System.out.println(result);
		
	}

}
