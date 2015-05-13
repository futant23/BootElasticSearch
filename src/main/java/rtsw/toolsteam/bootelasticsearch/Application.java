/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rtsw.toolsteam.bootelasticsearch;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import rtsw.toolsteam.bootelasticsearch.domain.Vehicle;
import rtsw.toolsteam.bootelasticsearch.service.VehicleService;

/**
 *
 * @author 
 */
@SpringBootApplication
public class Application implements CommandLineRunner{
    
    private static final Logger log =LoggerFactory.getLogger(Application.class);
    
    @Autowired
    private VehicleService service;
    
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override public void run(String... strings) throws Exception {
        log.info("run()");
        
        /*
        Lets create some vehicles to test against
        */
        Vehicle v1 =new Vehicle("Toyota", "Avalon", 2007, 12000.00);
        service.addVehicle(v1);
        
        Vehicle v2 =new Vehicle("Toyota", "Sienna", 2013, 26000.00);
        service.addVehicle(v2);
        
        List<Vehicle> makes =service.getByMake("Toyota");
        log.info("Toyota makes found: "+makes);
        
        List<Vehicle> models =service.getByModel("Avalon");
        log.info("Avalon models found: "+models);
    }
}
