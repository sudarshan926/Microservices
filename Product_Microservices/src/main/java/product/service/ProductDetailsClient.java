package product.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import product.dto.ProductDetails;

@FeignClient(url= "http://localhost:8082" , value="Product_detailsValue")
public interface ProductDetailsClient {
	
	@GetMapping("/productDetails/prod/{prodId}")
	List<ProductDetails> getProductDetailsList(@PathVariable int prodId);
}
