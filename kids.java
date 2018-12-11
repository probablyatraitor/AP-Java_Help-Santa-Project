import java.io.*;
import java.util.*;

public class kids {
	Scanner s;
	public static String names[];
	public static boolean nice[];
	public static int age[];


	public void kids () {
		s = new Scanner("kids.txt");
		s.useDelimiter(", ");
		int x = 0, y = 0;
		while (s.hasNext()) {
			y++;
			if (y == 1) {
				names[x] = s.nextLine(); //Collect name
			}
			if (y == 2) {
				if (s.nextLine() == "nice") { //Collect nice
				nice[x] = true;
				} else nice[x] = false;
			}
			if (y == 3) {
				age[x] = s.nextInt(); //Collect age
				y = 0;
				x++; //Next Index
			}
		}
		s.close();
	}

	public String getName(int i) {
		return names[i];
	}
	public boolean getNice(int i) {
		return nice[i];
	}
	public int getAge(int i) {
		return age[i];
	}
}