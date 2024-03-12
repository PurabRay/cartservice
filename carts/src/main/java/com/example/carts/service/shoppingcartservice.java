package com.example.carts.service;
import java.util.Map;
import java.util.List;
public interface ShoppingCartService {

    void addProduct(Product product);

    void removeProduct(Product product);

    Map<Product, Integer> getProductsInCart();


    @Service

        private RestTemplate restTemplate = new RestTemplate();
        // Alows to send API requests to any URL

        @Override
        public List<carts> getAllCarts() {
            return null;
        }

        @Override
        public Product getSingleCart(Long id) {

            FakeStoreProductDto fakeStoreProductDto =  restTemplate.getForObject(
                    "https://fakestoreapi.com/products/" + id,
                    FakeStoreProductDto.class
            );

            carts Cart = new carts();
            carts.setId(fakeStoreProductDto.getId());
            return carts;
        }
    }
}

