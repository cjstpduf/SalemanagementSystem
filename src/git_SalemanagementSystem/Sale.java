package git_SalemanagementSystem;

import java.util.Scanner;

public class Sale{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please select a drink.");
		System.out.println("1. Coke (1,500 won)");
		System.out.println("2. Cider (1400 won)");
		System.out.println("3. Fanta (orange) (1200 won)");
		System.out.println("4. Fanta (Pineapple) (1200 won)");
		System.out.println("5. Bottled water (1000 won)");
	
		
		System.out.println("Please enter the number of the selected beverage.");
		int choice = scanner.nextInt();
		
		if(choice == 1) {
			System.out.println("Here's your coke.");
		}
		else if(choice == 2) {
			System.out.println("Here's Cider.");
		}
		else if(choice == 3) {
			System.out.println("Fanta (orange) is here.");
		}
		else if(choice == 4) {
			System.out.println("Fanta (pineapple) is here.");
		}
		else if(choice == 5) {
			System.out.println("bottled water is here.");
		}
		else {
			System.out.println("You made a wrong choice.");
		}
		}
	}