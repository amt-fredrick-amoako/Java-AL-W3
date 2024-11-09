package com.amalitech;

import com.amalitech.models.Clothing;
import com.amalitech.models.Electronic;
import com.amalitech.models.Product;
import com.amalitech.models.ProductBase;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // test accessors with records.
        var product = new Product("Macbook Pro M1", 11_000, "Electronics");
        System.out.println("Product name: " + product.name());
        System.out.println("Product price: " + product.price());
        System.out.println("Product category: " + product.category());

        // test inheritance constraints with sealed classes.
        String macbookDescription = """
                Macbook Pro M1 (2020)
                16gb RAM
                512gb SSD
                """;
        ProductBase macbookPro = new Electronic("MacBook Pro M1", macbookDescription);

        System.out.println("Electronic: " + macbookPro.getName()+ "\nDescription:" + macbookPro.getDescription());

        String nikeCalmDescription = """
                Nike Calm
                Sizes: 42 - 46
                Colors: Navy Green, Black, Grey
                """;
        ProductBase nikeCalm = new Clothing("Nike Calm", nikeCalmDescription);

        System.out.println("Clothing: " + nikeCalm.getName() + "\nDescription:" + nikeCalm.getDescription());

        // new Java features
        nameProductCatalog(nikeCalm);
        nameProductCatalog(macbookPro);

    }

    static ProductBase nameProductCatalog(ProductBase product){
        return switch(product){
            case Electronic e -> {
                System.out.println("Product is an electronic");
                yield e;
            }
            case Clothing c -> {
                System.out.println("Product is a clothing");
                yield c;
            }
            default -> throw new IllegalStateException("Unexpected value: " + product);
        };
    }
}
