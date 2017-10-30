import java.util.Scanner;
public class polindrome{
	
	public static void main(String args[])
	{
		String n= new String();
		Scanner s=new Scanner(System.in);
		n=s.next();
		int i=0;
		String []ans=new String[453];
		
		
		for(int q=0;q<n.length()-1;q++){
			
			for(int k=q+1;k<n.length();k++){
				String f= n.substring(q, k);
				String g=new StringBuilder(f).reverse().toString();
				if(g.equalsIgnoreCase(f))
				{
					++i;
					ans[i]=g;
				}
			}
		}
		for(int r=1;r<ans.length-1;r++){
			if(ans[0].length()<ans[r].length())
				ans[0]=ans[r];
		}
		System.out.println(ans[0]);

	}
}
	