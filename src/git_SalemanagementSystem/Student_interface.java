package git_SalemanagementSystem;

import java.util.ArrayList;

public interface Student_interface{

	   public void Student();
	   
	   public void Student(StudentKind kind);
	   
	   public void Student(String name, int id); 
	   
	   public void Student(String name, int id, String email, String phone); 
	   
	   public void Student(StudentKind kind, String name, int id, String email, String phone);
	   
	   public StudentKind  getKind(); 
	   
	   public void setKind(StudentKind kind); 
	   
	   public String getName(); 
	   
	   public void setName(String name); 
	   
	   public int getId();
	   
	   public void setId(int id); 

	   public void setEmail(String email);

	   public void setParentEmail(String email); 
	   
	   public ArrayList<String> getEmail(); 
	   
	   public String getPhone(); 
	   
	   public void setPhone(String phone); 

	   public void printInfo();

	}