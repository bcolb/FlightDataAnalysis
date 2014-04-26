/**
 * Solution.java
 *
 * @author bcolb
 * @version April 25, 2014
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;

/**
 * Algorithms for processing Flight Data.
 */
public class Solution {

    public static void calculateBasicData(Problem problem) {
	// Get the list of flights
	LinkedList<Flight> flights = problem.getFlights();

	// Initialize variables we plan to use
	int numFlights = 0;
	int numCancelled = 0;
	int numDiverted = 0;
	int totalDepDelays = 0;
	int totalDepDelays15 = 0;
	int totalDepDelays60 = 0;
	int totalDepDelays180 = 0;
	int totalArrDelays = 0;
	int totalArrDelays15 = 0;
	int totalArrDelays60 = 0;
	int totalArrDelays180 = 0;

	for (Flight f: flights) {
	    numFlights++;
	    // Count # diverted and # cancelled
	    if (f.cancelled) numCancelled++;
	    if (f.divAirportLandings > 0) numDiverted++;

	    // Count departure delays
	    if (f.depDelay > 0) {
		totalDepDelays++;
		if (f.depDelay >= 15) {
		    totalDepDelays15++;
		    if (f.depDelay >= 60) {
			totalDepDelays60++;
			if (f.depDelay >= 180) {
			    totalDepDelays180++;
			}
		    }
		}
	    }
	    // Count arrival delays
	    if (f.arrDelay > 0) {
		totalArrDelays++;
		if (f.arrDelay >= 15) {
		    totalArrDelays15++;
		    if (f.arrDelay >= 60) {
			totalArrDelays60++;
			if (f.arrDelay >= 180) {
			    totalArrDelays180++;
			}
		    }
		}
	    }
	}

	// Print out a report
	System.out.println("***** Basic Data Report *****");
	System.out.println("Total Number of Flights: " + numFlights);
	System.out.println("Cancelled Flights: " + numCancelled);
	System.out.println("Diverted Flights: " + numDiverted);
	System.out.println("-- Departure Delays -- ");
	System.out.println("Delays > 0 min: " + totalDepDelays);
	System.out.println("Delays >= 15 min: " + totalDepDelays15);
	System.out.println("Delays >= 60 min: " + totalDepDelays60);
	System.out.println("Delays >= 180 min: " + totalDepDelays180);
	System.out.println("-- Arrival Delays --");
	System.out.println("Delays > 0 min: " + totalArrDelays);
	System.out.println("Delays >= 15 min: " + totalArrDelays15);
	System.out.println("Delays >= 60 min: " + totalArrDelays60);
	System.out.println("Delays >= 180 min: " + totalArrDelays180);

	double percentCancelled = ((double) numCancelled / (double) numFlights) * 100;
	double percentDiverted = ((double) numDiverted / (double) numFlights) * 100;
	double percent0 = ((double) totalArrDelays / (double) numFlights) * 100;
	double percent15 = ((double) totalArrDelays15 / (double) numFlights) * 100;
	double percent60 = ((double) totalArrDelays60 / (double) numFlights) * 100;
	double percent180 = ((double) totalArrDelays180 / (double) numFlights) * 100;

	System.out.println("-- Percent Affected --");
	System.out.println("Cancelled Flights: " + percentCancelled);
	System.out.println("Diverted Flights: " + percentDiverted);
	System.out.println("Arrival Delay > 0 min: " + percent0);
	System.out.println("Arrival Delay >= 15 min: " + percent15);
	System.out.println("Arrival Delay >= 60 min: " + percent60);
	System.out.println("Arrival Delay >= 180 min: " + percent180);
    }
}