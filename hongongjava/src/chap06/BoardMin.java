package chap06;

public class BoardMin {
	public static void main(String[] args) {
//		Board board5 = new Board();
//		System.out.println(board5.title);
//		System.out.println(board5.content);
//		System.out.println(board5.writer);
//		System.out.println(board5.date);
//		System.out.println(board5.hitcount);
//		
//		Board board1 = new Board("제목","내용");
//		System.out.println(board1.title);
//		System.out.println(board1.content);
//		Board board2 = new Board("제목","내용","저자");
//		System.out.println(board2.title);
//		System.out.println(board2.content);
//		System.out.println(board2.writer);
//		Board board3 = new Board("제목","내용","저자","현재 컴퓨터 날짜");
//		System.out.println(board3.title);
//		System.out.println(board3.content);
//		System.out.println(board3.writer);
//		System.out.println(board3.date);
//		Board board4 = new Board("제목","내용","저자","현재 컴퓨터 날짜",777);
//		System.out.println(board4.title);
//		System.out.println(board4.content);
//		System.out.println(board4.writer);
//		System.out.println(board4.date);
//		System.out.println(board4.hitcount);
		
		Board board5 = new Board();
		
		Board board1 = new Board("제목","내용");
		Board board2 = new Board("제목","내용","저자");
		Board board3 = new Board("제목","내용","저자","2024-09-27");
		Board board4 = new Board("제목","내용","저자","2024-09-27",777);
		
		System.out.printf("%s : %s : %s : %s : %d\n",board1.title,board1.content,board1.writer,board1.date,board1.hitcount);
		System.out.printf("%s : %s : %s : %s : %d\n",board2.title,board2.content,board2.writer,board2.date,board2.hitcount);
		System.out.printf("%s : %s : %s : %s : %d\n",board3.title,board3.content,board3.writer,board3.date,board3.hitcount);
		System.out.printf("%s : %s : %s : %s : %d\n",board4.title,board4.content,board4.writer,board4.date,board4.hitcount);
		System.out.printf("%s : %s : %s : %s : %d\n",board5.title,board5.content,board5.writer,board5.date,board5.hitcount);
		
	}
}
