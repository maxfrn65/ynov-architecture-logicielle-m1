package org.example.microproduct.service;

import org.example.microproduct.dto.ProductDTO;
import org.example.microproduct.exception.ResourceNotFoundException;
import org.example.microproduct.model.Product;
import org.example.microproduct.repository.ProductRepository;
import org.example.microproduct.service.ProductService;
import org.example.microproduct.utils.DTOMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductDTO> getAllProducts() {
        return productRepository.findAll().stream()
                .map(product -> DTOMapper.convertToDTO(product))
                .collect(Collectors.toList());
    }

    @Override
    public ProductDTO addProduct(ProductDTO productDTO) {
        Product product = DTOMapper.convertToEntity(productDTO);
        return DTOMapper.convertToDTO(productRepository.save(product));
    }

   @Override
    public ProductDTO updateProduct(ProductDTO productDTO) {
        Product product = productRepository.findById(productDTO.getId())
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        return DTOMapper.convertToDTO(productRepository.save(product));
    }

   @Override
    public void deleteProduct(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
        productRepository.delete(product);
    }

    @Override
    public Product findById(Long productId) {
        return productRepository.findById(productId)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
    }

    @Override
    public ProductDTO getProductById(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
        return DTOMapper.convertToDTO(product);
    }
}
