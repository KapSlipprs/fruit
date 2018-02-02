
//	Put the students' names in the group here

import java.util.*;

{
	public static void main (String [] args)
	{
		ArrayList<String> fruitPantry = new ArrayList<String> (14);
		fruitPantry = fillBasket();
		System.out.println(fruitPantry);

	}

	public static ArrayList<String> fillBasket()
	{
		ArrayList<String> fruits = new ArrayList<String>(14);
		fruits.add("Banana");  fruits.add("Strawberries"); fruits.add("Peach");
		fruits.add("Banana"); fruits.add("Grapes"); fruits.add("Cherries");
		fruits.add("Strawberries"); fruits.add("Pineapple"); fruits.add("Grapes");
		fruits.add("Banana"); fruits.add("Kiwi");  fruits.add("Strawberries");
		fruits.add("Banana");  fruits.add("Pear");

		return  fruits;
	}
}