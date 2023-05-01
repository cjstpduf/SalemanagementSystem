package git_SalemanagementSystem;

public class PlusMenu extends Menu{
	double burgerCost;
	double juiceCost;
	Cost c = new Cost();
	
	public void setHamburger(String hamburger) {
		c.setBurgerCost(hamburger);
		this.hamburger = hamburger;
	}
	
	public void setJuice(String juice) {
		c.setJuiceCost(juice);
		this.juice = juice;
	}
	public void printInfo() {
		System.out.println("name: " + name + " phonenumber: " + phonenumber + " hamburger: " + hamburger + " juice: " + juice);
		System.out.println("burgerCost is : $" + c.getBurgerCost() + " juiceCost is: $" + c.getJuiceCost());

	}
}
