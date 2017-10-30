import java.util.*;

public class jb_class {

	public static void main(String args[]){
		String x=new String();
		int i=10;
		long b=43234;
		jb obj=new jb();
		Scanner in = new Scanner(System.in);
		obj.setname(in.nextLine());
		System.out.println(obj.getname());
		
	}
}

class jb{
	private String name= new String();
	private int id;
	private long phno;
	public void setname(String name) {		this.name=name;		}
	public String getname() {		return name;	}
}
