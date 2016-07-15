package com.jayturla.service;

import com.jayturla.form.ProductEntityForm;
import com.jayturla.model.Product;

public interface ProductService {
	public Product findById(int id);
	public void saveProduct(ProductEntityForm productEntityForm);
}
