import java.util.*;
import java.io.*;

public class SeparateKids
{
	public static void main(String[] args) throws IOException
	{
		SeparateTheKids();
	}
	public static void SeparateTheKids()throws IOException
	{
		ArrayList<String> kids = new ArrayList<String>();
		ArrayList<String> GoodKids = new ArrayList<String>();
		ArrayList<String> BadKids = new ArrayList<String>();
		Scanner r = new Scanner(new File("kids.txt"));

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

}





