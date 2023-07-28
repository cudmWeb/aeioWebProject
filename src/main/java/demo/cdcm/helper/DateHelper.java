package demo.cdcm.helper;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

@Component
public class DateHelper {

    public Date getDateFromString(String dateString) throws ParseException {

        if (dateString.isBlank()) return null;

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        try {
            return formatter.parse(dateString);
        } catch (ParseException e) {
            Date dateNow = new Date();
            return formatter.parse(formatter.format(dateNow));
        }
    }

    public Date getDOBFromString(String dateString) throws ParseException {

        if (dateString.isBlank()) return null;

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        try {
            return formatter.parse(dateString);
        } catch (ParseException e) {
            Date dateNow = new Date();
            return formatter.parse(formatter.format(dateNow));
        }
    }

}
