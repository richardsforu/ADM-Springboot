package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao prodDao;

	@Transactional
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return prodDao.save(product);
	}

	@Transactional
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return prodDao.findAll();
	}

	@Transactional
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return prodDao.findById(id);
	}

	@Transactional
	public List<Product> findProductsByName(String name) {
		// TODO Auto-generated method stub
		return prodDao.findProductsByName(name);
	}

	@Transactional
	public void delete(int id) {
		prodDao.delete(id);

	}

	@Transactional
	public Product update(Product product) {
		// TODO Auto-generated method stub
		return prodDao.update(product);
	}

}
