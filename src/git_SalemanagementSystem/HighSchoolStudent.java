package git_SalemanagementSystem;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HighSchoolStudent extends Student {
   
   public HighSchoolStudent(StudentKind kind) {
      super(kind);
   }
   
   public void getUserInput(Scanner input) {
	  Student std = new Student();
      System.out.print("Password: ");
      try{
    	  int id = input.nextInt();
    	  this.setId(id);
      }catch(InputMismatchException e) {
    	  System.out.println("InputMismatchException error occur!");
          System.exit(0);
      }catch(Exception e) {
    	  System.out.println("Exception error occur!");
          System.exit(0);
      }
      
      System.out.print("grade and classroom number: ");
      String name = input.next();
      this.setName(name);
      
      char answer = 'x';
      while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
      {
         System.out.print("do you have a email address and phone number? (Y/N)");
         answer = input.next().charAt(0);
         if (answer == 'y' || answer == 'Y') {
     	    System.out.println("Email address: ");
    	    try{
    	    	String email = input.next();
    	    	emails.add(email);
    	    }catch(InputMismatchException e) {
    	    	System.out.println("InputMismatchException error occur!");
                System.exit(0);
    	    }catch(Exception e) {
    	    	System.out.println("Exception error occur!");
                System.exit(0);
    	    }
    
         }
         else if (answer == 'n' || answer == 'N') {
            this.setEmail("no email");
         }
      }
   }
   
}