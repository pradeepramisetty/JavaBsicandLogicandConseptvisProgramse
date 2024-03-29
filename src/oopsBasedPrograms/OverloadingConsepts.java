package oopsBasedPrograms;
class A{
    int y = m1();
	
	{
		System.out.println("Non-static block in A");
	}
	
	int m1() {
		System.out.println("m1 method in A");
		return 10;
	}
}
public class OverloadingConsepts extends A{
	
	int x = m1();
	
	{
		System.out.println("Non-static block");
	}
	
	int m1() {
		System.out.println("m1 method....");
		return 10;
	}

	public OverloadingConsepts() {
		this(10);
		x = 20;
		System.out.println("no-arg constructor");
	}
	
    public OverloadingConsepts(int a) {
		this("abc");
		x = 50;
		System.out.println("integer constructor");
	}
    
    public OverloadingConsepts(String s) {
		
		System.out.println("string constructor");
	}
    public static void main(String[] args) {
    	OverloadingConsepts o1 = new OverloadingConsepts();
    	System.out.println("o1.x.."+o1.x);
    	System.out.println("o1.x.."+o1.y);
    }
}
