/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.MJW;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

    /**
     * Date Utilities is a Class containing various methods intended to make
     * working with LocalDateTime Objects more streamlined.
     * 
     *  Change History:
     * <ul>
     * <li>2017-04-18 - Alpha 1.0 </li>
     * </ul>
     * @Author Mitchell Welvang.
     * @version Alpha 1. 
     */
public class DateUtilities  {
    
    /** 
     * This Method converts a Date Time Object Into A String. Using Local Date Times toString Method. 
     * @param localDateTime
     * @return LocalDateTime.ToString(); 
     * @throws IllegalArgumentException if localDateTime Object is null
     */
    public String convertDateTimeObjectToString(LocalDateTime localDateTime) throws IllegalArgumentException {
      if(localDateTime == null){
          throw new IllegalArgumentException("localDateTime Cannot Be Null");
      }
     return localDateTime.toString();}
    
    /** 
     * This Method converts A String ...(Not Sure How To Describe String date)... Into A Local Date Object. 
     * @param String date
     * @return LocalDate Object 
     * @throws IllegalArgumentException thrown if String date is null or empty. 
     */
    public LocalDate convertStringToLocalDateTime(String date){
      if(date== null || date.isEmpty() ){
          throw new IllegalArgumentException("Date Cannont Be Null Or Empty");
      } 
     LocalDate localDate = LocalDate.parse(date);
     
        return localDate;
        }


    
    
}
