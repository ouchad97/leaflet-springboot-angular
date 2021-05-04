package org.basma.store.repositories;

import org.basma.store.entities.ProductEntity; 
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductEntity, Long>{
	
	ProductEntity findByProductId(String titleProduct);
	
	ProductEntity findByTitleProduct(String titleProduct);
}