package Random;

public class Private_constructor {

	public static void main(String args[]) {

		a obj = a.run();
		System.out.println(obj.x);
		a obj1= a.run();
		obj1.x=20;
		System.out.println("OBJ IS "+obj1.x);

	}
}

class a {

	private a() {}

	int x = 10;

	static a run() {
		return  new a();
	}
}
