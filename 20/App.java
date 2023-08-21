
public class App {

	public static void main(String[] args) {
		//Inefficient
		
		String info = "";
		info += "My name is Shovon";
		info += ". ";
		info += "I am Engineer";
		System.out.println(info);
		
		
		//Efficient
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("My name is Borna");
		sb.append(".");
		sb.append("I am a Housewife");
		
		System.out.println(sb.toString());
		
		
		StringBuilder s = new StringBuilder();
		
		s.append("My name is Junaina")
		.append(". ")
		.append("I am a Student");
		
		System.out.println(s.toString());
		
		
		//Formatting//////////////////////////
		
		System.out.print("Junaina is studying in class one.\tShe is my daughter.\nShe speaks good english.");
		System.out.println(" More text");
		
		//Formatting Integers
		
		System.out.printf("Total cost: %-10d and Quantity is %d\n", 5, 120);
		
		//Formating String
		
		for(int i=0; i<20; i++) {
			System.out.printf("%2d: %s\n", i, "Shovon");
		}
		
		//Formatting floating values
		
		System.out.printf("Total Value: %3.3f", 5.6256);
	}	
}
