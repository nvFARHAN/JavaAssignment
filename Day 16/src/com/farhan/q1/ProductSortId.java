package com.farhan.q1;

import java.util.Comparator;

public class ProductSortId implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getProductId() > o2.getProductId() ? +1 : -1;
	}
}
