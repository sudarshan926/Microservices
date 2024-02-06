package productDetails.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import productDetails.ProductDetailsDto;



public interface ProductDetailsRepository extends JpaRepository<ProductDetailsDto, Integer> {
    List<ProductDetailsDto> findByProdId(int prodId);
}
