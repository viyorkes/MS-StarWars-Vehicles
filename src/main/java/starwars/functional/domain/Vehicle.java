package starwars.functional.domain;



import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
    @Id
    private
    Long id;
    @JsonProperty("cargo_capacity")
    private
    String cargoCapacity;
    private String consumables;
    @JsonProperty("cost_in_credits")
    private
    String costInCredits;
    private LocalDateTime created;
    private String crew;
    private LocalDateTime edited;
    private String length;
    private String manufacturer;
    @JsonProperty("max_atmosphering_speed")
    private
    String maxAtmospheringSpeed;
    private String model;
    private String name;
    private String passengers;
    private
    List<String> pilots;
    private
    List<String> films;
    private String url;
    @JsonProperty("vehicle_class")
    private
    String vehicleClass;
}   