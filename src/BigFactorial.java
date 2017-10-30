import java.util.Scanner;
import java.math.BigInteger;
 
class BigFactorial
{
  public static void main(String args[])
  {
    int n, c;
    BigInteger inc = new BigInteger("1");											 // Initializing BigIntegers Inc and Fact to 1
    BigInteger fact = new BigInteger("1");
 
    Scanner input = new Scanner(System.in);
 
    System.out.println("Input an integer");
    n = input.nextInt();
 
    for (c = 1; c <= n; c++) {
      fact = fact.multiply(inc);													 // Multiplying fact*inc and storing in fact
      inc = inc.add(BigInteger.ONE);												 //Incrementing the BigInteger inc
    }
 
    System.out.println(n + "! = " + fact);
    String x = new String();													
    x=fact.toString();																//Adding the digits
    int sum=0;
    int digit=0;
    for(int i=0;i<x.length();i++)
    {
    	digit=(int)(x.charAt(i)-'0');
    	sum=sum+digit;
    	}
    System.out.println(sum);
    }
  }
