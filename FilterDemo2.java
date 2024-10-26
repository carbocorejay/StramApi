package BasicFilter;

import java.util.ArrayList;
import java.util.List;

class Product {
	int id;
	String name;
	double price;

	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class FilterDemo2 {

	public static void main(String[] args) {

		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1, "sony", 10000));
		productList.add(new Product(2, "lenevo", 99999));
		productList.add(new Product(3, "ericson", 12000));
		productList.add(new Product(4, "samsung", 22000));
		productList.add(new Product(5, "toshiba", 45000));

		productList.stream().filter(product -> product.price > 25000)
				.forEach(product -> System.out.println(product.price));
	}
}
