package remote;

public class User {

	public static void main(String[] args) {
		RemoteControl remoteControl=new RemoteControl();
		SetTopBox setTopBox=new SetTopBox();
		Tv tv=new Tv();
		
		
		remoteControl.setCommand(new SetTopBoxOnCommand(setTopBox));
		remoteControl.pressButton();
		
		remoteControl.setCommand(new SetTopBoxOffCommand(setTopBox));
		remoteControl.pressButton();
		
		
		remoteControl.setCommand(new TvOnCommand(tv));
		remoteControl.pressButton();
		
		remoteControl.setCommand(new TvOffCommand(tv));
		remoteControl.pressButton();
	}

}
