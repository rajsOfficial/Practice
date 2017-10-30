package String;

public class Split {

	public static void main(String args[]){
		
		String a = "hello everyone have a nice day";
		for(String x : a.split("\\s")){
			System.out.println(x);
		}
	}
}
