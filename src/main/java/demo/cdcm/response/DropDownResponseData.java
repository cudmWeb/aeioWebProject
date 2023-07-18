package demo.cdcm.response;

import demo.cdcm.dto.DropDownValuesData;
import lombok.Data;

import java.util.List;

@Data
public class DropDownResponseData {

    private String dropDownName;
    private List<String> dropDownValues;

}
