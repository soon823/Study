package chap10;

public class ThrowsMain {

	public static void main(String[] args) throws ClassNotFoundException {
		// 예외 떠넘기기
		try {
			
			findClass();
		} catch (Exception e) {
			System.out.println("class를 찾지못함");
		}

	}

	private static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
		
	}

}
