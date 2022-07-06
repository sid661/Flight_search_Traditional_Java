package com.sidharth;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class RouteTask
{

    public Routes [] getInformation()
    {
        File f = new File("src/main/java/com/sidharth/routes.csv");
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(f)))
        {
            br.readLine();
            while (br.readLine() != null)
                count++;
        }
        catch(Exception e){
            System.out.println("hello");
        }
       // System.out.println(count);
        Routes[] routes = new Routes[count];

        try (BufferedReader br = new BufferedReader(new FileReader(f)))
        {
            br.readLine();
            int i = 0;
            String temp;
            while ((temp = br.readLine()) != null)
            {
                String[] routesarray = temp.split(",");
                String city1 = routesarray[0].trim();
                String city2 = routesarray[1].trim();
                String flightno = String.valueOf(routesarray[2].trim());
                String time = routesarray[3].trim();
                String price = routesarray[4].trim();
                routes[i] = new Routes(city1.trim(), city2.trim(), flightno.trim(), price.trim(), time);
                i++;


            }
        }
        catch(Exception e){
            System.out.println("hello");
        }

        System.out.println("--------------------------------------------All Listed flights ---------------------------------------------------");
        System.out.println(String.format("%15s %15s %25s %20s %20s", "From", "To", "Distance in Km", "Travel Time", "Airfare"));


        for (int i = 0; i < routes.length; i++)
        {
            System.out.println(routes[i]);
        }
        return routes;
    }
}

