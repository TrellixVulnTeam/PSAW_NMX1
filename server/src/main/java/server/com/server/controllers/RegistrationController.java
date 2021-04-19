package server.com.server.controllers;



import server.com.server.entities.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import server.com.server.services.AccountingService;

@RestController
@RequestMapping("/users")
public class RegistrationController {

    @Autowired
    private AccountingService accountingService;

    @PostMapping("/add")
    public ResponseEntity create(@RequestBody Users users){
        try{
            Users added=accountingService.registerUser(users);
            return new ResponseEntity(added, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>("errore", HttpStatus.BAD_REQUEST);
        }
    }



}
