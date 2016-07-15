package com.jayturla.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jayturla.form.ProductEntityForm;
import com.jayturla.model.Product;
import com.jayturla.repositories.ProductRepository;
import com.jayturla.service.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepository;
	
	@Override
	public Product findById(int id) {
		return productRepository.findOne(id);
	}

	@Override
	public void saveProduct(ProductEntityForm productEntityForm) {
		Product product = productEntityForm.build();
		productRepository.save(product);
	}

}
