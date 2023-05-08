package git_SalemanagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class ElementarySchoolStudent extends Student {
	   
	   public String parentemail;
	   public String parentphone;


	   public ElementarySchoolStudent(StudentKind kind) {
	      super(kind);
	   }
	   
	   public void getUserInput(Scanner input) {
		  Student std = new Student();
	      System.out.print("Password: ");
	      int id = input.nextInt();
	      this.setId(id);
	      
	      System.out.print("grade and classroom number: ");
	      String name = input.next();
	      this.setName(name);
	      
	      char answer = 'x';
	      while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
	      {
	         System.out.print("do you have a parent's email address and phone number? (Y/N)");
	         answer = input.next().charAt(0);
	         if (answer == 'y' || answer == 'Y') {
	            System.out.print("parent Email address: ");
	            String email = input.next();
	            std.setParentEmail(email);           
	            
	            break;
	         }
	         else if (answer == 'n' || answer == 'N') {
	            std.setEmail("no email");
	            break;
	         }
	      }
	   }
}
	         
	  