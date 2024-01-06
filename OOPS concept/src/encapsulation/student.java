package encapsulation;

public class student {
	private int rollnumber;
	private	String name;
	private	boolean isAttend;
	
	public student(int rollnumber) {
		this.rollnumber = rollnumber;
	
		
	}
	public void setstudentAttend(boolean present) {
	//	if(!isAttend)
		
		isAttend = present;
		System.out.println("teacher assinged attendence");
	}
	public boolean getstudentAttend() {
		System.out.println("teacher acessed student");
		return isAttend;
		
		
	}

}
