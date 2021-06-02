package starwars.functional.client;


import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import starwars.functional.domain.AllVehicleResponse;


@Component
public class SWWebClient {

    private WebClient webClient = WebClient.create("https://swapi.dev/api/");

    public Mono<AllVehicleResponse> getAllVehiclesUsingRetrieve() {

            return webClient
                    .get()
                    .uri("vehicles/")
                    .retrieve()
                    .bodyToMono(AllVehicleResponse.class);

        }

    public Mono<AllVehicleResponse> getAllVehiclesNames() {
        return webClient
                .get()
                .uri("vehicles/")
                .retrieve()
                .bodyToMono(AllVehicleResponse.class);

    }

    }






