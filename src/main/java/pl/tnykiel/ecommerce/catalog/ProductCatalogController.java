package pl.tnykiel.ecommerce.catalog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class ProductCatalogController {

    ProductCatalog productCatalog;

    public ProductCatalogController(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    @GetMapping("/api/hello")
    String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/api/names")
    List<String> getNames(){
        return Arrays.asList(
                "Tomek",
                "Arek",
                "Aga");
    }

    @GetMapping("/api/products")
    List<Product> getProducts(){
        return productCatalog.findAllProducts();
    }
}
