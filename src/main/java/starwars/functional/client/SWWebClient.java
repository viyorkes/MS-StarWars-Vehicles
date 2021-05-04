package starwars.functional.client;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import starwars.functional.domain.AllVehicleResponse;


@Component
public class SWWebClient {

    private WebClient webClient = WebClient.create("https://swapi.dev/api/");

    public Flux<AllVehicleResponse> getAllVehiclesUsingRetrieve(){
        return webClient
                .get()
                .uri("vehicles/")
                .retrieve()
                .bodyToFlux(AllVehicleResponse.class);

    }


}
