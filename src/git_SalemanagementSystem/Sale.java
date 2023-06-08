package git_SalemanagementSystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

import gui.WindowFrame;

public class Sale implements Serializable{
    static EventLogger logger = new EventLogger("log.txt");

    public static void main(String[] args) {
    
        int num = 0;
        Scanner input = new Scanner(System.in);
        SaleManagement sale = getObject("SaleManagement.ser");
        System.out.println(sale);
        if (sale == null) {
            sale = new SaleManagement(input);
            System.out.println("asdf");
            System.out.println(sale);
        }
        putObject(sale, "SaleManagement.ser");
        
        WindowFrame F = new WindowFrame(sale);

 
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
             logger.log("add burger");
             break;
          case 2:
             sale.deleteMenu();
             logger.log("delete order history");
             break;
          case 3:
             sale.editMenu();
             logger.log("edit order history");
             break;
          case 4:
             sale.viewMenu();
             logger.log("view order history");
          }
          putObject(sale, "SaleManagement.ser");
       }
    
    }
    
    public void printt() {
       SaleManagement s = getObject("SaleManagement.ser");
       s.sales.get(0).printInfo();
    }
 
    
    public static SaleManagement getObject(String filename) {
       SaleManagement sale = null;
       
       
       
       try {
          FileInputStream file = new FileInputStream(filename);
          ObjectInputStream in = new ObjectInputStream(file);
     
          sale = (SaleManagement) in.readObject();
     
          in.close();
          file.close();
       } catch (FileNotFoundException e) {
          return sale;
       } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
       } catch (ClassNotFoundException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
       }
 
       return sale;
    }

    
    public static void putObject(SaleManagement sale, String filename) {
       try {
          FileOutputStream file = new FileOutputStream(filename);
          ObjectOutputStream out = new ObjectOutputStream(file);
     
          out.writeObject(sale);
     
          out.close();
          file.close();
       } catch (FileNotFoundException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
       } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
       } 
    }
 }