package org.example.examproject.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String make;
    private String model;
    private Integer manufactureYear;
    private Double price;
    private String color;
    private String status;

    public String getStatus() {
        return status;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public String getColor() {
        return color;
    }

    public Long getId() {
        return id;
    }

    public int getmanufactureYear() {
        return manufactureYear;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setManufactureYear(int year) {
        this.manufactureYear = year;
    }
}
