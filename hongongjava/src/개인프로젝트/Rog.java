package 개인프로젝트;

public class Rog {
	
	private String mid;
	private String mpw;
	private String mname;
	private String tell;
	private String responsibility;
	
	Rog(){}
	Rog (String mid, String mpw, String mname, String tell){
		this.mid = mid;
		this.mpw = mpw;
		this.mname = mname;
		this.tell = tell;
	}
	
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getMpw() {
		return mpw;
	}
	public void setMpw(String mpw) {
		this.mpw = mpw;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getTell() {
		return tell;
	}
	public void setTell(String tell) {
		this.tell = tell;
	}
	public String getResponsibility() {
		return responsibility;
	}
	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}
	
	
	@Override
	public String toString() {
		return " [아이디=" + mid + ", 비밀번호=" + mpw + ", 이름=" + mname + ", 전화번호=" + tell + ", 권한="
				+ responsibility + "]";
	}
	
	

}//end class
