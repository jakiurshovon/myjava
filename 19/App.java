
class Thing{
	public final static int LUCKY_NUMBER = 7;
	public String name;
	public static String description;
	
	public static int count = 0;
	
	public int id;
	
	public Thing() {
		id = count;
		count++;
	}
	
	public void showName() {
		System.out.println("Object id: " + id + "," + description + " :" + name);
	}
	
	public static void showInfo() {
		System.out.println(description);
		//won't work: System.out.println(name);
	}
}


public class App {

	public static void main(String[] args) {
		
		Thing.description = "I am a thing";
		
		Thing.showInfo();
		
		System.out.println("Before craeting object, count is: " + Thing.count);
		
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		System.out.println("After craeting object, count is: " + Thing.count);
		
		thing1.name = "jakiur";
		thing2.name = "borna";
		
		thing1.showName();
		thing2.showName();
		
		//System.out.println(Math.PI);
		
		//System.out.println(Thing.LUCKY_NUMBER);
		
		

	}

}
