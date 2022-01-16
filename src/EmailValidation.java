import java.util.Scanner;
public class EmailValidation {

	
	public static void main(String[] args) {
		emailToSearch();
	}	
	static void emailToSearch()
	{
	                Scanner sc = new Scanner(System.in);
					System.out.println("Enter email to search");
					String email=sc.nextLine();
					
					
            searchEmail(email);
				
	           
			
		
		
     }
		public static void searchEmail( String email)
		{
			String[] employeeEmails={"abc12@gmail.com","bcd45@gmail.com","fsd67@gmail.com","rop34@gmail.com","lms2gmail.com"};
			
		
			for (String email2 :employeeEmails)
			{
			
				if(email2.equals(email))
				{
					System.out.println("Email is Presesnt in the list");
					System.out.println(email);
					break;
				
				}
				else
				{
					System.out.println("Email is not present in list");
					break;
				}
			
		}

     }
		
		
}

