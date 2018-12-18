//Paolo Lara
package java.util;
import java.util.ArrayList;

public class Gifts {
		public static ArrayList<String> giftName = new ArrayList<String>();
		public static ArrayList<Integer> minAge = new ArrayList<Integer>();
		public static ArrayList<Double> price = new ArrayList<Double>();
		public static ArrayList<Integer> maxAge = new ArrayList<Integer>();
		public static ArrayList<Integer> daysToMake = new ArrayList<Integer>();
		
		public Gifts(ArrayList<String> giftNameX, ArrayList<Integer> minAgeX, ArrayList<Double> priceX, ArrayList<Integer> maxAgeX, ArrayList<Integer> daysToMakeX)
		{
			giftName = giftNameX;
			minAge =minAgeX;
			price = priceX;
			maxAge = maxAgeX;
			daysToMake = daysToMakeX;
	}
	
	public String getGiftName(int i)
	{
		return giftName.get(i);
		
	}
	public int getMinAge(int i)
	{
		return  minAge.get(i);
	}
	public double getPrice(int i)
	{
		return  price.get(i);
	}
	public int getMaxAge(int i)
	{
		return  maxAge.get(i);
	}
	public int getDaysToMake(int i)
	{
		return  daysToMake.get(i);
		
	}

}
