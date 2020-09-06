package com.promotion.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.promotion.demo.Cart;
import com.promotion.demo.model.Product;

/**
 * Test class to run  promotion-engine against various discounts scenarios  
 * @author Saenjeev Rai
 * 
 *
 */

public class PromotionEngineTest {

	
	/**
	 * Given:- Item A,B & C have been added into cart.
	 * When:- Promotion is applicable on any of given Items.
	 * Then:- expected price should be equal to actual price.
	 */
	
	@Test
	public void givenDiscountWhenProductIsABC() {
		String[] SKUs = {"A","B","C"};
		int given = 100;
		List<Product> items = new ArrayList<Product>();
		for (String s : SKUs) {
			items.add(new Product(s));
		}
		Cart cart = new Cart();
		cart.addToCart(items);
		assertEquals(cart.calculate(false), given);
	}
	
	/**
	 * Given:- Item A,B & C have been added into cart.
	 * When:- Promotion is applicable on any of given Items.
	 * Then:- expected price should be equal to actual price.
	 */
	
	@Test
	public void givenDiscountWhenProductIsAAAAABBBBBC() {
		String[] SKUs = {"A","A","A","A","A","B","B","B","B","B","C"};
		int given = 370;
		List<Product> items = new ArrayList<Product>();
		for (String s : SKUs) {
			items.add(new Product(s));
		}
		Cart cart = new Cart();
		cart.addToCart(items);
		assertEquals(cart.calculate(false), given);
	}
	
	/**
	 * Given:- Item A,B & C have been added into cart.
	 * When:- Promotion is applicable on any of given Items.
	 * Then:- expected price should be equal to actual price.
	 */
	
	@Test
	public void givenDiscountWhenProductIsAAABBBBBCD() {
		String[] SKUs = {"A","A","A","B","B","B","B","B","C","D"};
		int given = 280;
		List<Product> items = new ArrayList<Product>();
		for (String s : SKUs) {
			items.add(new Product(s));
		}
		Cart cart = new Cart();
		cart.addToCart(items);
		assertEquals(cart.calculate(false), given);
	}
	
	/**
	 * Given:- Item A,B & C have been added into cart.
	 * When:- Promotion is applicable on any of given Items.
	 * Then:- expected price should be equal to actual price.
	 */
	@Test
	public void givenDiscountOnProductCOnly() {
		String[] SKUs = {"C"};
		int given = 20;
		List<Product> items = new ArrayList<Product>();
		for (String s : SKUs) {
			items.add(new Product(s));
		}
		Cart cart = new Cart();
		cart.addToCart(items);
		assertEquals(cart.calculate(false), given);
	}
	
	@Test
	public void givenDiscountOnProductDOnly() {
		String[] SKUs = {"D"};
		int given = 15;
		List<Product> items = new ArrayList<Product>();
		for (String s : SKUs) {
			items.add(new Product(s));
		}
		Cart cart = new Cart();
		cart.addToCart(items);
		assertEquals(cart.calculate(false), given);
	}
	
	/**
	 * Given:- Item C & D have been added into cart.
	 * When:- Promotion is applicable on any of given Items.
	 * Then:- expected price should be equal to actual price.
	 */
	@Test
	public void givenDiscountOnProductCAndDOnly() {
		String[] SKUs = {"C","D"};
		int given = 30;
		List<Product> items = new ArrayList<Product>();
		for (String s : SKUs) {
			items.add(new Product(s));
		}
		Cart cart = new Cart();
		cart.addToCart(items);
		assertEquals(cart.calculate(false), given);
	}
}
