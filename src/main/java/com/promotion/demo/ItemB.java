package com.promotion.demo;

public class ItemB implements PromotionEngine {

	public int productCount;
	
	
	@Override
	public int calculate(boolean isPromotionApplicable) {
			return  45 * (productCount / 2) + 30 *(productCount % 2);
	}
	
	public int getProductCount() {
		return productCount;
	}


	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

}
