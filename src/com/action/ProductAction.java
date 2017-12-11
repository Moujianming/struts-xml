package com.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.bean.Product;
import com.opensymphony.xwork2.ActionContext;

public class ProductAction {

	private Product product;

	public String show()
	{
		HttpServletRequest request = ServletActionContext.getRequest();
        HttpServletResponse response = ServletActionContext.getResponse();
 
        System.out.println("request:\t" + request);
        System.out.println("response:\t" + response);
		product = new Product();
		product.setName("iphoneX");
		return "show";
	}
	public String add()
	{
		Map m = ActionContext.getContext().getSession();
		m.put("name", product.getName());
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
