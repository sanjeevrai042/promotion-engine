package com.promotion.demo;

public class ItemC implements PromotionEngine {

	public int productCount;
	
	
	@Override
	public int calculate(boolean isPromotionApplicable) {
		if(isPromotionApplicable)
			return productCount=0;
		return productCount * 20;
	}
	
	public int getProductCount() {
		return productCount;
	}


	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

}
