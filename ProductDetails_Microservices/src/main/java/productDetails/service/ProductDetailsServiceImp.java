package productDetails.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import productDetails.ProductDetailsDto;

@Service
public class ProductDetailsServiceImp implements ProductDetailsService {

    private final ProductDetailsRepository productDetailsRepository;

    @Autowired
    public ProductDetailsServiceImp(ProductDetailsRepository productDetailsRepository) {
        this.productDetailsRepository = productDetailsRepository;
    }

    @Override
    public ProductDetailsDto saveProduct(ProductDetailsDto product) {
        return productDetailsRepository.save(product);
    }

    @Override
    public List<ProductDetailsDto> getAllProducts() {
        return productDetailsRepository.findAll();
    }

    @Override
    public ProductDetailsDto getProduct(int pid) {
        return productDetailsRepository.findById(pid).orElseThrow(() -> new RuntimeException());
    }

    @Override
    public List<ProductDetailsDto> productsOfProductDetails(int prodId) {
        return productDetailsRepository.findByProdId(prodId);
    }
}
