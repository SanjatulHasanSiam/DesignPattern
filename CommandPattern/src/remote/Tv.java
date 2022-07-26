package remote;

public class Tv {
	public void on() {
		System.out.println("Tv is on");
	}
	public void off() {
		System.out.println("Tv is Off");
	}

	public void setChannel(int defaultChannel) {
		System.out.println("Tv is to channel: "+defaultChannel);
	}
	public void setValume(int volume) {
		System.out.println("Tv is to valume: "+volume);
	}
}
