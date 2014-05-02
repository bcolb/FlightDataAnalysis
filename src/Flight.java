/**
 * Flight.java
 *
 * @author bcolb
 * @version April 25th, 2014
 */

/**
 * Represents a single flight's data. Includes 29 state variables including 
 * date, arrival, destination, and delay information.
 */
public class Flight {

    /*
     * Each of the fields below represents a particular attribute for
     * that flight.
     */
    private int year;
    private int month;
    private int dayOfMonth;
    private int dayOfWeek;
    private String uniqueCarrier;
    private String originAirportID;
    private String destAirportID;
    private double depDelay;
    private double arrDelay;
    private boolean cancelled;
    private double carrierDelay;
    private double weatherDelay;
    private double nasDelay;
    private double securityDelay;
    private double lateAircraftDelay;
    private int divAirportLandings;

    /**
     * A parameterless constructor that creates a blank flight. All values
     * are initialized to 0, "", or 0.0 for int, String, and double.
     */
    public Flight() {
	this.year = 0;
	this.month = 0;
	this.dayOfMonth = 0;
	this.dayOfWeek = 0;
	this.uniqueCarrier = "";
	this.originAirportID = "";
	this.destAirportID = "";
	this.depDelay = 0.0;
	this.arrDelay = 0.0;
	this.cancelled = false;
	this.carrierDelay = 0;
	this.weatherDelay = 0;
	this.nasDelay = 0;
	this.securityDelay = 0;
	this.lateAircraftDelay = 0;
	this.divAirportLandings = 0;
    }

    /**
     * @return the year
     */
    public int getYear()
    {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year)
    {
        this.year = year;
    }

    /**
     * @return the month
     */
    public int getMonth()
    {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month)
    {
        this.month = month;
    }

    /**
     * @return the dayOfMonth
     */
    public int getDayOfMonth()
    {
        return dayOfMonth;
    }

    /**
     * @param dayOfMonth the dayOfMonth to set
     */
    public void setDayOfMonth(int dayOfMonth)
    {
        this.dayOfMonth = dayOfMonth;
    }

    /**
     * @return the dayOfWeek
     */
    public int getDayOfWeek()
    {
        return dayOfWeek;
    }

    /**
     * @param dayOfWeek the dayOfWeek to set
     */
    public void setDayOfWeek(int dayOfWeek)
    {
        this.dayOfWeek = dayOfWeek;
    }

    /**
     * @return the uniqueCarrier
     */
    public String getUniqueCarrier()
    {
        return uniqueCarrier;
    }

    /**
     * @param uniqueCarrier the uniqueCarrier to set
     */
    public void setUniqueCarrier(String uniqueCarrier)
    {
        this.uniqueCarrier = uniqueCarrier;
    }

    /**
     * @return the originAirportID
     */
    public String getOriginAirportID()
    {
        return originAirportID;
    }

    /**
     * @param originAirportID the originAirportID to set
     */
    public void setOriginAirportID(String originAirportID)
    {
        this.originAirportID = originAirportID;
    }

    /**
     * @return the destAirportID
     */
    public String getDestAirportID()
    {
        return destAirportID;
    }

    /**
     * @param destAirportID the destAirportID to set
     */
    public void setDestAirportID(String destAirportID)
    {
        this.destAirportID = destAirportID;
    }

    /**
     * @return the depDelay
     */
    public double getDepDelay()
    {
        return depDelay;
    }

    /**
     * @param depDelay the depDelay to set
     */
    public void setDepDelay(double depDelay)
    {
        this.depDelay = depDelay;
    }

    /**
     * @return the arrDelay
     */
    public double getArrDelay()
    {
        return arrDelay;
    }

    /**
     * @param arrDelay the arrDelay to set
     */
    public void setArrDelay(double arrDelay)
    {
        this.arrDelay = arrDelay;
    }

    /**
     * @return the cancelled
     */
    public boolean isCancelled()
    {
        return cancelled;
    }

    /**
     * @param cancelled the cancelled to set
     */
    public void setCancelled(boolean cancelled)
    {
        this.cancelled = cancelled;
    }

    /**
     * @return the carrierDelay
     */
    public double getCarrierDelay()
    {
        return carrierDelay;
    }

    /**
     * @param carrierDelay the carrierDelay to set
     */
    public void setCarrierDelay(double carrierDelay)
    {
        this.carrierDelay = carrierDelay;
    }

    /**
     * @return the weatherDelay
     */
    public double getWeatherDelay()
    {
        return weatherDelay;
    }

    /**
     * @param weatherDelay the weatherDelay to set
     */
    public void setWeatherDelay(double weatherDelay)
    {
        this.weatherDelay = weatherDelay;
    }

    /**
     * @return the nasDelay
     */
    public double getNasDelay()
    {
        return nasDelay;
    }

    /**
     * @param nasDelay the nasDelay to set
     */
    public void setNasDelay(double nasDelay)
    {
        this.nasDelay = nasDelay;
    }

    /**
     * @return the securityDelay
     */
    public double getSecurityDelay()
    {
        return securityDelay;
    }

    /**
     * @param securityDelay the securityDelay to set
     */
    public void setSecurityDelay(double securityDelay)
    {
        this.securityDelay = securityDelay;
    }

    /**
     * @return the lateAircraftDelay
     */
    public double getLateAircraftDelay()
    {
        return lateAircraftDelay;
    }

    /**
     * @param lateAircraftDelay the lateAircraftDelay to set
     */
    public void setLateAircraftDelay(double lateAircraftDelay)
    {
        this.lateAircraftDelay = lateAircraftDelay;
    }

    /**
     * @return the divAirportLandings
     */
    public int getDivAirportLandings()
    {
        return divAirportLandings;
    }

    /**
     * @param divAirportLandings the divAirportLandings to set
     */
    public void setDivAirportLandings(int divAirportLandings)
    {
        this.divAirportLandings = divAirportLandings;
    }

}