package tugaspertemuan1;

import java.util.TreeMap;
import java.util.TreeSet;

public class TugasTreeMap {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> stocks = new TreeMap<>();
		
		stocks.put(5, "Xiaomi");
		stocks.put(10, "Samsung");
		stocks.put(2, "Iphone");
		//System.out.println(stocks.get(5));
		
		for (Integer key : stocks.keySet()) {
			System.out.println("stock of " + stocks.get(key)+ " is " + key);
		}
		
		
		
		TreeSet<String> products = new TreeSet<>(); 
		products.add("Xiaomi");
		products.add("Samsung");
		products.add("Iphone");
		//System.out.println(products);
		
		for (String productname : products) {
			System.out.println(productname);
		}
		
		
	}

}
