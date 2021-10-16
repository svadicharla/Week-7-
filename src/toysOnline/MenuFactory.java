package toysOnline;

import java.util.Scanner;

public class MenuFactory {
	public void chooseMenu() {
		Scanner usrInpt = new Scanner(System.in);
		
		System.out.println("\n\n-------------SELECT MENU----------------\n\n"+
		"Enter number associated with your menu selection.\n"+
		"1) Latest Products Menu\n"+
		"2) Payment Types Menu\n"+
		"3) Special Offers Menu\n"+
		"4) Home Screen");
		
		
		int menuChoice = usrInpt.nextInt();
		
		
		if(menuChoice ==1) {
			ProductMenu productmenu = new ProductMenu();
			PrintProductMenu prntpmnu = new PrintProductMenu(productmenu);
			
			prntpmnu.printMenu();
		}
		
		
		
		Context context = new Context();
		
		
	}
}



