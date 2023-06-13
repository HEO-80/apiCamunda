package com.sms.carm.controller;

import java.util.ArrayList;
import java.util.List;
import com.sms.carm.model.Product;
import javassist.NotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    List<Product> productList = new ArrayList<>();

    public ProductController(){
        productList.add(new Product(1L, "Contratos", 10.99));
        productList.add(new Product(2L, "Servicios", 20.99));
        productList.add(new Product(3L, "Documentos", 30.99));
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productList;
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Long id) throws NotFoundException {
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        throw new NotFoundException("No se encontró el producto con ID: " + id);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        // Lógica para crear un nuevo producto

        System.out.println("Nuevo producto: " + product.toString());
        productList.add(product);
        return product;
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) throws NotFoundException {
        for (Product existingProduct : productList) {
            if (existingProduct.getId().equals(id)) {
                existingProduct.setName(product.getName());
                existingProduct.setPrice(product.getPrice());
                return existingProduct;
            }
        }
        throw new NotFoundException("No se encontró el producto con ID: " + id);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) throws NotFoundException {
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                productList.remove(product);
                return;
            }
        }
        throw new NotFoundException("No se encontró el producto con ID: " + id);
    }
}
