
public class SubString {
		String n= new String();
		String[] x= new String[100];
		String ans=new String();
		int z=0;
		
	void substring(String a){												//Obtain all the non repeating element and store it in a string 
		
		for(int q=0;q<a.length();q++){
			n=a.substring(q,q+1);

		for(int k=q+1;k<a.length();k++){
			String b=a.substring(k,k+1);
			if(!n.contains(b))
				n=n+b;
			else{
			break;
				}															//Storing all the non-repeating substrings in string x
			}
		x[q]=n;
		int e=x[q].length();												//Check and store the largest element in ans 
		
		if(e>z){
			z=e;
		ans=x[q];
		}
		
		}
		System.out.println(z);
		System.out.println(ans);
	}
		
/*public void largest(){
		int d=x.length;
		for(int r=0;r<d;r++){
			int z=0;
			if(x[r].length()>z)
				z=x[r].length();
			w=r;
		}
		System.out.println(x[w]);
}
	*/
	
public static void main(String args[]){
		String s ="abcabcdabcdefghijaklmaaaamnoppqrstuvvwxyz";
		SubString b= new SubString();
		b.substring(s);
		
	}
	
}
