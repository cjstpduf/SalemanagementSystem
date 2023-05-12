	package git_SalemanagementSystem;
	
	public abstract class Menu {
		   public String name;
		   public int phonenumber;
		   public String hamburger;
		   public String juice;
		      
		   public abstract void setName(String name);
		   
		    public abstract String getName();
		   
		    public abstract void setPhoneNumber(int phonenumber);
		    
		    public abstract int getPhoneNumber();
	
		    public abstract void setHamburger(String hamburger);
		    
		    public abstract String getHamburger();
	
		    public abstract void setJuice(String juice);
		    
		    public abstract String getJuice();
		      
		    public abstract void printInfo();
			
	
		   
		}