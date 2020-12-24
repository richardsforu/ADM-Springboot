package com.cts.product.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.product.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	
	@Autowired
	private SessionFactory sf;

	// save product
	public Product save(Product product) {
		if (product != null) {
			sf.getCurrentSession().save(product);
		}
		return product;
	}

	// list all products
	public List<Product> findAll() {
		return sf.getCurrentSession().createQuery("from Product").getResultList();
	}

	// find by id
	public Product findById(int id) {
		return sf.getCurrentSession().find(Product.class, id);
	}

	// Finding all Products By Name
	public List<Product> findProductsByName(String name) {
		return sf.getCurrentSession().createQuery("from Product as prod where prod.name like " + name).getResultList();
	}

	// Delete Product
	public void delete(int id) {
		sf.getCurrentSession().delete(findById(id));
	}

	// update product
	public Product update(Product product) {
		sf.getCurrentSession().saveOrUpdate(product);
		return product;
	}

}
