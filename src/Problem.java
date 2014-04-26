/**
 * Problem.java
 *
 * @author bcolb
 * @version April 25, 2014
 */

import java.util.Scanner;
import java.util.HashMap;
import java.util.LinkedList;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Sets up the problem for flight data analysis.
 */
public class Problem {

    // Fields
    public HashMap<Integer, String> months;
    public LinkedList<Flight> flights;

    /**
     * A parameterless constructor that, for the moment, creates a list of
     * flights based off of the hard coded filenames.
     */
    public Problem() {
	flights = new LinkedList<Flight>();
	String january ="../data/224617947_T_ONTIME.csv";
	readMonth(january);
    }

    /**
     * 	@param filename the name of the csv file
     */
    public void readMonth(String filename) {
	BufferedReader br = null;
	String splitter = ",";
	String line = "";
	try {
	    br = new BufferedReader(new FileReader(filename));
	    line = br.readLine();
	    while ((line = br.readLine()) != null) {
		String[] data = line.split(splitter);
		for(int i = 0; i < data.length; i++){
		    data[i] = data[i].replaceAll("^\"|\"$", "");
		}
		int year = 2014;
		if (!data[0].equals("")) year = Integer.parseInt(data[0]);
		int month = 1;
		if (!data[1].equals("")) month = Integer.parseInt(data[1]);
		int dayOfMonth = 1;
		if (!data[2].equals("")) dayOfMonth = Integer.parseInt(data[2]);
		int dayOfWeek = 1;
		if (!data[3].equals("")) dayOfWeek = Integer.parseInt(data[3]);
		String uniqueCarrier = data[4];
		int flightNumber = 0000;
		if (!data[5].equals("")) flightNumber=Integer.parseInt(data[5]);

		String originAirportID = data[6];
		String originAirportSeqID = data[7];
		String originCityMarketID = data[8];
		String destAirportID = data[9];
		String destAirportSeqID = data[10];
		String destCityMarketID = data[11];
		String crsDepTime = data[12];
		String depTime = data[13];

		double depDelay = 0.0;
		if (!data[14].equals("")) {
		    depDelay = Double.parseDouble(data[14]);
		}
		String crsArrTime = data[15];
		String arrTime = data[16];

		double arrDelay = 0.0;
		if (!data[17].equals("")) {
		    arrDelay = Double.parseDouble(data[17]);
		}
		boolean cancelled = false;
		if(!data[18].equals("")) {
		    if( Double.parseDouble(data[18]) == 1){
			cancelled = true;
		    }
		}

		double crsElapsedTime = 0.0;
		if (!data[19].equals("")) {
		    crsElapsedTime = Double.parseDouble(data[19]);
		}
		double actualElapsedTime = 0.0;
		if (!data[20].equals("")) {
		    actualElapsedTime = Double.parseDouble(data[20]);
		}
		double airTime = 0.0;
		if (!data[21].equals("")) {
		    airTime = Double.parseDouble(data[21]);
		}
		double distance = 0.0;
		if (!data[22].equals("")) {
		    distance = Double.parseDouble(data[22]);
		}
		double carrierDelay = 0.0;
		if (!data[23].equals("")) {
		    carrierDelay = Double.parseDouble(data[23]);
		}
		double weatherDelay = 0.0;
		if (!data[24].equals("")) {
		    weatherDelay = Double.parseDouble(data[24]);
		}
		double nasDelay = 0.0;
		if (!data[25].equals("")) {
		    nasDelay = Double.parseDouble(data[25]);
		}
		double securityDelay = 0.0;
		if (!data[26].equals("")) {
		    securityDelay = Double.parseDouble(data[26]);
		}
		double lateAircraftDelay = 0.0;
		if (!data[27].equals("")) {
		    lateAircraftDelay = Double.parseDouble(data[27]);
		}
		int divAirportLandings = 0;
		if (!data[28].equals("")) {
		    divAirportLandings = Integer.parseInt(data[28]);
		}

		// Create a new Flight from the above data
		Flight flight = new Flight(year, month, dayOfMonth, dayOfWeek, uniqueCarrier, flightNumber, originAirportID, originAirportSeqID, originCityMarketID, destAirportID, destAirportSeqID, destCityMarketID, crsDepTime, depTime, depDelay, crsArrTime, arrTime, arrDelay, cancelled, crsElapsedTime, actualElapsedTime, airTime, distance, carrierDelay, weatherDelay, nasDelay, securityDelay, lateAircraftDelay, divAirportLandings);
		this.flights.add(flight);
	    }
	} catch (FileNotFoundException ex ) {
	    System.out.println("File Not Found");
	    System.exit(0);
	} catch (IOException ex) {
	    System.out.println("IOException");
	    System.exit(0);
	} catch (Exception ex) {
	    System.out.println("Other exception");
	    ex.printStackTrace();
	    System.exit(0);
	}
    }

    /**
     * Getter method for flights linked list.
     */
    public LinkedList<Flight> getFlights() {
	return flights;
    }

    /**
     * Setter method for flights linked list.
     */
    public void setFlights(LinkedList<Flight> flights) {
	this.flights = flights;
    }

    public static void main(String args[]) {

	// Initialize the problem
	Problem problem = new Problem();

	// Calculate some basic values
	Solution.calculateBasicData(problem);

	// More to come
    }
}