//this is multiple inheritance because we are inheriting more than one interface

class parent{
	public void sing()
		{
		    System.out.println("she is singing");
		}
}
    
	 class child extends parent
	 {
	    
		public void speak() {
			System.out.println("she is speaking");
		}
		public void dance()
		{
			System.out.println("she is dancing");
		}
	
	 
public class parent{

public static void main(String [] args) {
        
	child ch = new child();
	ch.sing();
	ch.speak();
    ch.dance();        
	
}
}
	 }

