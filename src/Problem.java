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

    // static variables
    private static final boolean DEBUG = true;

    // Fields
    public HashMap<Integer, String> months;
    public LinkedList<Flight> flights;

    /**
     * A parameterless constructor that, for the moment, creates a list of
     * flights based off of the hard coded filenames.
     */
    public Problem(LinkedList<String> months) {
	flights = new LinkedList<Flight>();

	if(DEBUG) System.out.println("Reading data into memory...");

	for (String month: months) {
	    readMonth(month);
	}

	if(DEBUG) System.out.println("Finished reading data into memory...");
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
		Flight flight = new Flight();
		for(int i = 0; i < data.length; i++){
		    data[i] = data[i].replaceAll("^\"|\"$", "");
		}
		if (!data[14].equals("")) {
		    flight.setDepDelay(Double.parseDouble(data[14]));
		}
		if (!data[17].equals("")) {
		    flight.setArrDelay(Double.parseDouble(data[17]));
		}
		if(!data[18].equals("")) {
		    if( Double.parseDouble(data[18]) == 1){
			flight.setCancelled(true);
		    }
		}
		if (!data[23].equals("")) {
		    flight.setCarrierDelay(Double.parseDouble(data[23]));
		}
		if (!data[24].equals("")) {
		    flight.setWeatherDelay(Double.parseDouble(data[24]));
		}
		if (!data[25].equals("")) {
		    flight.setNasDelay(Double.parseDouble(data[25]));
		}
		if (!data[26].equals("")) {
		    flight.setSecurityDelay(Double.parseDouble(data[26]));
		}
		if (!data[27].equals("")) {
		    flight.setLateAircraftDelay(Double.parseDouble(data[27]));
		}
		if (!data[28].equals("")) {
		    flight.setDivAirportLandings(Integer.parseInt(data[28]));
		}
		this.flights.add(flight);
	    }
	} /*catch (FileNotFoundException ex ) {
	    System.out.println("File Not Found");
	    System.exit(0);
	} catch (IOException ex) {
	    System.out.println("IOException");
	    System.exit(0);
	    } */catch (Exception ex) {
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
	// Create a new list that contains filenames
	LinkedList<String> months = new LinkedList<String>();
	months.add("../data/JANUARY_2013_FLIGHTS.csv");
	months.add("../data/FEBRUARY_2013_FLIGHTS.csv");
	//months.add("../data/MARCH_2013_FLIGHTS.csv");
	//months.add("../data/APRIL_2013_FLIGHTS.csv");
	//months.add("../data/MAY_2013_FLIGHTS.csv");
	//months.add("../data/JUNE_2013_FLIGHTS.csv");
	//months.add("../data/JULY_2013_FLIGHTS.csv");
	//months.add("../data/AUGUST_2013_FLIGHTS.csv");
	//months.add("../data/SEPTEMBER_2013_FLIGHTS.csv");
	//months.add("../data/OCTOBER_2013_FLIGHTS.csv");
	//months.add("../data/NOVEMBER_2013_FLIGHTS.csv");
	//months.add("../data/DECEMBER_2013_FLIGHTS.csv");

	// Initialize the problem
	Problem problem = new Problem(months);

	// Calculate some basic values
	Solution.calculateBasicData(problem);

    }
}