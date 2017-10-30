
public class LongestConsPrime
	 {
		int max = 4000;
		int[] n = new int[1321424];
		int m=0;
        int[] x =new int[973462];
        int q=0;
		int ans=0;
		
void   prime()
	 {
	   for (int i = 2; i<max; i++) 
	 {
            boolean isPrimeNumber = true;										// check to see if the number is prime
            
       for (int j = 2; j < i; j++)
     {
            if (i % j == 0)
     {
                    isPrimeNumber = false;
                    break; 														// exit the inner for loop
     }
     }
       																			// print the number if prime
            if (isPrimeNumber)
     {
            	m++;
            	n[m]=i;
     }
     }
	 }
 void adding()
 	 {
	 	for(int y=1;y<m; y++)	
	 {	
	 		int d=n[y];

		for(int v=y+1;v<=m;v++)
	 {
				d=d+n[v];
			 	if(d>1000000)
				break;
			 	int rj=isprime(d);
			 	if(rj==1 && d<1000000)											  //Makes sure the longest cons prime is within million
			 		largest(v-y+1,d);
     }
	 }
	 	System.out.println("The longest consecutive prime within 1 million is :"+x[q]);
	 	System.out.println("The number of consecutive primes added is :"+q);
	 	
 	 }
 
void largest(int r,int e)	
 	 {																		     //To store the largest in x
	 	if(r>q) 
	 {
	 		q=r;
		 	x[q]=e;
	 }
 	 }
	 		
 
int isprime(int a)
	{ 																			 // to check whether prime
		int count=0;
		for(int b=2;b<=a/2;b++)
	{
			if(a%b==0){
			count++;
			break;
			}
	}
		if(count==0) return 1;
		else 		 return 0;
	}	
 																				// main program
public static void main(String args[])
	{
    	LongestConsPrime s=new LongestConsPrime();
        s.prime();
        s.adding();
    	  
    }
    }
