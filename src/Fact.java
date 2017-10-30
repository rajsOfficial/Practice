
public class Fact {
	double finding(double x){
		System.out.println("factorial is"+x);
		double n=1;
		for(double y=x;y>0;y--)
		{
			n=n*y;
		}
		
		return n;
	}
	
	double addition(double m)
	{
		double l=0;
		while(m>0)
		{
			double k=m%10;
			m=m/10;
			l=l+k;
		}
		return l;
		
	}
	
public static void main(String args[])
{
	Fact a =new Fact();
	double s=a.finding(100);
	double b=a.addition(s);
	/*String q=new String();
	q=double.toString(s);*/
	System.out.println("fact is\t"+s);
	
	
	System.out.println("the sum of the digits are"+b);
	
}
}
