package starwars.functional.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import starwars.functional.domain.AllVehicleResponse;
import starwars.functional.service.VehicleService;

@RestController
public class VehicleController {

    private final VehicleService vehicleService;

    @Autowired
    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }


    @GetMapping("/retrieve/vehicles")
    @ResponseStatus(HttpStatus.OK)
    public Mono<AllVehicleResponse> getAllVehicles() {
        return this.vehicleService.getAllVehicles();
    }

}
