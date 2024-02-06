package productDetails.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import productDetails.ProductDetailsDto;
import productDetails.service.ProductDetailsService;

@RestController
@RequestMapping("/productDetails")
public class ProductDetailsController {

    private final ProductDetailsService productService;

    @Autowired
    public ProductDetailsController(ProductDetailsService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ProductDetailsDto saveProductController(@RequestBody ProductDetailsDto product) {
        return productService.saveProduct(product);
    }

    @GetMapping
    public List<ProductDetailsDto> getAllProductController() {
        return productService.getAllProducts();
    }

    @GetMapping("/{pid}")
    public ProductDetailsDto getProductController(@PathVariable int pid) {
        return productService.getProduct(pid);
    }

    @GetMapping("/prod/{prodId}")
    public List<ProductDetailsDto> prodAndProductDetails(@PathVariable int prodId) {
        return productService.productsOfProductDetails(prodId);
    }
}
