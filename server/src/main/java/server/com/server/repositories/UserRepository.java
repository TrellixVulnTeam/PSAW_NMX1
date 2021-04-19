package server.com.server.repositories;


import server.com.server.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users,Integer> {
    List<Users> findByFirstName(String firstName);
    List<Users> findByLastName(String lastName);
    boolean existsByEmail(String email);
}
