import java.io.*;
import java.util.*;

public class driver {
    public static void main(String[] args)throws Exception {
		/*Gifts:
		Name
		Min Age
		Max Age
		Price
		Days to Make*/
		Scanner sKids = new Scanner("kids.txt");
		sKids.useDelimiter(", ");
		Scanner sGifts = new Scanner("gifts.txt");
		Scanner user = new Scanner(System.in);
		ArrayList<String> KidsNames = new ArrayList<String>();
		ArrayList<Boolean> KidsNice = new ArrayList<Boolean>();
		ArrayList<Integer> KidsAge = new ArrayList<Integer>();
		int x = 0, y = 0;
		while (sKids.hasNext()) {
			y++;
			if (y == 1) {
				KidsNames.add(sKids.nextLine()); //Collect name
			}
			if (y == 2) {
				if (sKids.nextLine() == "nice") { //Collect nice
				KidsNice.add(true);
				} else KidsNice.add(false);
			}
			if (y == 3) {
				KidsAge.add(sKids.nextInt()); //Collect age
				y = 0;
				x++; //Next Line
			}
		}


    }
}