package starwars.functional.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import starwars.functional.domain.VehicleResponse;
import starwars.functional.service.VehicleService;

import java.util.List;

@RestController
public class VehicleController {
    @Autowired
    VehicleService vehicleService;

    @Autowired
    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }


    @GetMapping("/retrieve/vehicles")
    @ResponseStatus(HttpStatus.OK)
    public Mono<List<VehicleResponse>> getAllVehicles() {
        return this.vehicleService.getAllVehicles();
    }


    @GetMapping("/retrieve/vehicles/names")
    @ResponseStatus(HttpStatus.OK)
    public Mono<List<String>> getAllVehiclesNames() {
        return this.vehicleService.getAllVehiclesNames();
    }





}
