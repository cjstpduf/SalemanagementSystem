package git_SalemanagementSystem;

import java.io.Serializable;
import java.util.InputMismatchException;

public class Exc implements Serializable{
	public void badCode(int a) throws Exception{
	}
	
	public void badCode(String a) throws InputMismatchException{
		throw new InputMismatchException();
	}
	
	public String bCode(String a) throws NumberFormatException{
		try{
			int number = Integer.parseInt(a);
			return a;
		} catch(NumberFormatException e) {
			throw e;
		}
		
	}
	

	

}
