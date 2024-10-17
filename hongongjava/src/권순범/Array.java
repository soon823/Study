package 권순범;

public class Array {

	public static void main(String[] args) {
		// 2024.09.26과제
		// 1.배열에 저장 된 값들의 합,최대값,최소값 구하기

		int[] array = new int[10];
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		System.out.print("배열 값 ");
		for (int i = 0; i < array.length; i++) {
			int random = (int) (Math.random() * 100) + 1;
			array[i] = random;
			sum += array[i];
			System.out.print(array[i] + " ");
			if (max < i) {
				max = i;
			}
			if (min > i) {
				min = i;
			}
		}
		System.out.printf("\n합계 %d 최대값 %d 최소값 %d\n", sum, max, min);

		// 2.2차원 배열 출력

		int[][] scor = { { 1, 2, 3 }, { 1, 2 }, { 1 }, { 1, 2, 3 } };
		for (int i = 0; i < scor.length; i++) {
			for (int j = 0; j < scor[i].length; j++) {
				System.out.print(scor[i][j] + " ");
			}
			System.out.println();
		}

		// 3.현재 관객의 수 출력

		int[][] cha = new int[3][10];
		int count = 0;
		for (int i = 0; i < cha.length; i++) {
			for (int j = 0; j < cha[i].length; j++) {
				int pers = (int) (Math.random() * 2);
				cha[i][j] = pers;
				if (pers == 1) {
					count++;
				}
				System.out.print(cha[i][j] + " ");
			}
			System.out.println();
		}
		System.out.printf("현재 관객 수는 %d명\n", count);

		// 4.학생 별 평균 계산하기
		
		int[][] susu = new int [3][5];
		int[] avg = new int[3];
		for(int i = 0; i < susu.length; i++) {
			int sum1 = 0;
			for(int j = 0; j < susu[i].length; j++) {
				int ran = (int)(Math.random() * 51) + 50;
				susu[i][j] = ran;
				System.out.print(susu[i][j] + " ");
				sum1 += susu[i][j];
			}
		    avg[i] = sum1 / 5;
			System.out.println();
		}
		for(int i = 0; i < avg.length; i++) {
			System.out.printf("%d 번 학생 평균 : %d \n", i+1 , avg[i]);
		}

		// 5.카드를 랜덤하게 선택하여 화면에 출력

//		String[] shape = {"Clubs","Diamonds","Hearts","Spades"};
//		String[] nums = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
//		for(int i=0; i<shape.length; i++) {
//			for(int j=0; j<nums.length; j++) {
//				int sh = (int)(Math.random()*4);
//				int n = (int)(Math.random()*13);			
//				System.out.printf("%s의%s\n",shape[sh],nums[n]);
//			}
//		}

		String[] shape = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] nums = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		for (int i = 0; i < 5; i++) {
			int sh = (int) (Math.random() * 4);
			int n = (int) (Math.random() * 13);
			System.out.printf("%s의%s\n", shape[sh], nums[n]);
		}

		// 6.2차원 배열 만들기

		int[][] array1 = new int[3][5];
		int count1 = 0;
		
		
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				if (count1 < 5) {
					int array2 = (int) (Math.random() * 2);
					array1[i][j] = array2;
					if (array2 == 1) {
						count1++;
					}
				}System.out.print(array1[i][j] + " ");
				
			}System.out.println();
			
		}
		
		
		
		
	}// end main

}
