import java.util.*;
import java.text.*;

public class Dob {

	public static void main(String args[]){
		Scanner in =new Scanner(System.in);
		System.out.println("Enter date in dd/mm/yyyy");
		
		SimpleDateFormat Formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date=new Date();
		boolean k=true;
		do{
			try{
				String n=in.nextLine();
			date= Formatter.parse(n);
			k=false;

		}
			catch(ParseException e)
			{
				System.out.println("Enter a valid Date");
				in.next();
				continue;
			}
		
		}while(k==true);
		System.out.println(date);
	}
}
