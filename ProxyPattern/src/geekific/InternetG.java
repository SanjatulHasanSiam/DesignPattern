package geekific;
import java.util.ArrayList;
import java.util.List;

public interface InternetG {
public void connectTo(String url);
}
class RealInternetG implements InternetG{

	@Override
	public void connectTo(String url) {
		System.out.println("Connecting to.... "+url);
	}
}
class ProxyInternetG implements InternetG{
private static final List<String> bannedList;
private final InternetG internet=new RealInternetG();
static {
	bannedList=new ArrayList<String>();	
	bannedList.add("Youtube.com");
}
	@Override
	public void connectTo(String url) {
		if(bannedList.contains(url)) {
			System.out.println("Access Denied to "+url);
			return;
		}
		internet.connectTo(url);
	
	}
	
}
