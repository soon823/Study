package 권순범;

public class Account {
	//필드
	private int balance;
	private String ano;
	private String owner;
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	//생성자
	Account(String ano, String owner,int balance){
		this.balance = balance;
		this.ano = ano;
		this.owner= owner;
	}
	//메소드
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(balance > MIN_BALANCE && balance < MAX_BALANCE) { this.balance = balance; }		
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
	
}
