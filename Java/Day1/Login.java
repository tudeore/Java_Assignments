import java.util.Scanner;

public class Login {
public static void main(String[] args){
	String uname = "tudeore";
	String password = "tush@r123";
	Scanner sc = new Scanner(System.in);  //creating object of scanner class
			
				
		for(int count = 0;count<=2;count++)
		{
		int n =2;
		System.out.println("Enter Username");
		String name  = sc.next();
					
		System.out.println("Enter Password");
		String pass  = sc.next();
					
		if(uname.equals(name)&& password.equals(pass))
		{
		System.out.println("Welcome "+ "username="+uname);
		break;
		}
		else if(count==2)
		{
		System.out.println("contact to admin");	
		}
		else
		{
		System.out.println("wrong credentials");
		}
		}
								
	}
}