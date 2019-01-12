/*************************************************************************************
Contributors:
	Paolo Lara, John Lux, Sam Noggle, Brian Kiss

Crates object for gifts.txt data
Sorts object instances by price

Class
*************************************************************************************/

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

	public String getGiftName() {
		return name;
	}
	public int getMinAge() {
		return  min;
	}
	public double getPrice() {
		return  price;
	}
	public int getMaxAge() {
		return  max;
	}
	public int getDays() {
		return  days;
	}
	public String toString() {
		return ("Name: " + name + "\nMin: " + min + "\nMax: " + max + "\nPrice: " + "\nDays: " + price + "\n");
	}
}

class SortbyPrice implements Comparator<Gift>
{
    public int compare(Gift a, Gift b)
    {
        return Double.compare(b.price, a.price);
    }
}