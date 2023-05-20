package git_SalemanagementSystem;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
   public StudentKind kind = StudentKind.University;
   public String name;
   public int id;
   public static ArrayList<String> emails = new ArrayList<String>();
   public String phone;
   public int grade;
   public int classroom;
   Exc ex = new Exc();

   
   public Student() {
   }
   
   public Student(StudentKind kind) {
      this.kind = kind;
   }
   
   public Student(String name, int id) {
      this.name = name;
      this.id = id;
   }
   
   public Student(String name, int id, String email, String phone) {
      this.name = name;
      this.id = id;
      emails.add(email);
      this.phone = phone;
   }
   
   public Student(StudentKind kind, String name, int id, String email, String phone) {
      this.kind = kind;
      this.name = name;
      this.id = id;
      emails.add(email);
      this.phone = phone;
   }
   
   public StudentKind getKind() {
      return kind;
   }
   
   public void setKind(StudentKind kind) {
      this.kind = kind;
   }
   
   public String getName() {
      return name;
   }
   
   public void setName(String name) {
      this.name = name;
   }
   
   public int getId() {
      return id;
   }
   
   public void setId(int id) {
      this.id = id;
   }
   

   public void setEmail(String email) {
	    emails.add("email is: " +email);
	}

	public void setParentEmail(String email) {
	    emails.add("parents email: " + email);
	}
   
   public ArrayList<String> getEmail() {
       return emails;
   }
   
   public String getPhone() {
      return phone;
   }
   
   public void setPhone(String phone) {
      this.phone = phone;
   }

   public void printInfo() {
      String skind = "none";
      switch(this.kind) {
      case University:
         skind = "Univ";
         break;
      case HighSchool:
         skind = "high";
         break;
      case MiddleSchool:
         skind = "middle";
         break;
      case ElementarySchool:
         skind = "elementary";
         break;
      default:
      }
      System.out.println("kind: " + skind + "name: " + name + " id:" + id + " email:" + emails + " phone:" + phone);
   }
   
   public void getUserInput(Scanner input) {
	    System.out.print("password: ");
	    try{
	    	int pass = input.nextInt();
	    	ex.badCode(pass);
	    	this.setId(pass);
	    }catch(InputMismatchException e) {
	    	System.out.println("InputMismatchException error occur!");
            System.exit(0);
	    }catch(Exception e) {
	    	System.out.println("Exception error occur!");
            System.exit(0);
	    }
	   

	    System.out.println("department: ");
	    String name = input.next();
	    this.setName(name);

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
   

   
}