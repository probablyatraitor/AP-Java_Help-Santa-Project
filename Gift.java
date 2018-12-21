import java.io.*;
import java.util.*;

public class Gift {
		String name;
		int min;
		int max;
		double price;
		int days;

	public Gift(String giftNameX, int minAgeX, int maxAgeX, double priceX, int daysToMakeX) {
		name = giftNameX;
		min = minAgeX;
		price = priceX;
		max = maxAgeX;
		days = daysToMakeX;
	}

	public String getGiftName(int i) {
		return name;
	}
	public int getMinAge(int i) {
		return  min;
	}
	public double getPrice(int i) {
		return  price;
	}
	public int getMaxAge(int i) {
		return  max;
	}
	public int getDays(int i) {
		return  days;
	}

}

class SortbyPrice implements Comparator<Gift>
{
    // Used for sorting in ascending order of
    // roll name
    public int compare(Gift a, Gift b)
    {
        return Double.compare(b.price, a.price);
    }
}