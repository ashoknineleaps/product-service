package com.product.resource;



import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




import org.springframework.web.bind.annotation.RestController;

import com.product.model.ProductObject;
import com.product.service.ProductService;

@RestController
public class ProductServiceController {
	
	   @Autowired
	   ProductService productService;

	   @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
	   public ResponseEntity getProductById(@PathVariable("id") UUID id) {
	     return  ResponseEntity.ok(productService.getProductById(id));
	   }
	  
	   @RequestMapping(value = "/updateProduct", method = RequestMethod.PUT)
	   public String updateProduct(@RequestBody ProductObject product) {
	      String message = productService.updateProduct(product);
	      return message;
	   }
	   
	
	   @RequestMapping(value = "/deleteProduct/{id}", method = RequestMethod.DELETE)
	   public String delete(@PathVariable("id") UUID id) {
	      
	       productService.deleteProduct(id);
	      return "ok";
	   }
	 
	   @SuppressWarnings("rawtypes")
	   @RequestMapping(value = "/createProduct", method = RequestMethod.POST)
	   public ResponseEntity createProduct(@RequestBody ProductObject product) {
	      return ResponseEntity.ok(productService.createProduct(product));
	   }

}
