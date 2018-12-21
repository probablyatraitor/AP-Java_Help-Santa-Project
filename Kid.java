import java.io.*;
import java.lang.*;
import java.util.*;

public class Kid{
	String name;
	int age;

	/*===========================================================================
		Kid listings labeled naughty should not be entered in here
		Assume all Kid objects are nice
	===========================================================================*/
	public Kid (String x, int y) {
		name = x;
		age = y;
	}

	public String toString() {
		return (name + " " + age);
	}

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

}

class SortbyAge implements Comparator<Kid>
{
    // Used for sorting in ascending order of
    // roll name
    public int compare(Kid a, Kid b)
    {
        return Double.compare(a.age, b.age);
    }
}