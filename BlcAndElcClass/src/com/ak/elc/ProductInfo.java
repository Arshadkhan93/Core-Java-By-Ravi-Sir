package com.ak.elc;

import com.ak.blc.Product;

public class ProductInfo {
	public static void main(String[] args) {
		Product p = new Product();
		p.setProductData(101, "Mobile", 19999.0);
		p.getProductInfo();
	}
}
