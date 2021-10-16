package toysOnline;

import java.util.Scanner;

public class MainMenuStatus implements State {

	@Override
	public void posStatus(Context context) {
		// TODO Auto-generated method stub
		Scanner usrInpt = new Scanner(System.in);
		
		System.out.print("--------TOYS MENU OPTIONS-----\n" + 
		"1) Menu Selections \n" + 
		
		"2) View All Menus\n"+
		"3) Checkout\n" +
		"4) Log Out\n");
		
		System.out.print("");

		int ToytndrInpt = usrInpt.nextInt();
		
		if(ToytndrInpt ==1) {
			ViewToyMenuState viewToys = new ViewToyMenuState();
			viewToys.posStatus(context);
		}
		
		else {
			System.exit(0);
		}
	context.setState(this);
	}

		
	}


