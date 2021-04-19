package server.com.server.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import server.com.server.entities.Product;
import server.com.server.services.ProductService;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;


    @PostMapping("/add")
    public ResponseEntity addProduct(Product p){
        try{
            return new ResponseEntity(productService.addProduct(p),HttpStatus.OK);
        }
        catch(Exception e){
            return new ResponseEntity<>("errore nell'inserimento del prodotto",HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/showAll")
    public ResponseEntity getAll(){
        try{
            return new ResponseEntity(productService.getAllProduct(), HttpStatus.OK);
        }
        catch(Exception e){
            return new ResponseEntity<>("errore nel mostrare prodotti",HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/search")
    public ResponseEntity getProduct(@RequestParam String name){
        try{
            return new ResponseEntity(productService.getProduct(name),HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>("prodotto non trovato",HttpStatus.BAD_REQUEST);
        }
    }



}
