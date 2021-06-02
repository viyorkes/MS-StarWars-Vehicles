package starwars.functional.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import starwars.functional.client.SWWebClient;
import starwars.functional.domain.AllVehicleResponse;
import starwars.functional.domain.VehicleResponse;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class VehicleService {

    private final SWWebClient swWebClient;


    @Autowired
    public VehicleService(SWWebClient swWebClient) {
        this.swWebClient = swWebClient;
    }

    public Mono<List<VehicleResponse>> getAllVehicles() {
        return this.swWebClient.getAllVehiclesUsingRetrieve()
                .map(AllVehicleResponse::getResults);
    }


    public Mono<List<String>> getAllVehiclesNames() {
        return this.swWebClient.getAllVehiclesNames()
                .map(AllVehicleResponse::getResults)
                .map(p->p.stream().map(VehicleResponse::getName).collect(Collectors.toList()));
    }
    }
