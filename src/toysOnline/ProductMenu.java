package toysOnline;

public class ProductMenu {
	int numberOfItems = 0;
	LatestProducts[] productMenu;
	
	public ProductMenu() {
		
		productMenu = new LatestProducts[6];
		
		productMenu[0] = new ToyCar();
		productMenu[1] = new ToyBus();
		productMenu[2] = new ToyJeep();
		productMenu[3] = new ToyTeddy();
		productMenu[4] = new ToyBarbie();
	}
	
	public Iterator createIterator() {
		return new ProductMenuIterator(productMenu);
	}

}
