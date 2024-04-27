package pl.tnykiel.ecommerce.catalog;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ProductCatalogTest {

    @Test
    void itAllowsToListAvailableProducts(){
        ProductCatalog catalog = thereIsProductCatalog();

        List<Product> products = catalog.findAllProducts();

        assertThat(products).hasSize(0);
    }

    @Test
    void itAllowsToAddProduct(){
        ProductCatalog catalog = thereIsProductCatalog();
        catalog.createProduct("Lego set 8083", "nice one");

        List<Product> products = catalog.findAllProducts();

        assertThat(products).hasSize(1);
    }

    @Test
    void itAllowsToLoadProductDetails(){
        ProductCatalog catalog = thereIsProductCatalog();
        String id = catalog.createProduct("Lego set 8083", "nice one");

        Product loaded = catalog.getProductDetails(id);

        assertThat(loaded.getName()).isEqualTo("Lego set 8083");
    }

    @Test
    void itChangePriceForProduct(){
        ProductCatalog catalog = thereIsProductCatalog();
        String id = catalog.createProduct("Lego set 8083", "nice one");

        catalog.changePrice(id, BigDecimal.valueOf(10.10));
        Product loaded = catalog.getProductDetails(id);

        assertThat(loaded.getPrice()).isEqualTo(BigDecimal.valueOf(10.10));
    }


    private ProductCatalog thereIsProductCatalog() {
        return new ProductCatalog();
    }
}
