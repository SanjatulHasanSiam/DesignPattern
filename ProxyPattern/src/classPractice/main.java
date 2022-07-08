package classPractice;

public class main {

	public static void main(String[] args) {
		Internet internet=new ProxyInternet();
		internet.connect("youtube.com");
		internet.connect("Google.com");

	}

}
