package java8features;

public class TestMethodReferences {
	
	public static void m1() {
		System.out.println("m1 in A interface our class static method");
	}
	public void m2(int a,String s) {
		System.out.println("m2 in interface our class non-static method,,"+a+".."+s);
	}
	public int m4(int a,int b,int c) {
		int d = a+b+c;
		System.out.println("WELCOME IS INt RETURN TYPE METHD and pass int args");
		return d;
	}
	public String m5() {
		//System.out.println("WELCOME is string RETURN TYPE METHD");
		return "wecome it is string return-type";
	}
	public static void main(String[] args) {
		
		//using static method reference
		A a1 = TestMethodReferences::m1;
		a1.m1();
		
		//non-static method reference
		TestMethodReferences t1 = new TestMethodReferences();
		B b1 = t1::m2;
		b1.m2(20, "welcome Success");
		
		//accessing constructor reference
		C c1 = MessageDtls::new;
		c1.m3();
		
		D d1 = t1::m4;
		System.out.println(d1.m4(23, 45,2));
		
		E e1 = t1::m5;
		System.out.println(e1.m5());
	}
}
