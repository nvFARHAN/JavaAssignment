package com.farhan.q1;

import java.util.Comparator;

public class ProductSortName implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getProductName().compareTo(o2.getProductName());
	}

}
