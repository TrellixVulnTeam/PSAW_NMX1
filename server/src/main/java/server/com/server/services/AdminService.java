package server.com.server.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.com.server.entities.Product;
import server.com.server.repositories.ProductRepository;
import server.com.server.repositories.UserRepository;
import server.com.server.utils.exception.ProductNotExistException;

@Service
public class AdminService {


    @Autowired
    ProductRepository productRepository;

    @Autowired
    UserRepository userRepository;

    public Product setName(Product product,String name)throws ProductNotExistException {
        if(productRepository.existsByName(product.getName())) {
            product.setName(name);
            return productRepository.save(product);
        }
        else{
            throw new ProductNotExistException();
        }
    }
}
