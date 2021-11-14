// Conditionals in java
public class Switch {
	public static void main(String[] args) {
		String fruit = "Mango";
		int day = 2;
		switch (fruit){
			// here break; not required
			case "Mango" -> System.out.println(1);
			//case "Mango" -> System.out.println("King of fruits");
			default -> System.out.println("pleasee enter a valid input");
		}
		switch (day) {
			case 1, 2, 3, 4, 5 -> System.out.println("weekday");
			case 6, 7 -> System.out.println("weekend");

		}
		// Nested 
		switch(day){
			case 1 :
				System.out.println("day 1");
				break;
			case 2 -> {
				System.out.println("day 2 and");
					switch (fruit) {
					case "Mango" -> System.out.println("day 2 Mango");
				}
			}
			// case 2 :
			// 	System.out.println("day 2 and");
			// 	switch(fruit){
			// 		case "Mango":
			// 			System.out.print("day 2 Mango");
				}
		}
	}
}