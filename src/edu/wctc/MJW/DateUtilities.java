package edu.wctc.MJW;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Date;

    /**
     * Date Utilities is a Class containing various methods intended to make
     * working with LocalDateTime Objects Easier.
     * @since Java 1.8 
     * <p> 
     *  Change History:
     * <ul>
     * <li>2017-04-18 - Alpha 1.0 </li>
     * </ul>
     * @Author Mitchell Welvang.
     * @version Alpha 1.1 
     */
public class DateUtilities  {
    
    /** 
     * This Method converts a Date Time Object Into A String.
     * @param localDateTime
     * @return LocalDateTime.ToString(); 
     * @throws IllegalArgumentException if localDateTime Object is null
     */
    public String convertDateTimeObjectToString(LocalDateTime localDateTime) throws IllegalArgumentException {
      if(localDateTime == null){
          throw new IllegalArgumentException("localDateTime Cannot Be Null");
      }
     return localDateTime.toString();
    
    }
    
    /** 
     * Converts A String Formatted Into A Local Date Object...Using The Pattern yyyy-mm-dd.
     * Example: 2014-04-18
     * @param date is a String....Formatted using the pattern...Using The Pattern yyyy-mm-dd.
     * @return LocalDate Object 
     * @throws IllegalArgumentException thrown if String date is null or empty. 
     * @throws DateTimeParseException thrown if string is not formatted correctly.
     */
    public LocalDate convertStringToLocalDateTime(String date) throws IllegalArgumentException, DateTimeParseException {
      if(date== null || date.isEmpty() ){
          throw new IllegalArgumentException("Date Cannot Be Null Or Empty");
      } 
        LocalDate localDate = null;
      try{
        localDate = LocalDate.parse(date);
        return localDate;
        
            }catch(DateTimeParseException dTPE){
             dTPE.getMessage();
            }
        return localDate;
    }
    
    
    /**
     * Method gets the difference between between two Local Date Time Objects using a user defined unit time.
     * 
     * Example: You Can Get the difference between April 14 1995 and April 14 2017 in Years.
     * 
     * @param startDateTime - is the start date and time.
     * @param endDateTime - is the end date and time.
     * @param units - ChronoUnit Enumerator. Is The Unit Of Time You want the difference for. (Hours, Min, Seconds).
     * @return 
     */
    public double getDateDiff(LocalDateTime startDateTime, LocalDateTime endDateTime, ChronoUnit units) {

        
     return units.between(startDateTime, endDateTime);  
        }


    
    
}
