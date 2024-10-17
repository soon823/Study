package chap01;

import java.util.Scanner;

public class Scanner118 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		
		//문자열
		
		System.out.print("문자열 입력 : ");
		str = sc.nextLine();
		System.out.println("입력 받은 문자열 : " + str);
		if(str == "q") {
			System.out.println("q입력");
		}else {
			System.out.println("같지 않음");
		}
		
		if(str.equals("q")) {
			System.out.println("q입력완료");
		}else {
			System.out.println("q와 같지 않음");
		}
		
		//숫자
		
		System.out.print("숫자 입력 : ");
		int valint = sc.nextInt();
		System.out.println("입력 받은 숫자 : " + valint);
		str = sc.nextLine();
		
		System.out.print("숫자 입력 : ");
		valint = Integer.parseInt(sc.nextLine());
		System.out.println("입력 받은 숫자 + 100 : " + (valint + 100));
		
		sc.close();

	}

}
