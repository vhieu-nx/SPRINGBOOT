package com.altasbookshop;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    private  long id;
    private  String name;
    private  String brand;
    private String madein;
    private  Float price;

    public Product() {
        //super();
    }

    public long getId() {
        return id;
    }


    //Add annotation for the ID from JPA to indicate that this matches the priamry column in the database
    // Next - GenetateValue annotation from JPA

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMadein() {
        return madein;
    }

    public void setMadein(String madein) {
        this.madein = madein;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
