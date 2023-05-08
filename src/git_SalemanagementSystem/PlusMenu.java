package git_SalemanagementSystem;

import java.util.ArrayList;

public class PlusMenu extends Menu{
	double burgerCost;
	double juiceCost;
	Cost c = new Cost();
	Student std = new Student();
	
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
		System.out.println("burgerCost is : $" + c.getBurgerCost() + " juiceCost  is: $" + c.getJuiceCost());

	}
}
