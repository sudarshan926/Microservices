package product.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import product.dto.ProductDto;
import product.service.ProductServiceImp;

@RestController
@RequestMapping("/product")
public class ProductController {

	private ProductServiceImp imp;

	public ProductController(ProductServiceImp imp) {
		super();
		this.imp = imp;
	}

	@PostMapping
	public ProductDto SaveProductController(@RequestBody ProductDto p) {
		return imp.SaveProduct(p);
	}

	@GetMapping
	public List<ProductDto> GetAllProductController() {

		return imp.GetAllProduct();

	}

	@GetMapping("/{id}")
	public ProductDto GetProductController(@PathVariable int id) {
		return imp.GetProduct(id);

	}

}
