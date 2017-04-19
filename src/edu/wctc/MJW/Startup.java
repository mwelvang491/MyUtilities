/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.MJW;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;
/**
 *
 * @author mitchell
 */
public class Startup {
    
    public static void main(String[] args) {
       DateUtilities util = new DateUtilities();
       
     String date = "2016-09-21";
     System.out.println( util.convertStringToLocalDateTime(date));
     
     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
     
     
     LocalDateTime localDateObj = LocalDateTime.of(2017, Month.MARCH, 18, 7, 10);
    // localDateObj.now();
     
     String dateAsStringTest = util.convertDateTimeObjectToString( localDateObj);
     System.out.println("Date As String: " + dateAsStringTest);
    
    }
}
