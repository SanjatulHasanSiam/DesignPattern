package geekific;

public class mainG {

	public static void main(String[] args) {
		InternetG internet=new ProxyInternetG();
		internet.connectTo("Google.com");
		internet.connectTo("Youtube.com");

	}

}
