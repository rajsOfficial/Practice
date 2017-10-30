import java.util.*;

public class Hund_Fact {
	ArrayList<String> ls=new ArrayList<>();
	ArrayList <String> store=new ArrayList<>();
	public static void main(String args[]){
		
		Hund_Fact obj=new Hund_Fact();
		obj.multy();
		
		//System.out.println("Enter the Number to find the factorial");
	
		}
	public void multy(){
		Hund_Fact obj1=new Hund_Fact();
	
	String num= "1238434523";
	String num1="78223534645";
	
	
	
//	int n=100;		 
	//for(int i=n; i<=1;i--){
			
		for(int a1=num.length()-1;a1>=0;a1--)
			{
			int a=num.charAt(a1)-'0';	
			int carry=0;
			String str="";
		
			for(int b1=num1.length()-1;b1>=0;b1--){
				
				int b=num1.charAt(b1)-'0';
				int st=(b*a)+carry;
					if(b1==0 || st<=9)
						{
						str+=Integer.toString(st);
						
						}
					else if(st>9)
					{
						 carry=st/10;
						st%=10;	
						str+=Integer.toString(st);
					}
					
				}
		String stor = new StringBuffer(str).reverse().toString();
	for(int u=1;u<(num.length()-a1);u++){
			stor+="0";
		}
		ls.add(stor);
	
				}
		System.out.println(ls);
		obj1.adding(ls);
	}
	
	
	
public  void adding(ArrayList<String> al){
			String s1=al.get(0);
		
			for (int i=1; i<al.size();i++){
				int m=i;
				String s2=al.get(m);
				System.out.println(s2);
				int numer,carry=0;
				String s3=new String();
				if(s1.length()>s2.length())
				{
					String temp=s1;
					s1=s2;
					s2=s1;
				}
				for(int k=0;k<s1.length();k++)
				{
					int a1=s1.charAt(s1.length()-k-1)-'0';
					int b1=s2.charAt(s2.length()-k-1)-'0';
					numer=(a1+b1)%10+carry;
					carry=(a1+b1)/10;
					 s3+=String.valueOf(numer);
									}
			
			if(s1.length()==s2.length()){
			
				s3+=String.valueOf(carry);
			
				s1=new StringBuffer(s3).reverse().toString();
			}
			
			if(s1.length()<s2.length())
				{
				int diff=(s2.length()-s1.length());
				int change=s2.charAt(diff-1)-'0';	
				change+=carry;
				String last =s2.substring(0,diff-1)+String.valueOf(change);
			
				s3+=new StringBuffer(last).reverse().toString();
				s1=new StringBuffer(s3).reverse().toString();
			
				}

			}
			System.out.println(s1);
			System.out.println("Length is "+s1.length());
			store.add(s1);
			
	}
}

