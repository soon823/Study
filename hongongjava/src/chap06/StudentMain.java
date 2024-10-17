package chap06;

public class StudentMain {

	public static void main(String[] args) {
		// 객체 생성
		
		Student st1 = new Student("240901","강떙떙");
		System.out.println(st1.stNo);
		System.out.println(st1.name);
		st1.study();

		Student st2 = new Student("240902", "김땡땡");
		System.out.println(st2.stNo);
		System.out.println(st2.name);
		st2.study();
		
	
	
		//학생 이름 국어 영어 수학 총점 평균 등급 출력
		//학생은 5명
		Student[] st3 = {
				new Student("김떙땡",100,80,30),
				new Student("이떙땡",80,90,60),
				new Student("박떙땡",80,90,70),
				new Student("서떙땡",90,80,80),
				new Student("임떙땡",50,90,90),				
		};
		
		for(Student student : st3) {
			System.out.printf("%s : %4d : %4d : %4d : %4d : %6.2f : %s\n",student.stName,student.ko,student.en,student.sansu,student.sum(),student.avg(),student.grade());
		}
	
		

		
	}
}
