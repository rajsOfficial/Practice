import java.util.*;

public class TryBlock {	static Integer x;	
	public void run(){
		System.out.println(x);
	}
	
class Raj{
	void run(){
		System.out.println(x);
	}
}
	public static void main(String args[]){
		 TryBlock obj=new TryBlock();
		obj.run();
		
		//String a=new String(x);
		
		//System.out.println("sad"+x);
}}