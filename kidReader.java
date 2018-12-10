import java.io.BufferedReader;
import java.io.FileReader;

public class kidReader
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader reader = new BufferedReader(new FileReader("kids.txt"));
		String line = null;

		while ((line = reader.readLine()) != null)
			{
			String[] values = line.split(",");	//splits text by each comma and displays in list.
			for (String str : values)
			{
				System.out.println(str);
			}
		}
		reader.close();
	}
}