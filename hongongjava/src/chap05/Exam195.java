package chap05;

public class Exam195 {

	public static void main(String[] args) {
		// 참조타입의 번지 비교(==) , 데이터(문자열) 비교(.equals())
		
		String strVar1 = "신민철";
		String strVar2 = "신민철";

		if(strVar1 == strVar2) {
			System.out.println("strVar1와strVar2는 참조가 같다");
		}else {
			System.out.println("strVar1와strVar2는 참조가 다르다");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1와strVar2는 문자열이 같다");
		}else {
			System.out.println("strVar1와strVar2는 문자열이 다르다");
		}
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar1와strVar2는 참조가 같다");
		}else {
			System.out.println("strVar1와strVar2는 참조가 다르다");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar1와strVar2는 문자열이 같다");
		}else {
			System.out.println("strVar1와strVar2는 문자열이 다르다");
		}
		
	}//end main

}//end class
