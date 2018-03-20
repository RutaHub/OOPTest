package net.accenture.prebootcamp.oop;

public class PolymorDemo {

	public static void main (String...strings) {
		
		Human human = new Female ();
		human.specTest();
		
		
		
		Parent parent =new Parent ();
		Parent child =new Child ();
		Parent grandson =new Grandson();	
	parent.sleep();
	child.sleep();
	grandson.sleep();
	
	}
	
	
	
	
}
