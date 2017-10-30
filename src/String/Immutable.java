package String;

public class Immutable {
	 public static void main(String args[])
	    {
	    	String x = "raj";
	    	String n= new String("raj");
	    	String y = "raj";
	    	System.out.println(x.equals(n));
	    	System.out.println(x==n);
	    	y+="kanna";
	    	System.out.println(x);
	    	System.out.println(y);
	    	float a = 2.7f;
	    	double b = 2.7;
	    	System.out.println(a==b);
	    	
	    	int p = 5;
	    	int q = 5;
	    	System.out.println(p==q);
	    	System.out.println(++q);
	    	System.out.println(p++);
	    	
	    }
}

