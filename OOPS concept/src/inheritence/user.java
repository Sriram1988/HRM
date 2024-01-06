package inheritence;

public class user implements iAdmin{

	public static void main(String[] args) {
	guest gue = new guest();
	gue.read();
	
	
	Developer dev = new Developer();
	dev.wright();
	
   Admin adm = new Admin();
   adm.read();
   adm.wright();
   adm.manage(); 
	

	
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void wright() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void manage() {
		// TODO Auto-generated method stub
		
	}
	
}
