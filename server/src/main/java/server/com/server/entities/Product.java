package server.com.server.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="product")
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    private int id;

    @Column(name="name",nullable = false,unique = true)
    private String name;

    @Column(name="price",nullable = false)
    private double price;

    @Column(name="quantity",nullable = false)
    private int quantity;


    @Column(name="description")
    private String description;

    @Version
    @Column(name="version",nullable = false)
    @JsonIgnore
    private int version;
}
