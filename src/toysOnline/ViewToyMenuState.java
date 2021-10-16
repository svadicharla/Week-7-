package toysOnline;

public class ViewToyMenuState implements State{
	public void posStatus(Context context) {
		MenuFactory menuFactory = new MenuFactory();
		menuFactory.chooseMenu();
	}

}
