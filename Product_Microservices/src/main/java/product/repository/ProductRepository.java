package product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import product.dto.ProductDto;

public interface ProductRepository  extends JpaRepository<ProductDto, Integer>{

	
}
