import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetime_convert {
    public static void main(String[] args) {
        String dateStr = "2022-03-17 10:45:30";

        //Formats the string into year, month, date, hour, minute, second
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        //sets the dateObj to the current date and time
        LocalDateTime dateObj = LocalDateTime.parse(dateStr, formatter);

        //formats the date into the proper format
        String formattedDate = dateObj.format(DateTimeFormatter.ofPattern("mm/dd/yyyy HH:mm:ss"));

        System.out.println(formattedDate);
    }
}
