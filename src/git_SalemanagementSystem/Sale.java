package git_SalemanagementSystem;

import java.util.Scanner;

public class Sale {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		SaleManagement sale = new SaleManagement(input);
		while(num != 5) {
			System.out.println("hamburger sale system");
			System.out.println("1.add burger");
			System.out.println("2.delete order history");
			System.out.println("3.edit order history");
			System.out.println("4.view order history");
			System.out.println("5.exit");
			System.out.println("select one number 1-5");
			num = input.nextInt();
			
			switch(num) {
			case 1:
				sale.addMenu();
				break;
			case 2:
				sale.deleteMenu();
				break;
			case 3:
				sale.editMenu();
				break;
			case 4:
				sale.viewMenu();
				break;
			}
		}
	}

}
