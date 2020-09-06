package com.promotion.demo;

public class ItemA implements PromotionEngine {

	public int productCount;
	
	
	public int getProductCount() {
		return productCount;
	}


	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}


	@Override
	public int calculate(boolean isPromotionApplicable) {

		return 130 * (productCount / 3) + 50 * (productCount % 3);
	}

}
