package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortDate1 {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("10/20/2052");
        al.add("05/26/1960");
        al.add("05/06/1943");
        al.add("06/06/1933");
        al.add("01/06/1963");

        String[] str = new String[al.size()];

        for (int i = 0; i < al.size(); i++) {
            str[i] = al.get(i);
        }

        String sortedDates = "";
        sortedDates = Arrays.stream(
//                new String[] { "10-20-2052" , "05-26-1960" , "05-06-1943" , "06-06-1933" , "01-06-1963" }
                str
        )
                .map( input -> LocalDate.parse( input , DateTimeFormatter.ofPattern( "MM/dd/yyyy" , Locale.US ) ) )
                .sorted()
                .map( date -> date.format( DateTimeFormatter.ofPattern( "MM/dd/yyyy" , Locale.US ) ) )
                .collect( Collectors.toList() ).toString();


sortedDates = sortedDates.replace("[","");
sortedDates = sortedDates.replace("]","");
sortedDates = sortedDates.replace(" ","");
String [] sortedDatesArr = sortedDates.split(",");
//Arrays.sort(sortedDatesArr, Collections.reverseOrder());
for (String date : sortedDatesArr){
    System.out.println(date);
}
int decIndex = 0;
String [] decending = new String[sortedDatesArr.length];
for (int i = sortedDatesArr.length-1; i >= 0; i--){
//    System.out.println(sortedDatesArr[i]);
    decending[decIndex] = sortedDatesArr[i];
    decIndex++;
}
        System.out.println("okay");
for (String date : decending){
            System.out.println(date);
        }

    }
}
