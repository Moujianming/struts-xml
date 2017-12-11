package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.bean.Product;

public class ProductAction {

	private Product product;

	public String show()
	{
		HttpServletRequest request = ServletActionContext.getRequest();
        HttpServletResponse response = ServletActionContext.getResponse();
 
        System.out.println("request:\t" + request);
        System.out.println("response:\t" + response);
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
