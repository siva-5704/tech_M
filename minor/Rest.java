package minor;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
public  class Rest {
	 HashMap<String,Integer>menu = null;
     
	 Rest() {
		menu = new HashMap<String,Integer>();
		menu.put("poori",50);
		menu.put("idly",50);
		menu.put("vada",50);
		menu.put("dosa",50);
		menu.put("upma",50);
		}
	void dismenu()
	{
		System.out.println("food items are :>");
		Set<String>food=menu.keySet();
		for(String f : food)
		{
			System.out.println(f + "   " + menu.get(f));
		}
	}
	boolean addItem(String iname , int price)
	{
		if(menu.containsKey(iname)) {
		System.out.println("item already present ");
		return false;
		}
		else
		{
			menu.put(iname, price);
			System.out.println("item added successfully");
			return true;
		}
	}
	
}