/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rtsw.toolsteam.bootelasticsearch.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rtsw.toolsteam.bootelasticsearch.domain.Vehicle;
import rtsw.toolsteam.bootelasticsearch.domain.VehicleRepository;

/**
 *
 * @author 
 */
@Service
public class VehicleService {
    private static final Logger log =LoggerFactory.getLogger(VehicleService.class);
    
    @Autowired
    private VehicleRepository repository;
    
    public List<Vehicle> getByMake(String make) {
        return repository.findByMake(make);
    }
    
    public List<Vehicle> getByModel(String model) {
        return repository.findByModel(model);
    }
    
     public List<Vehicle> getByYear(Integer year) {
         return repository.findByYear(year);
     }
     
     public List<Vehicle> findByYearBetween(Integer start, Integer end) {
         return repository.findByYearBetween(start, end);
     }
     
     public List<Vehicle> getByCostBetween(Double start, Double end) {
         return repository.findByCostBetween(start, end);
     }
     
     public void addVehicle(Vehicle vehicle) {
         repository.save(vehicle);
     }
}
