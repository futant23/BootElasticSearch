/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rtsw.toolsteam.bootelasticsearch.domain;

import java.util.List;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 *
 * @author 
 */
public interface VehicleRepository extends ElasticsearchRepository<Vehicle, Long>{
    
    public List<Vehicle> findByMake(String make);
    public List<Vehicle> findByModel(String model);
    public List<Vehicle> findByYear(Integer year);
    public List<Vehicle> findByYearBetween(Integer start, Integer end);
    public List<Vehicle> findByCostBetween(Double start, Double end);
}
