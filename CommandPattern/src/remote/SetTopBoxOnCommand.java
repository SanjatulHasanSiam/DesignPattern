package remote;

public class SetTopBoxOnCommand implements Command{

	SetTopBox setTopBox;
	
	public SetTopBoxOnCommand(SetTopBox setTopBox) {
		this.setTopBox = setTopBox;
	}

	@Override
	public void execute() {
		setTopBox.on();
		setTopBox.setChannel(5);
		setTopBox.setValume(11);
		
	}

}
