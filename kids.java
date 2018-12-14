import java.io.*;
import java.util.*;

public class kids {
	public static ArrayList<String> names;
	public static ArrayList<Boolean> nice;
	public static ArrayList<Integer> age;

	public void kids() {

	}

	public void importList(ArrayList full) {

		int x = 0, y = 0;
		while (x < full.size()) {
			y++;
			if (y == 1) {
				names.add(full.get(x)); //Collect name
			}
			if (y == 2) {
				if (full.get(x) == "nice") { //Collect nice
				nice.add(true);
				} else nice.add(false);
			}
			if (y == 3) {
				age.add(full.get(x)); //Collect age
				y = 0;
				x++; //Next Index
			}
		}
	}

	public String getName(int i) {
		return names.get(i);
	}
	public boolean getNice(int i) {
		return nice.get(i);
	}
	public int getAge(int i) {
		return age.get(i);
	}
}