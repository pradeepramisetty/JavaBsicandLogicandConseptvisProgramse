package oopsBasedPrograms;

public  class Tiger implements Animal {
	
	public  int a = 220;
	
	public void eat() {
		System.out.println("eating tiger");	
	}
	public void sleep() {
		System.out.println("sleeping tiger");		
	}
	public  void hunting() {
		System.out.println("hunting tiger");
	}
	public static void main(String[] args) {
		Animal a1 = new Tiger();
		a1.hunting();
		a1.eat();
		a1.sleep();
	}
	
	

}
