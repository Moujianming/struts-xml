package com.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.bean.Category;
import com.bean.Product;
import com.opensymphony.xwork2.ActionContext;

public class ProductAction {

	private Product product;
	private List<Product> products;
	
    private List<Category> categories =new ArrayList();
    private String name;

	public String list()
	{
		Category category1 =new Category();
        category1.setId(1);
        category1.setName("category1");
         
        Category category2 =new Category();
        category2.setId(2);
        category2.setName("category2");
         
        categories.add(category1);
        categories.add(category2);
         
        List<Product> products1=new ArrayList();
        Product p1 = new Product();
        p1.setId(1);
        p1.setName("product1");
        Product p2 = new Product();
        p2.setId(2);
        p2.setName("product2");
        Product p3 = new Product();
        p3.setId(3);
        p3.setName("product3");
  
        products1.add(p1);
        products1.add(p2);
        products1.add(p3);
         
        List<Product> products2=new ArrayList();
        Product p4 = new Product();
        p4.setId(4);
        p4.setName("product4");
        Product p5 = new Product();
        p5.setId(5);
        p5.setName("product5");
        Product p6 = new Product();
        p6.setId(6);
        p6.setName("product6");
         
        products2.add(p4);
        products2.add(p5);
        products2.add(p6);
         
        category1.setProducts(products1);
        category2.setProducts(products2);
		
		return "list";
	}
	public String addPage()
	{
		name = "default name";
		return "addPage";
	}
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
	public List<Product> getProducts() {
		System.out.println("get list method");
		return products;
	}
	public void setProducts(List<Product> products) {
		System.out.println("set list method");
		this.products = products;
	}
	public List<Category> getCategories() {
		System.out.println("get category");
		return categories;
	}
	public void setCategories(List<Category> categories) {
		System.out.println("setcategory");
		this.categories = categories;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
