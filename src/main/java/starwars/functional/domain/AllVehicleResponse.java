package starwars.functional.domain;


import com.fasterxml.jackson.annotation.JsonAutoDetect;
import java.util.List;

@JsonAutoDetect
public class AllVehicleResponse {

    private Integer count;
    private String next;
    private String previous;
    private List<VehicleResponse> results;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }


    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<VehicleResponse> getResults() {
        return this.results;
    }

    public void setResults(List<VehicleResponse> results) {
        this.results = results;
    }



    @Override
    public String toString() {
        return "AllVehicleResponse{" +
                "count=" + count +
                ", next='" + next + '\'' +
                ", previous='" + previous + '\'' +
                ", results=" + results +
                '}';
    }


}