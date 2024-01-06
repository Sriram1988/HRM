package Polymorphism;

public class Overload {
	public void add(int a,int b) {
		//to use the adding
	}
	public void add(int a,int b,int c) {
		// to use the adding
	}
	public static void main(String[] args) {
		Overload c = new Overload();
		c.add(12, 0);
		c.add(12, 11, 11);
	
	}

}
