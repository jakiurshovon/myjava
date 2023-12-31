class Frog {
	private int id;
	private String name;
	
	public Frog(int id, String name){
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return String.format("%-2d: %s", id, name);
		/*		
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		return sb.toString();
		*/
	}
}

public class App {

	public static void main(String[] args) {
		Frog frog1 = new Frog(7, "Rubi");
		Frog frog2 = new Frog(10, "Juli");

		System.out.println(frog1);
		System.out.println(frog2);
	}
}