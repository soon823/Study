package chap03;

public class Assign146 {

	public static void main(String[] args) {
		int result = 0;
		result += 10;
		System.out.println(result);
		result -= 5;
		System.out.println(result);
		result *= 3;
		System.out.println(result);
		result /= 5;
		System.out.println(result);
		result %= 3;
		System.out.println(result);
		
		int su1 = 1;
		int su2 = 2;
		System.out.println(su1 & su2);	//2진수로 비교함 1 -> 01 , 2 -> 10 둘이 맞는게 하나도 없어서 0임
		int su3 = 2;
		System.out.println(su3 & su2);	//이진수로 비교해서 AND연산(두자리가 둘다 1이면 1나옴)-10 = 십진수로는 2
		System.out.println(su1 | su2);	//이진수로 비교해서 OR연산(두 자리 중 하나가 1이면 1이나옴)-11 = 십진수로는 3
		System.out.println(su1 ^ su2);	//이진수로 비교해서 XOR연산(두자리가 서로 다르면 1이 나옴)-11 = 십진수로는 3
		
		
	}

}
