package com.InvoiceItem.pll;

import com.InvoiceItem.bll.InvoiceItem;

public class TestInvoiceItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InvoiceItem obj1=new InvoiceItem("101","product is good",2,2000);
		System.out.println("---------**--Product Description--**-------------");
		System.out.println("Product ID :" +obj1.getId());
		System.out.println("Product Description :"+obj1.getDesc());
		System.out.println("Product Quantity :"+obj1.getQty());
		System.out.println("Product Unit Price :"+obj1.getUnitPrice());
		//System.out.println("Total Ammount :"obj1.getTotal());
		double b1=obj1.getTotal();
		System.out.println("Total Ammount :"+b1);
		

	}

}
