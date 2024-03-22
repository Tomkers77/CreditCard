package pl.tnykiel.ecommerce.catalog;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ProductCatalogTest {

    @Test
    void itAllowsToListAvailableProducts(){
        ProductCatalog catalog = thereIsProductyCatalog();

        List<Product> products = catalog.findAllProducts();

        assertThat(products).hasSize(0);
    }

    private ProductCatalog thereIsProductyCatalog() {
        return new ProductCatalog();
    }
}
