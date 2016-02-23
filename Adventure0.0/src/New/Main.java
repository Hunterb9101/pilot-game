package New;
import java.util.Scanner;

public class Main {
	static Scanner scan;
	public static void main(String[] args) {
		Player a;
		scan = new Scanner(System.in);
		String action = "";
		while (true) {
			action = scan.nextLine();
		}
	}

	public static void town(String action) {
		if (action.equalsIgnoreCase("Town")) {
			System.out.println("What would you like to do?");
			action = scan.nextLine();
			if (action.equalsIgnoreCase("sell")) {
				// sells things from inventory
				sell();
			}

			if (action.equalsIgnoreCase("buy")) {
				// buys stuff
				buy();
			}
			if (action.equalsIgnoreCase("Sleep")) {
				// restore life
			}
			if (action.equalsIgnoreCase("Bank")) {
				// tells how much gold they have
				// Maybe offer investments
			}
			if (action.equalsIgnoreCase("train")) {
				// Increase their skills for gold
				train();
			}
			else if (action.equalsIgnoreCase("help")) {
				// prints list of commands
			} else if (action.equalsIgnoreCase("equip")) {
				// equips something out of inventory
			}

		}
	}
	public static void woods(){
		
	}
	private static void sell(){
		//sell stuff from inventory
	}
	private static void train() {
		// improves skills
	}

	private static void buy() {
		String type = scan.nextLine();
		if (type.equalsIgnoreCase("Weapons")) {
			// buy weapons
			// check if have enough gold
			// add to inventory
		} else if (type.equalsIgnoreCase("Armor")) {
			// buy armor
			// check if have enough gold
			// add to inventory
		}
	}
}
