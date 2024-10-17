package 도서관리;

public class Book {
	//필드 외부 접근 막기 - getter/setter
	private String title;
	private String writer;
	private String bnum;
	private int price;
	
	//생성자
	Book(){}
	Book (String title,String writer,String bnum,int price){
		this.title = title;
		this.writer = writer;
		this.bnum = bnum;
		this.price = price;
	}
	
	//메소드
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getBum() {
		return bnum;
	}
	public void setBum(String bum) {
		this.bnum = bum;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", writer=" + writer + ", bnum=" + bnum + ", price=" + price + "]";
	}
	
}
