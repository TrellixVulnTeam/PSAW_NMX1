package server.com.server.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import server.com.server.entities.Product;
import server.com.server.services.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdminService adminService;

    @PostMapping("/setProductName")
    public ResponseEntity setProductName(@RequestBody Product product, @RequestParam String n)throws Exception{
        Product p=adminService.setName(product,n);
        return new ResponseEntity(p, HttpStatus.OK);
    }
}
