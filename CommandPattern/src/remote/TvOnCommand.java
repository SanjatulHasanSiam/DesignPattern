package remote;

public class TvOnCommand implements Command{
	Tv tv;
	public TvOnCommand(Tv tv) {
		this.tv = tv;
	}
	@Override
	public void execute() {
		tv.on();
		tv.setChannel(5);
		tv.setValume(11);	
	}
}