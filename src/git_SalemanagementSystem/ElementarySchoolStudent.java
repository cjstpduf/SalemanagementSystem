package git_SalemanagementSystem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ElementarySchoolStudent extends Student {
	   
    public String parentemail;
    public String parentphone;
    Exc ex = new Exc();

    public ElementarySchoolStudent(StudentKind kind) {
        super(kind);
    }

    public void getUserInput(Scanner input) {
        Student std = new Student();
        System.out.print("Password: ");
        try {
            int id = input.nextInt();
            ex.badCode(id);
            this.setId(id);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException error occur!");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Exception error occur!");
            System.exit(0);
        }

        System.out.println("Grade and classroom number: ");
        try {
            grade = input.nextInt();
            classroom = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException error occur!");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Exception error occur!");
            System.exit(0);
        }

        String answer = "";
        while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
            System.out.println("Do you have a parent's email address and phone number? (Y/N)");
            answer = input.next();
            if (answer.equalsIgnoreCase("y")) {
                System.out.println("Parent Email address: ");
                try {
                    String email = input.next();
                    if (isValidEmail(email)) {
                        std.setParentEmail(email);
                    } else {
                        System.out.println("Invalid email format!");
                        System.exit(0);
                        std.setParentEmail("invalid form");
                    }
                } catch (Exception e) {
                    System.out.println("Exception error occur!");
                    System.exit(0);
                    std.setParentEmail("invalid form");
                }
                break;
            } else if (answer.equalsIgnoreCase("n")) {
                std.setEmail("no email");
                break;
            }
        }
    }

    private boolean isValidEmail(String email) {
        String emailPattern = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        return email.matches(emailPattern);
    }
}
	  