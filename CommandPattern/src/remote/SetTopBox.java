package remote;

public class SetTopBox {
public void on() {
	System.out.println("SetTopBox is on");
}
public void off() {
	System.out.println("SetTopBox is Off");
}

public void setChannel(int defaultChannel) {
	System.out.println("SetTopBox is to channel: "+defaultChannel);
}
public void setValume(int volume) {
	System.out.println("SetTopBox is to valume: "+volume);
}
}
