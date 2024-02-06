package productDetails.service;

import java.util.List;
import org.springframework.stereotype.Service;
import productDetails.ProductDetailsDto;

@Service
public interface ProductDetailsService {
    ProductDetailsDto saveProduct(ProductDetailsDto product);

    List<ProductDetailsDto> getAllProducts();

    ProductDetailsDto getProduct(int pid);

    List<ProductDetailsDto> productsOfProductDetails(int prodId);
}
