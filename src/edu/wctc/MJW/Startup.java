
package edu.wctc.MJW;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
/**
 *
 * @author mitchell
 */
public class Startup {
    
    public static void main(String[] args) {
       DateUtilities util = new DateUtilities();
       
       
//        String date = "2019-04-17";
//        System.out.println(util.convertStringToLocalDateTime(date)); 
        
       // LocalDateTime ate = LocalDateTime.of .of(2017, Month.APRIL, 20, 5);
        LocalDateTime endDate = LocalDateTime.of(2017, Month.APRIL, 14, 12, 18);       
        LocalDateTime startDate = LocalDateTime.of(1995, Month.APRIL, 14, 12, 18); 
       
        
        System.out.println(  util.getDateDiff(startDate,  endDate , ChronoUnit.YEARS) );
     
     
  //   LocalDateTime localDateObj = LocalDateTime.of(2017, Month.MARCH, 18, 7, 10);
    // localDateObj.now();
     
  //   String dateAsStringTest = util.convertDateTimeObjectToString( localDateObj);
 //    System.out.println("Date As String: " + dateAsStringTest);
    
    }
}
