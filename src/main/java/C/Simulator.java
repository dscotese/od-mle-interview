package C;

import extras.Location;
import extras.Person;

public class Simulator {
    private final double speed = 50;

    private double getTravelTime(Location src, Location dst){
        // TODO using your Haversine function from B calculate travel time
        //
        // Example
        // Haversine returns 300 miles => 6 hours is the output of this function
        return 0;
    }

    public void goOnATrip(Person a, Person b, Location src, Location dst) {
        // TODO Implement a travel simulation for a trip according to these rules
        // See examples if these rules are unclear
        // The length of a driving arc is Uniform(4,6)
        // At the end of every arc the person driving will switch
        // The end of an arc is min (Uniform(4,6) , time until next break)
        // Print the time spent driving
        // (Sometimes) Every 8 hours our passengers take a 30 min break and log "Taking a short break"
        // (Sometimes) Every 11 hours our passengers take a 8 hour break and log "Taking a long break"
        // Print the total time on the trip
        //
        // Example - 4 Hour Trip
        // Solange drove for 4.00 hours.
        // The total trip time was 4.00 hours.
        //
        // Example - 9 Hour Trip
        // Solange drove for 5.43 hours.
        // Beyonce drove for 2.57 hours. 
        // Taking a short break
        // Solange drove for 1.00 hours.
        // The total trip time was 9.50 hours.
        //
        // Example - 15 Hour Trip
        // Solange drove for 4.89 hours.
        // Beyonce drove for 3.11 hours. 
        // Taking a short break
        // Solange drove for 3.00 hours.
        // Taking a long break.
        // Beyonce drove for 4.00 hours.
        // The total trip time was 25.5 hours.

        double travelTime = getTravelTime(src, dst);
    }
}
