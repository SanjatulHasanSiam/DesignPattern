package javapoint;

public class ProxyPatternClient {

	public static void main(String[] args) {
		ProxyInternetAccess client=new ProxyInternetAccess("Sanjatul");
		client.grantInternetAccess();

	}

}
