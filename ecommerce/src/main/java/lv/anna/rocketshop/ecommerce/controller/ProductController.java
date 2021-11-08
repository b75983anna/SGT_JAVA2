package lv.anna.rocketshop.ecommerce.controller;

import lv.anna.rocketshop.ecommerce.model.Product;
import lv.anna.rocketshop.ecommerce.service.ProductService;
import com.sun.istack.NotNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = { "", "/" })
    public @NotNull
    Iterable<Product> getProducts() {
        return productService.getAllProducts();
    }
}
