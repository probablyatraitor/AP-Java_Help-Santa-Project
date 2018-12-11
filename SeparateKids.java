import java.util.*;
import java.io.*;

public class SeparateKids
{

	public static ArrayList<String> kids = new ArrayList<String>();
	public static ArrayList<String> GoodKids = new ArrayList<String>();
	public static ArrayList<String> BadKids = new ArrayList<String>();
	Scanner r;

	public void SeparateTheKids()
	{

		r = new Scanner("kids.txt");

		while(r.hasNext())
		{
			String list = r.nextLine();
			if(list.contains("naughty"))
			{
				BadKids.add(list);
			}
			else
			{
				GoodKids.add(list);
			}


		}
		for(int i = 0; i < BadKids.size(); i++)
		{
			System.out.println(BadKids.get(i));

		}
		for(int y = 0; y < GoodKids.size(); y++)
		{
			System.out.println(GoodKids.get(y));
		}

	}
	public ArrayList getBad() {
		return BadKids;
	}
	public ArrayList getGood() {
		return GoodKids;
	}

}





