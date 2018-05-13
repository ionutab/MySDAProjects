package emp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmpUtils {

    public static final String DEFAULT_APP_DATE_FORMAT_PATTER = "dd/MM/yyyy";

    public static final DateFormat DEFAULT_APP_DATE_FORMAT = new SimpleDateFormat(DEFAULT_APP_DATE_FORMAT_PATTER);

    public static String format(Date date){
        if(date != null){
            return EmpUtils.DEFAULT_APP_DATE_FORMAT.format(date);
        } else {
            return "the beginning of time";
        }
    }

}
