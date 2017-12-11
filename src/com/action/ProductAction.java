package com.action;

import com.bean.Product;

public class ProductAction {

	private Product product;

	public String show()
	{
		product = new Product();
		product.setName("iphone");
		return "show";
	}
	public String add()
	{
		System.out.println("product.name:"+product.getName());
		return "show";
	}
	public Product getProduct() {
		System.out.println("getProduct method");
		return product;
	}

	public void setProduct(Product product) {
		System.out.println("setProduct method");
		this.product = product;
	}
	
}
