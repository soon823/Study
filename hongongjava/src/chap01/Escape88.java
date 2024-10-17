package chap01;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Escape88 {

	public static void main(String[] args) {
		System.out.println("Hellow");
		System.out.print("번호\t이름\t직업");
		System.out.print("행 단위 출력\n");
		System.out.print("행 단위 출력\n");
		System.out.print("행 단위 출력\n");
		System.out.println("우리는 \"개발자\" 입니다");
		System.out.println("봄\\여름\\가을\\겨울");
		
		//p91
		//예제에 시작합니다 출력 되도록 변경
		boolean stop = true;
		if(!stop) {
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다.");
		}
		
		//p103
		//타입변환
		byte byteValue1 =10;
		byte byteValue2 =20;
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2= 1;
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자=" + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double result = (double)x / y;
		System.out.println(result);
		
		//p106
		//문자열을 숫자로 변환
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		System.out.println("value1:" + (value1 + 100)); //앞에부터 순서대로 정리되어서 문자열로 바뀌므로 ()로 묶어줌
		System.out.println("value2:" + (value2 + 100));
		System.out.println("value3:" + value3);
		//숫자를 문자열로 변환
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		System.out.println("str1:" + (str1 + 100)); //문자열로 바꾼거라 ()로 해도 뒤에붙음
		System.out.println("str2:" + str2 + 100);
		System.out.println("str3:" + str3);
		
		//p109 -5번문제(b를 출력하기)
		char c1 = 'a';
		char c2 = (char)(c1 + 1);
		System.out.println(c2);
		//b의 코드값 출력
		System.out.println((int)c2); 
		//6번문제
		int x1 = 5;
		int y1 = 2;
		int result1 = x1 / y1;
		System.out.println(result1);
		//7번문제
		double result2 = (double)x/y;
		System.out.println(result2);
		//8번문제
		double var1 = 3.5;
		double var2 = 2.7;
		int result3 = (int)(var1 + var2);
		System.out.println(result3);
		//9번문제
		long var3 = 2L;
		float var4 = 1.8f;
		double var5 = 2.5;
		String var6 = "3.9";
		int result4 = (int)(var3+var4+var5)+(int)Double.parseDouble(var6);
		System.out.println(result4);
		
		//p112
		System.out.printf("이름 : %s", "감자바\n");
		System.out.printf("나이 : %d\n", 25);
		double su1 = 3.5;
		double su2 = 2.7;
		double su3 = 3.1419253;
		String str = "홍길동";
		int val = (int)(su1 + su2);
		System.out.printf("값은 : %d 이름은 : %s 소수점 첫째까지%.1f 소수점 3째까지%.3f",val, str, su3, su3);
		
	} //end main
}//end class
