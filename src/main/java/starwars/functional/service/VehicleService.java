package starwars.functional.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import starwars.functional.client.SWWebClient;
import starwars.functional.domain.AllVehicleResponse;


@Service
public class VehicleService {

private final SWWebClient swWebClient;


    @Autowired
    public VehicleService( SWWebClient swWebClient) {
        this.swWebClient = swWebClient;
    }


    public Flux<AllVehicleResponse> getAllVehicles(){
        return this.swWebClient.getAllVehiclesUsingRetrieve();
    }



}
