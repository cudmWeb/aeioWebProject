package demo.cdcm.service;

import demo.cdcm.model.DropDownValues;
import demo.cdcm.model.DropDowns;
import demo.cdcm.repository.DropDownRepository;
import demo.cdcm.response.DropDownResponseData;
import jakarta.persistence.EntityManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DropDownService {

    private static final Logger LOG = LoggerFactory.getLogger(DropDownService.class);

    @Autowired
    private DropDownRepository dropDownRepository;
    public List<DropDownResponseData> geAllDropDownData() {

        List<DropDownResponseData> dropDownResponseDataList = new ArrayList<>();

        List<DropDowns> dropDownsList = getDropDownMetaData();

        dropDownsList.forEach( d -> {
            DropDownResponseData dropDownResponseData = new DropDownResponseData();

            dropDownResponseData.setDropDownName(d.getDropDownName());
            dropDownResponseData.setDropDownValues
                    (d.getDropDownValues().stream()
                            .map(DropDownValues::getDropDownValue)
                            .collect(Collectors.toList()));
            dropDownResponseDataList.add(dropDownResponseData);
        });

        return dropDownResponseDataList;
    }

    private List<DropDowns> getDropDownMetaData() {
        return dropDownRepository.findAll();
    }
}
