package git_SalemanagementSystem;

import java.util.Scanner;

public class Sale{

	public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("choice!!!!!: food, drink");
        String a = input1.next();
        
        int b;
        
        switch (a)
        {
        case "food":
        b = 1;
        break;
        
        case "drink":
        b = 2;
        break;
        
        default:
        b = 3;
        }
        
        if (b == 1)
        {
           menu();
        }
        else if (b == 2)
        {
           juice();
        }       
     }
	public static void juice() {
        Scanner input3 = new Scanner(System.in);
        System.out.println("coke, sprite, fanta");
        String d = input3.next();
        System.out.println("you ordered "+d);
	}
	public static void menu() {
		Scanner input2 = new Scanner(System.in);
        System.out.println("kimbob, ramen, fried rice");
        String c= input2.next();
        System.out.println("you ordered "+c);
	}
}