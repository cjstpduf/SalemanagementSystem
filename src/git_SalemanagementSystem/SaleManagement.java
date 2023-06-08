package git_SalemanagementSystem;

import java.io.Serializable;
import java.util.ArrayList;
   import java.util.Scanner;
   
   public class SaleManagement implements Serializable{
       /**
          * 
          */
      int a = 1;
         private static final long serialVersionUID = -5380222753269643829L;
         
         ArrayList<Menu> sales = new ArrayList<Menu>();
         Sale s = new Sale();
          Student std = new Student();
          transient Scanner input = new Scanner(System.in);
          SaleManagement(Scanner input){
              this.input = input;
          }
          public void addMenu() {
             int a = 0;
              System.out.println("1 for University?");
              System.out.println("2 for High School?");
              System.out.println("3 for Middle School?");
              System.out.println("4 for Elementary School?");
              System.out.println("Select num 1, 2, 3 or 4 for Student Kind: ");
              int kind = input.nextInt();
              Student student;
              if (kind == 1) {
                  student = new Student(StudentKind.University);
                  student.getUserInput(input);
                  if(a == 1) {
                     return;
                  }
              }
              else if (kind == 2) {
                  student = new HighSchoolStudent(StudentKind.HighSchool);
                  student.getUserInput(input);
                  if(a == 1) {
                     return;
                  }
              }
              else if (kind == 3) {
                  student = new MiddleSchool(StudentKind.MiddleSchool);
                  student.getUserInput(input);
                  if(a == 1) {
                     return;
                  }
              }
              else if (kind == 4) {
                  student = new ElementarySchoolStudent(StudentKind.ElementarySchool);
                  student.getUserInput(input);
                  if(a == 1) {
                     return;
                  }
              }

              Menu m = new PlusMenu();
              System.out.println("your name:");
              m.setName(input.next());

              System.out.println("your phone number(or parent number):");
              m.setPhoneNumber(input.nextInt());

              System.out.println("select hamburger:(chickenBurger, bulgogiBurger, cheeseBurger, beefBurger)");
              m.setHamburger(input.next());

              System.out.println("select juice:(orangeJuice, grapeJuice, cola, cider)");
              m.setJuice(input.next());

              sales.add(m);
          }

          public void deleteMenu() {
              System.out.print("your phone number(or parent number):");
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
             
         public void editMenu() {
            System.out.print("your phone number(or parent number):");
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
                            System.out.print("your phonenumber(or parent number):");
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

                
         
         public void viewMenu() {
           int i =0;                                     
            for (Menu menu : sales) {
                menu.printInfo();
                }

  

   
   
         }
      public int size() {
         return sales.size();
      }
      
      public Menu get(int index) {
         return (Menu) sales.get(index);
      }

      }