import java.util.Scanner;
		
public class StringMultiply {
		
			String n = new String();
			String m=new String();
			
	public static void main(String args[])
	{
			Scanner s= new Scanner(System.in);
			System.out.println("Enter the number");
			int x=s.nextInt();
			System.out.println("Enter the second number");
			int y=s.nextInt();
			StringMultiply a= new StringMultiply();
			a.func(x, y);
			s.close();
		
	}
	public void func(int x,int y){
			int h,i;
			n=Integer.toString(x);
			m=Integer.toString(y);
		for(int k=1;k<=m.length();k++)
		{		
			h=(int) m.charAt((m.length()-1))-'0';
			
			for(int l=1;l<=n.length();l++)
		{
			i=(int) n.charAt((n.length()-1))-'0';
		}
	}
}
}
