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
//import Jama.*;

/**
 * Algorithms for processing Flight Data.
 */
public class Solution {

    public static final int MIN_DELAY = 0;

    public static void calculateBasicData(Problem problem) {
	// Get the list of flights
	LinkedList<Flight> flights = problem.getFlights();

	// Initialize variables we plan to use
	long numFlights = 0;
	long numCancelled = 0;
	long numDiverted = 0;
	long totalDepDelays = 0;
	long totalDepDelays15 = 0;
	long totalDepDelays60 = 0;
	long totalDepDelays180 = 0;
	long totalArrDelays = 0;
	long totalArrDelays15 = 0;
	long totalArrDelays60 = 0;
	long totalArrDelays180 = 0;

	int carrierDelayCount = 0;
	long carrierDelayTotal = 0;
	long weatherDelayCount = 0;
	long weatherDelayTotal = 0;
	long nasDelayCount = 0;
	long nasDelayTotal = 0;
	long securityDelayCount = 0;
	long securityDelayTotal = 0;
	long lateAircraftDelayCount = 0;
	long lateAircraftDelayTotal = 0;

	for (Flight f: flights) {
	    numFlights++;
	    // Count # diverted and # cancelled
	    if (f.isCancelled()) numCancelled++;
	    if (f.getDivAirportLandings() > 0) numDiverted++;
	    // Count departure delays
	    if (f.getDepDelay() > 0) {
		totalDepDelays++;
		if (f.getDepDelay() >= 15) {
		    totalDepDelays15++;
		    if (f.getDepDelay() >= 60) {
			totalDepDelays60++;
			if (f.getDepDelay() >= 180) {
			    totalDepDelays180++;
			}
		    }
		}
	    }
	    // Count arrival delays
	    if (f.getArrDelay() > 0) {
		totalArrDelays++;
		if (f.getArrDelay() >= 15) {
		    totalArrDelays15++;
		    if (f.getArrDelay() >= 60) {
			totalArrDelays60++;
			if (f.getArrDelay() >= 180) {
			    totalArrDelays180++;
			}
		    }
		}
	    }
	    // Count delay causes and total times
	    if(f.getCarrierDelay() > MIN_DELAY) {
		carrierDelayCount++;
		carrierDelayTotal += f.getCarrierDelay();
	    }
	    if(f.getWeatherDelay() > MIN_DELAY) {
		weatherDelayCount++;
		weatherDelayTotal += (long) f.getWeatherDelay();
	    }
	    if(f.getNasDelay() > MIN_DELAY) {
		nasDelayCount++;
		nasDelayTotal += (long) f.getNasDelay();
	    }
	    if(f.getSecurityDelay() > MIN_DELAY) {
		securityDelayCount++;
		securityDelayTotal += (long) f.getSecurityDelay();
	    }
	    if(f.getLateAircraftDelay() > MIN_DELAY) {
		lateAircraftDelayCount++;
		lateAircraftDelayTotal += (long) f.getLateAircraftDelay();
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

	// Calculate numbers
	double percentCarrierDelay = (double)(carrierDelayCount / (double) totalArrDelays) * 100;
	long avgCarrierDelay = (carrierDelayTotal / carrierDelayCount);
	
	double percentWeatherDelay = (double)(weatherDelayCount / (double) totalArrDelays) * 100;
	long avgWeatherDelay = (weatherDelayTotal / weatherDelayCount);

	double percentNasDelay = (double)(nasDelayCount / (double) totalArrDelays) * 100;
	long avgNasDelay = (nasDelayTotal / nasDelayCount);

	double percentSecurityDelay = (double)(securityDelayCount / (double) totalArrDelays) * 100;
	long avgSecurityDelay = (securityDelayTotal / securityDelayCount);

	double percentLateAircraftDelay = (double)(lateAircraftDelayCount / (double) totalArrDelays) * 100;
	long avgLateAircraftDelay = (lateAircraftDelayTotal / lateAircraftDelayCount);

	System.out.println("-- Delay Causes --");
	System.out.println("Carrier Delay: " + percentCarrierDelay);
	System.out.println("Avg Carrier Delay: " + avgCarrierDelay);
	System.out.println("Weather Delay: " + percentWeatherDelay);
	System.out.println("Avg Weather Delay: " + avgWeatherDelay);
	System.out.println("NAS Delay: " + percentNasDelay);
	System.out.println("Avg NAS Delay: " + avgNasDelay);
	System.out.println("Security Delay: " + percentSecurityDelay);
	System.out.println("Avg Security Delay: " + avgSecurityDelay);
	System.out.println("Late Aircraft Delay: " + percentLateAircraftDelay);
	System.out.println("Avg Late Aircraft Delay: " + avgLateAircraftDelay);
    }


    /**
     * Linear Regression1
     * Basically just a test at the moment to see that the JAMA package
     * is setup correctly.
     */
    public void linearRegression1(Problem problem) {
	
    }
}