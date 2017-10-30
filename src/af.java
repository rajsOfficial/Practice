import java.util.Scanner;

public class af {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String x=s.nextLine();
		char[] n=x.toCharArray();
		char a=' ';
		int m=0;
		for(int i=0;i<n.length;i++)
		{
			if(n[i]==a){
				m=i;
				continue;
			}
			else
			{
				String k=x.substring(m,i+1);
				System.out.print(k+",");
		}
		}
		}
	}

