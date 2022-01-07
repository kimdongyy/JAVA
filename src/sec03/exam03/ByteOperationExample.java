package sec03.exam03;

public class ByteOperationExample {

	public static void main(String[] args) {
		byte result1 = 10 + 20;
		//int연산자도 byte에 저장 가능.
		//변수 사용시 
		
		byte x = 10;
		byte y = 20;
		int result2 = x + y;
		
		//byte는 int로 변환. byte시 에러
		//jvm이 int 미만은 전부 변환. 컴파일러 연산시 좌측 변수로 연산
	}

}
