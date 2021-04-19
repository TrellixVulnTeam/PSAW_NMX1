package server.com.server.repositories;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import server.com.server.entities.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    Product findByName(String name);
    boolean existsByName(String name);
    List<Product> findAll();
}
