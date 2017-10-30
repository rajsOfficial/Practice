import java.util.*;

public class String_maps {
	public static void main(String args[]) {

		stringcount obj = new stringcount();
		HashMap<String, stringcount> map = new HashMap<>();
		Scanner in = new Scanner(System.in);
		
		boolean m = true;
		do {
			System.out.println("Enter your choice ");
			System.out.println("1.Enter a string\n2.Exit");
			int p = in.nextInt();	
			switch (p) {
			case 1:
			
				System.out.println("Enter the String");
				String n = in.next();

				if (map.containsKey(n)){
					System.out.println("Already present");
					System.out.println(map.get(n));
				}
				else
					obj.count(n);
	
			case 2: 
				System.out.println("Exiting");
				m=false;
			
			}
		} while (m == true);
	}
}

class stringcount {

	public void count(String s) {
		HashMap<Character, Integer> hm = new HashMap<>();

		s = s.toLowerCase().replaceAll("//s", "");
		char[] k = s.toCharArray();
		int count = 0;
		for (int i = 0; i < k.length; i++) {
			count = 0;
			for (int j = 0; j < k.length; j++) {
				if (k[j] == k[i]) {
					count++;
				}
				hm.put(k[i], count);
			}
		}
		System.out.println(hm.entrySet());
	}
}