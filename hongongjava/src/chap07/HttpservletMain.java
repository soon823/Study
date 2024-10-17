package chap07;

public class HttpservletMain {

	public static void main(String[] args) {
		method(new Loginservllet());
		method(new Filedownloadservlet());

	}
	
	public static void method(Httpservlet servlet) {
		servlet.service();
	}

}
