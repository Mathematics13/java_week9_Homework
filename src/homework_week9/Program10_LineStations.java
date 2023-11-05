package homework_week9;

import java.util.HashMap;

/** Program 10
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name
 */
public class Program10_LineStations
{
    public static void main(String[] args)
    {
        //Create a HashMap to store station name and their corresponding Tube lines
        HashMap<String,String> stationToLine = new HashMap();                                                              //HashMap declaration

        //Populate the hashmap with Zone1 London stations and their Tube lines
        stationToLine.put("Paddington" , "Bakerloo");
        stationToLine.put("Oxford Circus" , "Bakerloo , Central , Victoria");
        stationToLine.put("Liverpool Street" , "Central , Circle,Hammersmith & City , Metropolitan");
        stationToLine.put("Embankment" , "Bakerloo , Circle,District , Northern");

        String targetStation = "Oxford Circus";                                                                   //Specify the station you want to check

        if(stationToLine.containsKey(targetStation))             //Check if the specified station is in the HashMap and get the corresponding Tube lines
        {
            String lines = stationToLine.get(targetStation);
            System.out.println("Tube lines passing through " + targetStation +  " : " + lines);
        }
        else
        {
            System.out.println("station not found in zone 1 London ");
        }
    }
}
