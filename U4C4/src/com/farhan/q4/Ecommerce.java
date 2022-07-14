package com.farhan.q4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ecommerce {
	List<Product> productList = new ArrayList<>();

	void addProductToList(Product product) {
		Set<Product> productSet = new HashSet<>(productList);
		if (productSet.add(product)) {
			productList.add(product);
			System.out.println("product added successfully");
		} else {
			for (Product p : productList) {
				if (p.equals(product))
					p.count += product.count;
			}
			System.out.println("Count updated Product already exists");
		}
	}

	List<Product> showAllProduct() {
//		for (Product p : productList) {
//			System.out.println(p);
//		}
		return productList;
	}
}
