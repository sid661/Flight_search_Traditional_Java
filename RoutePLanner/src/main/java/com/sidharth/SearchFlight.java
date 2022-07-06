package com.sidharth;

public class SearchFlight
{

    Routes[] routes;
    public SearchFlight(Routes[] routes)
    {
        this.routes = routes;
    }
    public Routes[] getRoutes()
    {
        return routes;
    }

    public void setRoutes(Routes[] routes)
    {
        this.routes = routes;
    }


    ///*****************************************************************************************************************************//


    public Routes[] searchflight(Routes[] routes, String searchCity)
    {
        int count = 0;

        for (int i = 0; i < routes.length; i++) {
            if (searchCity.equals(routes[i].getCity1())) {
                count++;
            }

        }
        Routes[] availableFlights = new Routes[count];
        int j =0;
        for (int i = 0; i < routes.length; i++) {

            if (searchCity.equals(routes[i].getCity1())) {
                availableFlights[j] = routes[i];
                j++;
            }

        }
        return availableFlights;
    }


//**********************************************************************************************************************************//




    public void sortDirectFlights(Routes[] directFlights)
    {
        Routes temp;
        for (int i = 0; i < directFlights.length - 1; i++) {
            for (int j = i + 1; j < directFlights.length; j++) {
                if (directFlights[i].getCity2().compareTo(directFlights[j].getCity2()) > 0) {
                    temp = directFlights[i];
                    directFlights[i] = directFlights[j];
                    directFlights[j] = temp;
                }
            }
        }
    }


//***********************************************************************************************************************************************//


    public void driectFlights(Routes[] routes,String searchCity,String destination)
    {
        for (int i = 0; i < routes.length; i++)
        {
            if ((routes[i].getCity1().equals(searchCity)) && (routes[i].getCity2().equals(destination)))
            {
                System.out.println("Direct flights   " +"----From---->   " +searchCity + "   -----To----->  " + destination + " :::" +
                        "---Flight> "+routes[i].getCity1() + "\t --->" + routes[i].getCity2() + "\t FARE$$$$-->"+ routes[i].getPrice() +"\t TRAVEL TIME : "+ routes[i].getTime() + "\t DISTANCE ---->  "
                        +routes[i].getFlightno());
            }
        }

    }




    public void connectingFights(Routes[] routes, String searchCity, String destination)
    {

      for(int i = 0; i< routes.length;i++)
        {      String tempDestination = routes[i].getCity2().trim(); /// destination = tempdestion
            if((routes[i].getCity1().equals(searchCity))&&!(routes[i].getCity2().equals(destination)))
            { //loop (sourceas == input && destinatin == input )
                for (int j = 0; j < routes.length; j++)
                {
                    if (tempDestination.equals(routes[j].getCity1()) && routes[j].getCity2().equals(destination))
                            //
















                    {
                           System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
                    System.out.println("-----Source------>   "+routes[i].getCity1() + "\t -----Destination------>  " + routes[i].getCity2() +"\t FARE$$$$-->"+
                            routes[i].getPrice() +"\t TRAVEL TIME : "+ routes[i].getTime() + "\t DISTANCE ---->  "
                            +routes[i].getFlightno());

                    System.out.println("-----Source------> "+routes[j].getCity1() + "\t -----Destination------>  " + routes[j].getCity2() +"\t FARE$$$$--> "+
                            routes[j].getPrice() +"\t TRAVEL TIME : "+ routes[j].getTime() + "\t DISTANCE----> "
                            +routes[j].getFlightno());
                           connectingFights(routes, tempDestination, destination);
                       }
                }

            }
        }

    }




}


