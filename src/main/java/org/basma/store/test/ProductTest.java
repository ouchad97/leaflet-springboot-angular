package org.basma.store.test;

import org.basma.store.services.ProductService;
import org.basma.store.shared.dto.ProductDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductTest {

	@Autowired
	ProductService productService;

//	@Test
//	public void addProduct() { 
//		 ProductDto productDto = new ProductDto("hixxi", "hii", 11.3, 11);
//		 productService.createProduct(1, productDto);
//	}

//	@Test
//	public void getProduct() {
//		ProductDto productDto = productService.getProduct("hixxi");
//		System.out.println("////// "+productDto.getTitleProduct()+" //////");
//	}

	@Test
	public void updateProduct() {
		ProductDto prodDto = new ProductDto();
		ProductDto productDto = productService.updateProduct("KfTfLyQMAdjVrH01AUoWlBZojIhIgtWo", prodDto);
		productDto.setTitleProduct("rrrrr"); 
		System.out.println("////// " + productDto.getTitleProduct() + " //////");
	}
}
