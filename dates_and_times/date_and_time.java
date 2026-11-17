package dates_and_times;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class date_and_time {
    public static void main(String[] args) {
                // How to work with DATES & TIMES using Java
                // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)

               LocalDateTime time = LocalDateTime.now();
                Instant instant = Instant.now();
                System.out.println(instant);
                
                //Custom format

                /* LocalDateTime dateTime = LocalDateTime.now();

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
                String newDateTime = dateTime.format(formatter);
                System.out.println(newDateTime); */

                /* LocalDate date = LocalDate.of(2024, 12, 25) */;
                
                LocalDateTime date1 = LocalDateTime.of(2025,12,25,12,0,0);
                LocalDateTime date2 = LocalDateTime.of(2025,1,1,0,0,0);

                if(date1.isBefore(date2))
                {
                    System.out.println(date1 + " is earlier than " + date2);
                }

                else if(date1.isAfter(date2)){
                    System.out.println(date1 + " is later than " + date2);
                }

                else if(date1.isEqual(date2)){
                    System.out.println(date1 + " is equal to " + date2);
                }
                
                
    }   
}
