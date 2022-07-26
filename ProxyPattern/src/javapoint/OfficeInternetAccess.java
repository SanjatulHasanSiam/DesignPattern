package javapoint;

public interface OfficeInternetAccess {
public void grantInternetAccess();
}
class ProxyInternetAccess implements OfficeInternetAccess{
	private String employeeName;
	private RealInternetAccess realaccess;
	
	public ProxyInternetAccess(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public void grantInternetAccess() {
		if(getRole(employeeName)>5) {
			realaccess=new RealInternetAccess(employeeName);
			realaccess.grantInternetAccess();
		}
		else {
			System.out.println("You are not permitted "+employeeName);
		}
		
	}
	public int getRole(String employeeName) {
		return 9;
	}
}
class RealInternetAccess implements OfficeInternetAccess{
private String employeeName;

	public RealInternetAccess(String employeeName) {
	this.employeeName = employeeName;
}

	@Override
	public void grantInternetAccess() {
		System.out.println("Access granted for employee: "+employeeName);
	}
	
}