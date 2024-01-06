package inheritence;

public class Admin extends Developer{
	
	public void manage() {
		super.read();
		wright();
		
		System.out.println("manage code");
	}
	public void read() {
		System.out.println("Read code");
		
	}
	
}
