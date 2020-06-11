package com.product.service;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

import com.product.entity.ProductEntity;
import com.product.model.ProductObject;

public interface ProductService {
	
	   public abstract UUID createProduct(ProductObject product);
	   public abstract String updateProduct(ProductObject product);
	   public abstract String deleteProduct(UUID id);
	   public abstract Optional<ProductEntity> getProductById(UUID id);
	
	
}
