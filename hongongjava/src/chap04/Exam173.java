package chap04;

public class Exam173 {

	public static void main(String[] args) {
		// 50에서 100까지 3의 배수 합 구하기
		//3의 배수 출력, 마지막에 3의 배수합 출력
		//3의 배수 개수 출력
		
		int sum = 0;
		int count = 0;
		for(int i = 50; i <=100; i++) {
			if(i % 3 == 0) {
				sum += i;
				count ++;
				System.out.print(i + " ");
			}
		}
		System.out.println("\n3의 배수합 : " + sum + "\n3의 배수의 개수는 : " + count);
		
		//1에서 N까지의 7의 배수합이 300이 넘는 순간 N값 구하기
		//7의 배수의 합이 300이 넘는 순간의 7의 배수 찾기
		//while 문
		
		int sum1 = 0;
		int su = 0;
		while(sum1 <= 300) {
			su ++;
			if(su % 7 == 0) {
				sum1 += su;
				System.out.println("7의 배수합 : " + sum1);
			}
		}System.out.println("7의 배수 : " + su);
		
//		while(true) {
//			su ++;
//			if(su % 7 ==0) {
//				sum1 += su;
//				if(sum1 >= 300) break;
//			}
//		}
//		System.out.println("7의 배수합 : " + sum1);
//		System.out.println("7의 배수 : " + su);
		
		//구구단 : 중첩 for 문
		
		for(int i = 2; i < 10; i++) {
			System.out.println("====" + i + "단====");
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d X %d = %2d\n",i,j,(i*j));
			}
		}
		
		//구구단2
		for(int i = 2; i < 10; i++) {
			System.out.print("  " + i + "단 \t");
		}
		
		for(int i = 1; i < 10; i++) {
			System.out.println();
			for(int j = 2; j < 10; j++) {
				System.out.printf("%dX%d=%2d \t",j,i,(i*j));
			}
		}
		

	}//end main

}//end class
