import java.io.BufferedReader;
import java.io.FileReader;

public class giftsReader
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader reader = new BufferedReader(new FileReader("gifts.txt"));
		String line = null;

		while ((line = reader.readLine()) != null)
		{
			String[] values = line.split(" ");	//splits text file by each line and displays in list.
			for (String str : values)
			{
				System.out.println(str);
			}
		}
		reader.close();
	}
}