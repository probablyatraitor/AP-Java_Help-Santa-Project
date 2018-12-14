import java.io.*;
import java.util.*;

public class kids {
	public static ArrayList<String> names;
	public static ArrayList<Boolean> nice;
	public static ArrayList<Integer> age;
	public static ArrayList<String> GoodKids = new ArrayList<String>();
	public static ArrayList<String> BadKids = new ArrayList<String>();

	public kids(ArrayList<String> namesX, ArrayList<Boolean> niceX, ArrayList<Integer> ageX) {
		names = namesX;
		nice = niceX;
		age = ageX;
	}

	public void seperate() {
		for (int x = 0; x < names.size(); x++) {
			if (nice.get(x)) {
				GoodKids.add(names.get(x));
			} else {
				BadKids.add(names.get(x));
			}
		}
	}

	public String getName(int i) {
		return names.get(i);
	}
	public ArrayList<String> getName() {
		return names;
	}
	public boolean getNice(int i) {
		return nice.get(i);
	}
	public ArrayList<Boolean> getNice() {
		return nice;
	}
	public int getAge(int i) {
		return age.get(i);
	}
	public ArrayList<Integer> getAge() {
		return age;
	}
	public String getGood(int i) {
		return GoodKids.get(i);
	}
	public ArrayList<String> getGood() {
		return GoodKids;
	}
	public String getBad(int i) {
		return BadKids.get(i);
	}
	public ArrayList<String> getBad() {
		return BadKids;
	}
}