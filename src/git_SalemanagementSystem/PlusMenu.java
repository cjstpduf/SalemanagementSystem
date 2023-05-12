package git_SalemanagementSystem;

import java.util.ArrayList;

public class PlusMenu extends Menu{
	public String name;
	public int phonenumber;
	public String hamburger;
	public String juice;
	double burgerCost;
	double juiceCost;
	Cost c = new Cost();
	Student std = new Student();
	public void setName(String name) {
	      this.name = name;
	}
	   
	public String getName() {
	    return this.name;
	}
	   
	public void setPhoneNumber(int phonenumber) {
	    this.phonenumber = phonenumber;
	}
	    
	public int getPhoneNumber() {
	    return this.phonenumber;
	}

		
	public void setHamburger(String hamburger) {
		c.setBurgerCost(hamburger);
		this.hamburger = hamburger;
	}
	
	public void setJuice(String juice) {
		c.setJuiceCost(juice);
		this.juice = juice;
	}
	@Override
	public String getHamburger() {
		return this.hamburger;
	}

	public String getJuice() {
		return this.juice;
	}
	public void printInfo() {
		System.out.println("name: " + name + " phonenumber: " + phonenumber + " hamburger: " + hamburger + " juice: " + juice);
		System.out.println("burgerCost is : $" + c.getBurgerCost() + " juiceCost  is: $" + c.getJuiceCost());

	}

}
