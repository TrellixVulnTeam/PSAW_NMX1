package server.com.server.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.com.server.repositories.UserRepository;
import server.com.server.entities.Users;
import server.com.server.utils.exception.EmailAlreadyExistException;

import javax.transaction.Transactional;

@Service
public class AccountingService {

    @Autowired
    private UserRepository userRepository;


    @Transactional
    public Users registerUser(Users users) throws Exception {
        /*
            TODO controlli su i dati inseriti
         */
        if(userRepository.existsByEmail(users.getEmail())){
            throw new EmailAlreadyExistException();
        }
        return userRepository.save(users);
    }
}
