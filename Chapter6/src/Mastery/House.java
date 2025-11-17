package Mastery;

public class House {

	public static void main(String[] args) 
	{
		addRoof();
        addBase();
        addWalk();

	}



	public static void addRoof() {
		 System.out.println("    ^");
		 System.out.println("   / \\");
		 System.out.println("  /   \\");
		 System.out.println(" -------");
	}

	public static void addBase() {
		 System.out.println(" |     |");
		 System.out.println(" |     |");
		 System.out.println(" |_____|");
		 
	}

	public static void addWalk() {
		 System.out.println("   **");
		 System.out.println("   *********");
	}
}
//screendump
//    ^
//   / \
//  /   \
// -------
// |     |
// |     |
// |_____|
//   **
//   *********

