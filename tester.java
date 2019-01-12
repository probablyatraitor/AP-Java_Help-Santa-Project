
/*************************************************************************************
Contributors:
	Paolo Lara, John Lux, Sam Noggle, Brian Kiss



Testing Driver
Classes:
	Kid.class
	SortbyAge.class
	SortbyPrice.class
	Gift.class
*************************************************************************************/

import java.io.*;
import java.util.*;

public class tester {

	Integer x = 3;
	int y = 3;
    public static void main(String[] args)throws Exception {
		// Collect Gifts ***************************************************
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


		// Collect Kids **************************************************************************
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


		// Collect User specs ************************************************************************
		Scanner user = new Scanner(System.in);
		System.out.print("Enter maximum budget: $");
		double budget = user.nextDouble();
		System.out.print("\nEnter maximum amount of days to work: ");
		int daysWork = user.nextInt();
		user.close();

		System.out.println(gifts);
		//I have no clue what to do next
		int ageT;
		double priceT; int minT, maxT;
		for (int x = 0; x < kids.size(); x++) {
			ageT = kids.get(x).getAge();
			priceT = gifts.get(x).getPrice();
			maxT = gifts.get(x).getMaxAge();
			minT = gifts.get(x).getMinAge();
			if (ageT > minT && ageT < maxT) { //Check if age range is valid
				System.out.println(kids.get(x).getName() + "\t" + gifts.get(x).getGiftName());
			}
		}
	}
}