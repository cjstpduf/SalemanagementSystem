	package git_SalemanagementSystem;
	
	public class Menu {
		   public String name;
		   public int phonenumber;
		   public String hamburger;
		   public String juice;
		      
		   public void setName(String name) {
		      this.name = name;
		   }
		   
		    public String getName() {
		        return this.name;
		    }
		   
		    public void setPhoneNumber(int phonenumber) {
		        this.phonenumber = phonenumber;
		    }
		    
		    public int getPhoneNumber() {
		        return this.phonenumber;
		    }
	
		    public void setHamburger(String hamburger) {
		        this.hamburger = hamburger;
		    }
		    
		    public String getHamburger() {
		        return this.hamburger;
		    }
	
		    public void setJuice(String juice) {
		        this.juice = juice;
		    }
		    
		    public String getJuice() {
		        return this.juice;
		    }
		      
		      public void printInfo() {
		         System.out.println("name: " + name + " phonenumber: " + phonenumber + " hamburger: " + hamburger + " juice: " + juice);
		      }
	
		   
		}