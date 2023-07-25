package demo.cdcm.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CustomerBaseDataDTO {

    private int id;

    private String customerId;

    @JsonProperty("fullName")
    private String customerName;

    @JsonProperty("firstName")
    private String forename1;

    @JsonProperty("lastName")
    private String surname;

    private String status;

    @JsonProperty("lastUpdateAt")
    private String updatedAt;
}
