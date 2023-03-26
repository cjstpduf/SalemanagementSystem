package git_SalemanagementSystem;

import java.util.Scanner;

public class Sale{
	public static void main(String[] args) {
		
		int a = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(a != 5) {
			System.out.println("1. select menu");
			System.out.println("2. delete menu");
			System.out.println("3. select side");
			System.out.println("4. select juice");
			a = scanner.nextInt();
		}
		System.out.println("5. exit");
	}
}