class P
 
{
 
public void m1() {
	System.out.println("Method 1 in class p");
}
 
}
 
class C extends P
 
{
 
public void m2() {
	System.out.println("Method 2 in class c");

}
 
}
 
class Is_A
 
{
 
public static void main (String [] args)
 
{
 
//case 1
 
P  p = new P();
 
p.m1();   // compiles fine
 
p.m2();  // Will get a compile time error as "Cannot find m2()"
 
//case 2
 
/*C c = new C();
 
c.m1();   // compiles fine
 
c.m2();  // compiles fine
 
//case 3*/
 
P  p1 = new C();
 
p1.m1();   // compiles fine
 
p1.m2();  // Will get a compile time error as "Cannot find m2()"
 
//case 4
 
C c = (C) new P(); // Compiler error as "incompatible types"
 
}
 
}