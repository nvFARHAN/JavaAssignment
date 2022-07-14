package com.farhan.q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Product> productList = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			Product p = new Product();
			System.out.println("Enter details of product " + (i + 1));
			System.out.println("Enter product Id : ");
			p.setProductId(sc.nextInt());
			sc.nextLine();
			System.out.println("Enter product name : ");
			p.setProductName(sc.nextLine());
			System.out.println("Enter product price : ");
			p.setProductPrice(sc.nextDouble());
			sc.nextLine();
			productList.add(p);
		}
		while (true) {
			System.out.println();
			System.out.println("Enter 1 for sorting the product according to the productPrice");
			System.out.println("Enter 2 for sorting the product according to the productName");
			System.out.println("Enter 3 for sorting the product according to the productId");
			System.out.println("Enter 0 to exit");
			int i = sc.nextInt();
			sc.nextLine();
			if (i == 0)
				break;
			switch (i) {
			case 1:
				Collections.sort(productList, new ProductSortPrice());
				break;
			case 2:
				Collections.sort(productList, new ProductSortName());
				break;
			default:
				Collections.sort(productList, new ProductSortId());
			}
			for (int j = 0; j < 4; j++) {
				System.out.println("===================================");
				System.out.println("Product Id : " + productList.get(j).getProductId());
				System.out.println("Product Name : " + productList.get(j).getProductName());
				System.out.println("Product Price : " + productList.get(j).getProductPrice());
			}
		}
		sc.close();
	}
}
