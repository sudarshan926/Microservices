package product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import product.dto.ProductDto;
import product.repository.ProductRepository;

@Service
public class ProductServiceImp implements Productservice {

	
	private ProductRepository productRepository;
	
	
	public ProductServiceImp(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public ProductDto SaveProduct(ProductDto  p2) {
		
		return productRepository.save(p2);
	}

	@Override
	public List<ProductDto> GetAllProduct() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public ProductDto GetProduct( int id) {
		return productRepository.findById(id).orElseThrow(()->new RuntimeException());
	}

	
	
	
	


}
