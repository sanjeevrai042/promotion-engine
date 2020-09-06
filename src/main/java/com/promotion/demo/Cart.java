package com.promotion.demo;

import java.util.Arrays;
import java.util.List;

import com.promotion.demo.model.Product;

public class Cart implements PromotionEngine {
	
	ItemA a = new ItemA();
	ItemB b = new ItemB();
	ItemC c = new ItemC();
	ItemD d = new ItemD();
	
	@Override
	public int calculate(boolean isPromotionApplicable) {
		List<PromotionEngine> items = Arrays.asList(a,b,c,d);
		if(c.getProductCount()==1 && d.getProductCount()==1) {
			return items.stream().map(i->i.calculate(true)).reduce(0,(a,b)->a+b);
		}
		return items.stream().map(i->i.calculate(isPromotionApplicable)).reduce(0,(a,b)->a+b);
	}
	
	public void addToCart(List<Product> items) {
		for (Product p : items) {
			switch (p.getType()) {
			case "A":
				a.productCount++;
				break;
			case "B":
				b.productCount++;
				break;
			case "C":
				c.productCount++;
				break;
			case "D":
				d.productCount++;
				break;
			default:
				throw new IllegalArgumentException("Item not available");

			}
		}
	}

}
