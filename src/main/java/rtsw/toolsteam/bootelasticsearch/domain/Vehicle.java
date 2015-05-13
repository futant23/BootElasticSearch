/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rtsw.toolsteam.bootelasticsearch.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 *
 * @author 
 */
@Document(indexName = "vehicles", type="vehicle")
public class Vehicle {
    
    @Id
    private String id;
    
    private String make;
    
    private String model;
    
    private Integer year;
    
    private Double cost;
    
    public Vehicle() {}

    public Vehicle(String make, String model, Integer year, Double cost) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.cost = cost;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "make=" + make + ", model=" + model + ", year=" + year + ", cost=" + cost + '}';
    }    
}
