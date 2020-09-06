package com.promotion.demo;

public class ItemD implements PromotionEngine {

	public int productCount;
	
	@Override
	public int calculate(boolean isPromotionApplicable) {
		if(isPromotionApplicable)
			return productCount=30;
		
		return productCount * 15;
	}
	
	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}
}
