package org.example.microproduct.service;

import org.example.microproduct.dto.ProductDTO;
import org.example.microproduct.model.Product;

import java.util.List;

public interface ProductService {

    public List<ProductDTO> getAllProducts();
    public ProductDTO getProductById(Long id);
    public ProductDTO addProduct(ProductDTO product);
    public ProductDTO updateProduct(ProductDTO product);
    public void deleteProduct(Long id);
    Product findById(Long productId);
}
