package demoproject;

public class Test 
{
	public void m1()
	{
		System.out.println("m1-Method");
	}
	public void m2()
	{
		System.out.println("m2-Method");
	}
	public String m3()
	{
		return "java";
	}
   public static void main(String[] args) 
   {
	   Test t = new Test();
	   t.m1();
	   t.m2();
	   t.m3();
}
}
