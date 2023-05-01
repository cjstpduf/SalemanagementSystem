package git_SalemanagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManagement{
	   ArrayList<Menu> sales = new ArrayList<Menu>();
	      Scanner input;
	      SaleManagement(Scanner input){
	         this.input = input;
	      }
	      public void addMenu() {
	         Menu m = new PlusMenu();
	         System.out.print("your name:");
	         m.setName(input.next());
	         
	         System.out.print("your phone number:");
	         m.setPhoneNumber(input.nextInt());
	         
	         System.out.print("select hamburger:(chickenBurger, bulgogiBurger, cheeseBurger, beefBurger)");
	         m.setHamburger(input.next());
	         
	         System.out.print("select juice:(orangeJuice, grapeJuice, cola, cider)");
	         m.setJuice(input.next());
	         
	         sales.add(m);
	      }
	      
	      public void deleteMenu() {
	         System.out.print("your phone number:");
	         int number = input.nextInt();
	         int index = -1;
	         for(int i = 0; i<sales.size(); i++) {
	            if(sales.get(i).getPhoneNumber() == number) {
	               index = i;
	               break;
	            }
	         }
	         if(index>=0) {
	            sales.remove(index);
	            System.out.println("The menu for the customer with the phone number"+ number + "has been deleted");
	         }
	         else {
	            System.out.println("this phone number has not been registered");
	            return;
	         }
	         
	      }
	      public void viewMenu() {
	         for(int i = 0; i<sales.size(); i++) {
	            sales.get(i).printInfo();
	         }
	      }
	      
	      public void editMenu() {
	         System.out.print("your phone number:");
	         int number = input.nextInt();
	         for(int i = 0; i<sales.size(); i++) {
	            Menu p = sales.get(i);
	            if(p.getPhoneNumber() == number) {
	               int num = -1;
	               while(num != 5) {
	                  System.out.println("** menu edit ** ");
	                  System.out.println("1. edit name");
	                  System.out.println("2. edit phonenumber");
	                  System.out.println("3. edit hamburger");
	                  System.out.println("4. edit juice");
	                  num = input.nextInt();
	                  if(num == 1) {
	                     System.out.print("your name:");
	                     p.setName(input.next());
	                  }
	                  else if(num == 2) {
	                     System.out.print("your phonenumber:");
	                     p.setPhoneNumber(input.nextInt());
	                  }
	                  else if(num == 3) {
	                     System.out.println("hamburger:");
	                     p.setHamburger(input.next());
	                  }
	                  else if(num == 4) {
	                     System.out.println("select juice:");
	                     p.setJuice(input.next());
	                  }
	                  else
	                     continue;                   
	               }//if
	            }//while
	            break;
	         }//if
	      }//for

	   
	}



        