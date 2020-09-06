package com.promotion.demo;

import com.promotion.demo.model.Product;

public enum ItemTypeEnum {

	A {

		@Override
		public Product getInstance(String id) {
			return new Product(id);
		}

	},
	B {

		@Override
		public Product getInstance(String id) {
			return new Product(id);
		}

	},
	C {

		@Override
		public Product getInstance(String id) {
			return new Product(id);
		}

	},
	D {

		@Override
		public Product getInstance(String id) {
			return new Product(id);
		}

	};

	public abstract Product getInstance(String id);
}
