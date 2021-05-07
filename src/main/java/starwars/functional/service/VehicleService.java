package starwars.functional.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import starwars.functional.client.SWWebClient;
import starwars.functional.domain.AllVehicleResponse;



@Service
public class VehicleService {

private final SWWebClient swWebClient;


    @Autowired
    public VehicleService( SWWebClient swWebClient) {
        this.swWebClient = swWebClient;
    }

    public Mono<AllVehicleResponse>  getAllVehicles(){
        return this.swWebClient.getAllVehiclesUsingRetrieve();
    }

}
