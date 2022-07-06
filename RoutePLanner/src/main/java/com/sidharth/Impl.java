package com.sidharth;
import java.util.Scanner;

public class Impl
{

    public static void main(String[] args)
    {
        RouteTask routeTask = new RouteTask();
        Routes[] routes= routeTask.getInformation();


        SearchFlight searchFlight = new SearchFlight(routes);
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("please Enter the source City");
        String searchCity= scanner.next();

        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        System.out.println("----------------------------------------Avalable flights -----------------------------------------------");
        Routes [] availableFlights = searchFlight.searchflight(routes,searchCity);
        for (int i =0; i< availableFlights.length;i++){
            System.out.println(availableFlights[i]);
        }


        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("------------------------------------------Flight--------------------------------------------------------");
        searchFlight.sortDirectFlights(availableFlights);
        for(int i=0;i< availableFlights.length;i++){
            System.out.println(availableFlights[i]);
        }

        System.out.println();
        System.out.println("please Enter the Destination City");
        String destination= scanner.next();
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("-----------------------------------Available Direct Flights---------------------------------------------");
        System.out.println();
        searchFlight.driectFlights(routes,searchCity,destination);

        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println("---------------------------------------Connecting flight-------------------------------------------------");
        searchFlight.connectingFights(routes,searchCity,destination);


    }
}
