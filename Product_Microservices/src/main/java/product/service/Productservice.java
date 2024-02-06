package product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import product.dto.ProductDto;
@Service
public interface Productservice {

	public ProductDto SaveProduct( ProductDto p);
	
	public List<ProductDto>GetAllProduct();
	
	public ProductDto GetProduct(int id);
	
	}
