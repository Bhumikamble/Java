import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.*;

// public class LocalTime1 {

//     public static void main(String[] args) {

//         //for printing the LocalTime
//         LocalTime now=LocalTime.now();
//         System.out.println(now);

//         LocalTime customTime=LocalTime.of(11,32,45);
//         System.out.println(customTime);

//         LocalTime par=LocalTime.parse("12:23:45");
//         System.out.println(par);


//         //for printing date and time together use LocalDateTime
//         LocalDateTime now1 =LocalDateTime.now();
//         System.out.println(now1);

//         LocalDateTime customDate=LocalDateTime.parse("2026-10-26T13:48");
//         System.out.println(customDate);


//         //for printing ZonedDateTime
//         ZonedDateTime now2 = ZonedDateTime.now();
//         System.out.println(now2);

//         Set<String>availableZones=ZoneId.getAvailableZoneIds();
//         availableZones.forEach(System.out::println);
//     }
    
// }



//the user will enter the zone id and the time of that particular zone will get printed

public class ZoneExplorer{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        //this prints all the available zones         
        Set<String>availableZones=ZoneId.getAvailableZoneIds();
        System.out.println("Available time zones: ");
        availableZones.forEach(System.out::println);

        System.out.println("Enter the ZoneId: ");
        String zoneInput=sc.nextLine();

        try{
            ZoneId zone =ZoneId.of(zoneInput);
            ZonedDateTime currentTime = ZonedDateTime.now(zone);
            System.out.println("Time zone: "+ zone);
            System.out.println("Current date and time: " +currentTime);

        }
        catch(java.time.DateTimeException e){
            System.out.println("Invalid time zone! Please enter valid time zone id.");
        }

    }
}