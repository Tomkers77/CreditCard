package pl.tnykiel.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.tnykiel.ecommerce.catalog.ProductCatalog;

@SpringBootApplication
public class App {
    public static void main(String[] args){
        System.out.println("Here we go!!!");
        SpringApplication.run(App.class, args);
    }

    @Bean
    ProductCatalog CreateMyProductCatalog(){
        var catalog = new ProductCatalog();
        catalog.createProduct("Lego Set", "Nice one");
        catalog.createProduct("Cobi Set", "Nice one");
        return catalog;
    }
}
