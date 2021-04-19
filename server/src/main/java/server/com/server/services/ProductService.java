package server.com.server.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.com.server.entities.Product;
import server.com.server.repositories.ProductRepository;

import org.springframework.transaction.annotation.Transactional;
import server.com.server.utils.exception.ProductNotExistException;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Product addProduct(Product p){
        return productRepository.save(p);
    }

    @Transactional(readOnly=true)
    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Product getProduct(String name)throws ProductNotExistException {
        try{return productRepository.findByName(name);}
        catch (Exception e){
            throw new ProductNotExistException();
        }
    }


}
