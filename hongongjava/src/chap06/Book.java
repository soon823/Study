package chap06;

public class Book {
	//필드
	private String book;
	private int bookNum;
	private int bookSel;
	//생성자
	Book (String book, int bookNum, int bookSel){
		this.book = book;
		this.bookNum = bookNum;
		this.bookSel = bookSel;
	}
	//메소드
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public int getBookNum() {
		return bookNum;
	}
	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}
	public int getBookSel() {
		return bookSel;
	}
	public void setBookSel(int bookSel) {
		this.bookSel = bookSel;
	}
	
	
	
	
}
