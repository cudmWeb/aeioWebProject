package demo.cdcm.request;

import lombok.Data;

@Data
public class UpdateStatusRequest {
    private int id;
    private String customerId;
    private String status;
    private String comments;
}
