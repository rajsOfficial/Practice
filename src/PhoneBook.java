import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.*;

public class PhoneBook {
	Scanner in = new Scanner(System.in);
	HashMap<Integer, Contact> map = new HashMap<>();
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

	public void Creating() {
		System.out.println("\tCreating a contact");
		System.out.println("Enter the id");
		int id = getid(999999999);
		if (!map.containsKey(id)) {

			Contact object = new Contact();
			map.put(id, object);
			System.out.println("Enter the name :");
			object.setName(in.next());

			PhNum(id);

			System.out.println("Enter your mail id :");
			String s = get_mail();
			object.setMail(s);
			System.out.println("Enter your address :");
			object.setAddr(in.next());
			System.out.println("Enter your Date Of Birth in DD/MM/YYYY format :");
			boolean h=true;
			do{
				String x=in.next();
				try {
					LocalDate date=LocalDate.parse(x, formatter);
					map.get(id).setDob(date);
					h=false;
				}
				catch (Exception e) {
					System.out.println("Please Enter a valid date ");
					continue;
				}
			}while(h==true);
			System.out.println("\tSaved Successfully");
			}
			else
			System.out.println("Contact Already Present");
	}

	public String get_mail() {
		boolean p = true;
		String s;
		do {
			s = in.nextLine();
			Pattern pattern = Pattern
					.compile("[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})");
			Matcher match = pattern.matcher(s);
			if (match.matches()) {
				p = false;
			} else
				System.out.println("Please Enter a valid email id like  xyz@gmail.com ");
		} while (p == true);
		return s;
	}

	public void Editing() { // Editing A Contact
		System.out.println("\tEditing a Contact");
		System.out.println("Enter the id");
		int id = getid(999999999); // Getting id
		if (map.containsKey(id)) {
			System.out.println("Select the Field to Edit"); // Creating option
															// on UI
			System.out.println("1.Name \n2.Phone Number \n3.Mail id \n4.Address \n5.Date Of Birth");
			boolean k = true;
			int Select = 0;
			do { // handling input mismatch exception
				try {
					Select = in.nextInt();
					if (Select > 0 && Select < 6)
						k = false;
				} catch (InputMismatchException e) {
					System.out.println("Please Make A Right Choice");
					in.next();
				}
			} while (k == true);

			switch (Select) {
			case 1:
				System.out.println("Enter the name :");
				map.get(id).setName(in.next());
				System.out.println("\t Edited Successfully");
				break;
			case 2:
				map.remove(id);
				PhNum(id);
				System.out.println("\t Edited Successfully");
				break;
			case 3:
				System.out.println("Enter your mail id :");
				String s = get_mail();
				map.get(id).setMail(s);
				System.out.println("\t Edited Successfully");
				break;
			case 4:
				System.out.println("Enter your address :");
				map.get(id).setAddr(in.next());
				System.out.println("\t Edited Successfully");
				break;
			case 5:
				System.out.println("Enter your Date  :");
				boolean h=true;
				do{
					String x=in.next();
					try {
						LocalDate date=LocalDate.parse(x, formatter);
						map.get(id).setDob(date);
						h=false;
					}
					catch (Exception e) {
						System.out.println("Please Enter a valid date ");
						continue;
					}
				}while(h==true);
				System.out.println("\t Edited Successfully");
				break;
			}
		} else
			System.out.println("Entered Contact doesn't Exist");
	}

	public void PhNum(int id) {
		String choice;
		do {
			boolean a = true;
			long num = 0;
			do { // Editing Multiple Ph No

				System.out.println("Enter ph no :\n");
				try {
					num = in.nextLong();
					if (num > 999999999 && num <= 9999999999L)
						a = false;
					else
						System.out.println("The entered number is not a valid ph number");
				} catch (InputMismatchException e) {
					System.out.println("Please enter yout phone number correctly");
					in.next();
					continue;
				}
			} while (a == true);
			map.get(id).setPhno(num);
			System.out.println("You want to enter another number Yes/No");
			boolean q = true;
			do {
				choice = in.next();
				if (choice.toLowerCase().equals("no") || choice.toLowerCase().equals("yes"))
					q = false;
				else {
					System.out.println("The choice should be 'yes' or 'no'");
					continue;
				}
			} while (q == true);

		} while (!choice.toLowerCase().equals("no"));
	}

	public void Deleting() {
		System.out.println("\tDeleting A Contact");
		System.out.println("Enter the id");
		int id = getid(999999999);
		if (map.containsKey(id)) {
			map.remove(id);
			System.out.println("Contact deleted of id :" + id);
		} else
			System.out.println("No Such Contact To be Deleted ");
	}

	public void Display() {
		System.out.println("\tDisplaying Contact");
		System.out.println("Enter the id");
		int id = getid(999999999); // Displaying a Contact
		if (map.containsKey(id)) {
			System.out.println("Id is     :" + id);
			System.out.println("Name  	  :" + map.get(id).getName());
			System.out.println("Phone No  :" + map.get(id).getPhno());
			System.out.println("Mail id   :" + map.get(id).getMail());
			System.out.println("Address   :" + map.get(id).getAddr());
			System.out.println("Dob is    :" + map.get(id).getDob());
		} else
			System.out.println("No such Contact  ");
	}

	public int getid(int limit) {
		int num = 0;
		boolean r = true;

		do {
			try {
				num = in.nextInt();
				if (num > limit || num <= 0) {
					System.out.println(" Please Enter within :" + limit);
					continue;
				}
				if (num > 0 && num < limit)

					r = false;
			} catch (InputMismatchException e) {
				System.out.println("Enter positive Integer value within :" + limit);
				in.next();
				continue;
			}

		} while (r == true);
		return num;
	}

	public void Selection(int option) { // Going through Selection

		switch (option) {
		case 1:
			Creating();
			break;
		case 2:
			Editing();
			break;
		case 3:
			Deleting();
			break;
		case 4:
			Display();
			break;
		default:
			System.out.println("Exiting");
			System.exit(0);
		}
	}

	public static void main(String[] args) { // Main method
		Scanner in = new Scanner(System.in);
		PhoneBook obj = new PhoneBook();
		boolean x = true;
		int option = 0;
		do {
			System.out.println("\tCONTACT CREATION");
			System.out.println("1.Create \n2.Edit \n3.Delete \n4.Display \n5.Exit");
			boolean y = true;
			do {
				try {
					option = in.nextInt();
					if (option >= 1 && option <= 5) {
						y = false;
						obj.Selection(option);
					} else
						System.out.println("Please Make a Proper Choice ");
				} catch (InputMismatchException e) {
					System.out.println("Enter Integer Value");
					in.next();
					continue;
				}
			} while (y == true);
		} while (x == true);
	}
}
