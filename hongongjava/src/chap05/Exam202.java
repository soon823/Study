package chap05;

import java.util.Arrays;

public class Exam202 {

	public static void main(String[] args) {
		
		//String args1 = args[0];			main에 있는 String 배열을 가져 올려고 하는데 영역을 벗어 났다는 오류가 뜬다
		//System.out.println(args1);		Run ->Run Configurations -> Arguments 들어가서 배열 값을 만들어 주면 가져올수 있다
		
		// 배열을 생성
		// 배열을 이용하는 방법
		
		int[] scores = {83, 90, 87};
		
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) { 	//i<3 대신 i<scores.length를 쓰는 나중에 배열을 추가 했을때를 위해서
			sum += scores[i];
		}
		
		System.out.println("총합 : " + sum);
		double avg = (double) sum / scores.length;
		System.out.printf("평균 : %.2f\n",avg);
		
		//배열에 1에서 100까지의 임의의 수 10개를 저장
		//배열의 합과 평균(소수 첫째자리까지 나타냄)
		//최대값, 최소값을 구하세요
		
		//배열생성
		int[] scor = new int[10];
		
		System.out.print("배열의 숫자 : ");
		for(int i=0; i<scor.length; i++) {
			int random = (int)(Math.random()*100)+1;
			scor[i] = random;
			System.out.print(scor[i]+" ");
		}
		System.out.println();
		
		System.out.println(scor);					//배열의 값을 가져 오는게 아니라 주소를 가지고 오게 된다
		System.out.println(Arrays.toString(scor));	//배열의 주소를 통해 안에 있는 값을 가져올수 있게한다
		
		//배열을 이용해서 합,평균,최대,최소값 구하기	
		int[] score = new int[10];
		int sum1 = 0;
		double avg1 = 0;
		int min = 100;
		int max = 0;
		
		System.out.print("배열의 숫자 : ");
		for(int i=0; i<score.length; i++) {
			score[i] = (int)(Math.random()*100)+1;			
			System.out.print(score[i]+" ");
			sum1 += score[i];
//			if(max < score[i]) {
//				max = score[i];
//			}
//			if(min > score[i]) {
//				min = score[i];
//			}
			if(max < score[i]) max = score[i];
			if(min > score[i]) min = score[i];
		}
		avg1 = (double)sum1 / score.length;
		
		System.out.println();
		System.out.println("배열의 합 : " + sum1);
		System.out.printf("배열의 평균 : %.1f\n",avg1);
		System.out.println("배열의 최소값 : " + min);
		System.out.println("배열의 최대값 : " + max);
		
		

	}

}
