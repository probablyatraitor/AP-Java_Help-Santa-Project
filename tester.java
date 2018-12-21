import java.io.*;
import java.util.*;

public class tester {
    public static void main(String[] args)throws Exception {
		List<Gift> gifts = new ArrayList<Gift>(); //Stores every gift
		File txt = new File("gifts.txt");
		Scanner file = new Scanner(txt);

		String name; int min, max, days; double price;
		while (file.hasNext()) {
			name = file.nextLine();
			min = Integer.valueOf(file.nextLine());
			max = Integer.valueOf(file.nextLine());
			price = Double.valueOf(file.nextLine());
			days = Integer.valueOf(file.nextLine());
			gifts.add(new Gift(name, min, max, price, days));
		}
		Collections.sort(gifts, new SortbyPrice());
		/*=============================================================
			Gift methods:
			.getName()		String
			.getMinAge()	int
			.getMaxAge()	int
			.getPrice()		double
			.getDays()		int
			---------------
			Use as follows:
			gifts.get(x).getName()
		==============================================================*/

		ArrayList<Kid> kids = new ArrayList<Kid>(); //Stores every Kid
		txt = new File("kids.txt");
		file.useDelimiter(", "); //Seperates name, naughty/nice, and age into seperate scans

		int age; name = null; String nice;
		while (file.hasNext()) {
			name = file.nextLine();
			nice = file.nextLine();
			age = file.nextInt();
			if (nice.equals("naughty")) continue;  //discards listings with "naughty"
			else {
				kids.add(new Kid(name, age));
			}
		}
		Collections.sort(kids, new SortbyAge());
		/*=============================================================
			Kid methods:
			.getName()		String
			.getAge()		int
			---------------
			Use as follows:
			kids.get(x).getName()
		==============================================================*/
		file.close();



		Scanner user = new Scanner(System.in);
		System.out.print("Enter maximum budget: $");
		double budget = user.nextDouble();
		System.out.print("\nEnter maximum amount of days to work: ");
		int daysWork = user.nextInt();
		user.close();

		//I have no clue what to do next
	}
}