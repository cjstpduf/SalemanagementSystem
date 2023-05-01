package git_SalemanagementSystem;

public class Cost {
	private double burgerCost = 0;
	private double juiceCost = 0;
	Cost(){
	}
	public void setBurgerCost(String burger) {
		if(burger.equals("bulgogiBurger")) {
			burgerCost = 2.9;
		}
		else if(burger.equals("beefBurger")){
			burgerCost = 2.8;
		}
		else if(burger.equals("cheeseBurger")) {
			burgerCost = 3.0;
		}
		else if(burger.equals("chickenBurger")) {
			burgerCost = 3.1;
		}
	}
	public void setJuiceCost(String juice) {
		if(juice.equals("orangeJuice")) {
			juiceCost = 1.7;
		}
		else if(juice.equals("grapeJuice")) {
			juiceCost = 1.6;
		}
		else if(juice.equals("cola")) {
			juiceCost = 1.5;
		}
		else if(juice.equals("cider")) {
			juiceCost = 1.4;
		}
	}
	public double getBurgerCost() {
		return burgerCost;
	}
	public double getJuiceCost() {
		return juiceCost;
	}
}