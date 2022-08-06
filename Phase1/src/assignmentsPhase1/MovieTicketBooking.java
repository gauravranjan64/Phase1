package assignmentsPhase1;
import java.util.*;
import java.util.regex.Pattern;

public class MovieTicketBooking {
	String movie;
	int ticket;
	char row;
	int Amount;
	int count=0;
	static private String adminPassword="Gaurav@1234";
	LinkedList A=new LinkedList<>();
	LinkedList B=new LinkedList<>();
	LinkedList C=new LinkedList<>();
	LinkedList D=new LinkedList<>();
	LinkedList E=new LinkedList<>();
	
	static Scanner sc=new Scanner(System.in);
	
	
	public String selectShow(){
		movie=sc.next();
		return movie;		
	}
	
	public char selectRow(){
		row=sc.next().charAt(0);
		return row;
		
	}
	
	public int selectTicket(){
		ticket=sc.nextInt();
		if(ticket<1 && ticket > 10 ){
			System.out.println("Enter valid ticket number;");			
		}
		count++;
		return ticket;
	}
	public String showTiming(){
		
		System.out.println("Available show time,choose number to select time"+"\n"+"1. 9am-12pm"+"\n"+"2. 12:30pm-3pm"+"\n"+"3. 3:30pm-6pm");
		
		String time="";
		int n=sc.nextInt();
		if(n==1){
			time="9am-12pm";
		}else if(n==2){
			time="12:30pm-3:30pm";
		}else if(n==3){
			time="3:30pm-6pm";
		}
		return time;
	}
public String showDate(){
		
		System.out.println("Enter date here:(dd/mm/yyyy)");
		String date=sc.next();
		return date;
	}
	public static void main(String[] args) {
		System.out.println("                --------MOVIE TICKET BOOKING FRONT DESK--------");
		System.out.println("FOR PASSWORD CHANGE GO TO ADMIN AND FOR TICKET BOOKING GO FOR THE USER OPTION!!");
		MovieTicketBooking obj=new MovieTicketBooking();
		System.out.println("Are you an user or admin?");
		String check=sc.next();
		if(check.equals("Admin") || check.equals("admin")){
			
			System.out.println("Enter Password: ");
			String password=sc.next();
			
			if(password.equals(adminPassword)){
				System.out.println("You entered as an admin!");
			}else{
				System.out.println("You entered wrong password!!");
				System.out.println("Do you want to chnage your password?(yes/no)");
				String value=sc.next();
				if(value.equals("yes")){
					System.out.println("Please enter your new password!(length-10,One UpperCase,one special character(@,#),4-numbers)");
					String pass=sc.next();
					boolean checkPassword=Pattern.matches("^[A-Z][a-z0-9@#]{9}$", pass);
					if(checkPassword){
						System.out.println("Password changed!!");
						System.out.println("You entered as an admin!");
					}else{
						System.out.println("Please enter a valid password! in next attempt");
					}
				
				}else{
					return;
				}
			}
		}else if(check.equals("user") || check.equals("User")){
			System.out.println("You entered as an user!");
			
			char ch;
			do{
				System.out.println("Select your choice");
				System.out.println("1. Select date and time for the movie.");
				System.out.println("2. Book ticket here.");
				System.out.println("3. Calculate amount.");
				System.out.println("4. Exit from here.");
				int choice=sc.nextInt();
				
				switch(choice){
					case 1: System.out.println("Date Selected: "+obj.showDate());
							System.out.println("Time selected: "+obj.showTiming());
							break;

					case 2: System.out.println("Shows in the threater: RRR"+"\t"+"KGF"+"\t"+"Rocektry");
					        System.out.println("Select show");obj.selectShow();
					        System.out.println("Enter row between A-E");obj.selectRow();
					        System.out.println("Select seat between 1-10");obj.selectTicket();
						    System.out.println("You Ticket is: "+obj.row+obj.ticket);
						    break;
					case 3: System.out.println("Total amount for "+obj.count+" tickets: "+obj.count*180);
							break;
					case 4: System.out.println("Enjoy your movie!");
						    System.exit(0);
					break;
					
					default : System.out.println("Bahar");
				}
				System.out.println("Type in y for booking ticket else n");
				ch=sc.next().charAt(0);
				
			}while(ch == 'y' || ch == 'Y');
		}else{
			System.out.println("Invalid input try again!");
		}

	}

}
