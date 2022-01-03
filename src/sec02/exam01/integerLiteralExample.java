package sec02.exam01;

public class integerLiteralExample {

	public static void main(String[] args) {
		
		int var1 = 0b110001;
		//작은수부터 2⁰¹²³⁴...
		int var2 = 013;
		//0부터 시작이면 8진수로 인식
	    //작은수부터 *8⁰¹²³⁴
		int var3 = 331;
		int var4 = 0x8b;
		//0x 시작이면 16진수 1~9abcdefg
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
}
}