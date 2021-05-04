package org.basma.store.controllers;

import org.basma.store.repositories.CategorieRepository;
import org.basma.store.requests.ProductRequest;
import org.basma.store.responses.ProductResponse;
import org.basma.store.services.ProductService;
import org.basma.store.shared.dto.ProductDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products") // localhost:8080/products
public class ProductController {

	@Autowired
	ProductService productService;

	@Autowired
	CategorieRepository categorieRepository;

	@GetMapping(path = "/{id}")
	public ResponseEntity<ProductResponse> getProduct(@PathVariable String id) {

		ProductDto productDto = productService.getProductByProductId(id);

		ProductResponse productResponse = new ProductResponse();

		BeanUtils.copyProperties(productDto, productResponse);

		return new ResponseEntity<ProductResponse>(productResponse, HttpStatus.OK);

	}

	@PostMapping
	public ResponseEntity<ProductResponse> createProduct(@RequestBody ProductRequest productRequest) throws Exception {

		ProductDto productDto = new ProductDto();

		BeanUtils.copyProperties(productRequest, productDto);

		ProductDto createProduct = productService.createProduct(productRequest.getIdCategorie(), productDto);
		System.out.println(productRequest.getIdCategorie());
		ProductResponse productResponse = new ProductResponse();

		BeanUtils.copyProperties(createProduct, productResponse);

		return new ResponseEntity<ProductResponse>(productResponse, HttpStatus.OK);

	}
}
