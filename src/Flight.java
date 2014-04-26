/**
 * Flight.java
 *
 * @author bcolb
 * @version April 25th, 2014
 */

/**
 * Represents a single flight's information.
 */
public class Flight{

    /*
     * Each of the fields below represents a particular attribute for
     * that flight. Note that values that are not set are represented either
     * as 0, 0.0, or "".
     */
    public int year;
    public int month;
    public int dayOfMonth;
    public int dayOfWeek;
    public String uniqueCarrier;
    public int flightNumber;
    public String originAirportID;
    public String originAirportSeqID;
    public String originCityMarketID;
    public String destAirportID;
    public String destAirportSeqID;
    public String destCityMarketID;
    public String crsDepTime;
    public String depTime;
    public double depDelay;
    public String crsArrTime;
    public String arrTime;
    public double arrDelay;
    public boolean cancelled;
    public double crsElapsedTime;
    public double actualElapsedTime;
    public double airTime;
    public double distance;
    public double carrierDelay;
    public double weatherDelay;
    public double nasDelay;
    public double securityDelay;
    public double lateAircraftDelay;
    public int divAirportLandings;

    /**
     * A parameterless constructor that creates a blank flight. All values
     * are initialized to 0, "", or 0.0 for int, String, and double respectively.
     */
    public Flight() {
	this.year = 0;
	this.month = 0;
	this.dayOfMonth = 0;
	this.dayOfWeek = 0;
	this.uniqueCarrier = "";
	this.flightNumber = 0;
	this.originAirportID = "";
	this.originAirportSeqID = "";
	this.originCityMarketID = "";
	this.destAirportID = "";
	this.destAirportSeqID = "";
	this.destCityMarketID = "";
	this.crsDepTime = "";
	this.depTime = "";
	this.depDelay = 0.0;
	this.crsArrTime = "";
	this.arrTime = "";
	this.arrDelay = 0.0;
	this.cancelled = false;
	this.crsElapsedTime = 0;
	this.actualElapsedTime = 0;
	this.airTime = 0;
	this.distance = 0;
	this.carrierDelay = 0;
	this.weatherDelay = 0;
	this.nasDelay = 0;
	this.securityDelay = 0;
	this.lateAircraftDelay = 0;
	this.divAirportLandings = 0;
    }

    /**
     * A constructor that requires all 29 possible values be passed in. 
     */
    public Flight(int year, int month, int dayOfMonth, int dayOfWeek, String uniqueCarrier, int flightNumber, String originAirportID, String originAirportSeqID, String originCityMarketID, String destAirportID, String destAirportSeqID, String destCityMarketID, String crsDepTime, String depTime, double depDelay, String crsArrTime, String arrTime, double arrDelay, boolean cancelled, double crsElapsedTime, double actualElapsedTime, double airTime, double distance, double carrierDelay, double weatherDelay, double nasDelay, double securityDelay, double lateAircraftDelay, int divAirportLandings) {
	this.year = year;
	this.month = month;
	this.dayOfMonth = dayOfMonth;
	this.dayOfWeek = dayOfWeek;
	this.uniqueCarrier = uniqueCarrier;
	this.flightNumber = flightNumber;
	this.originAirportID = originAirportID;
	this.originAirportSeqID = originAirportSeqID;
	this.originCityMarketID = originCityMarketID;
	this.destAirportID = destAirportID;
	this.destAirportSeqID = destAirportSeqID;
	this.destCityMarketID = destCityMarketID;
	this.crsDepTime = crsDepTime;
	this.depTime = depTime;
	this.depDelay = depDelay;
	this.crsArrTime = crsArrTime;
	this.arrTime = arrTime;
	this.arrDelay = arrDelay;
	this.cancelled = cancelled;
	this.crsElapsedTime = crsElapsedTime;
	this.actualElapsedTime = actualElapsedTime;
	this.airTime = airTime;
	this.distance = distance;
	this.carrierDelay = carrierDelay;
	this.weatherDelay = weatherDelay;
	this.nasDelay = nasDelay;
	this.securityDelay = securityDelay;
	this.lateAircraftDelay = lateAircraftDelay;
	this.divAirportLandings = divAirportLandings;
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
     * @return the flightNumber
     */
    public int getFlightNumber()
    {
        return flightNumber;
    }

    /**
     * @param flightNumber the flightNumber to set
     */
    public void setFlightNumber(int flightNumber)
    {
        this.flightNumber = flightNumber;
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
     * @return the originAirportSeqID
     */
    public String getOriginAirportSeqID()
    {
        return originAirportSeqID;
    }

    /**
     * @param originAirportSeqID the originAirportSeqID to set
     */
    public void setOriginAirportSeqID(String originAirportSeqID)
    {
        this.originAirportSeqID = originAirportSeqID;
    }

    /**
     * @return the originCityMarketID
     */
    public String getOriginCityMarketID()
    {
        return originCityMarketID;
    }

    /**
     * @param originCityMarketID the originCityMarketID to set
     */
    public void setOriginCityMarketID(String originCityMarketID)
    {
        this.originCityMarketID = originCityMarketID;
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
     * @return the destAirportSeqID
     */
    public String getDestAirportSeqID()
    {
        return destAirportSeqID;
    }

    /**
     * @param destAirportSeqID the destAirportSeqID to set
     */
    public void setDestAirportSeqID(String destAirportSeqID)
    {
        this.destAirportSeqID = destAirportSeqID;
    }

    /**
     * @return the destCityMarketID
     */
    public String getDestCityMarketID()
    {
        return destCityMarketID;
    }

    /**
     * @param destCityMarketID the destCityMarketID to set
     */
    public void setDestCityMarketID(String destCityMarketID)
    {
        this.destCityMarketID = destCityMarketID;
    }

    /**
     * @return the crsDepTime
     */
    public String getCrsDepTime()
    {
        return crsDepTime;
    }

    /**
     * @param crsDepTime the crsDepTime to set
     */
    public void setCrsDepTime(String crsDepTime)
    {
        this.crsDepTime = crsDepTime;
    }

    /**
     * @return the depTime
     */
    public String getDepTime()
    {
        return depTime;
    }

    /**
     * @param depTime the depTime to set
     */
    public void setDepTime(String depTime)
    {
        this.depTime = depTime;
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
     * @return the crsArrTime
     */
    public String getCrsArrTime()
    {
        return crsArrTime;
    }

    /**
     * @param crsArrTime the crsArrTime to set
     */
    public void setCrsArrTime(String crsArrTime)
    {
        this.crsArrTime = crsArrTime;
    }

    /**
     * @return the arrTime
     */
    public String getArrTime()
    {
        return arrTime;
    }

    /**
     * @param arrTime the arrTime to set
     */
    public void setArrTime(String arrTime)
    {
        this.arrTime = arrTime;
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
     * @return the crsElapsedTime
     */
    public double getCrsElapsedTime()
    {
        return crsElapsedTime;
    }

    /**
     * @param crsElapsedTime the crsElapsedTime to set
     */
    public void setCrsElapsedTime(double crsElapsedTime)
    {
        this.crsElapsedTime = crsElapsedTime;
    }

    /**
     * @return the actualElapsedTime
     */
    public double getActualElapsedTime()
    {
        return actualElapsedTime;
    }

    /**
     * @param actualElapsedTime the actualElapsedTime to set
     */
    public void setActualElapsedTime(double actualElapsedTime)
    {
        this.actualElapsedTime = actualElapsedTime;
    }

    /**
     * @return the airTime
     */
    public double getAirTime()
    {
        return airTime;
    }

    /**
     * @param airTime the airTime to set
     */
    public void setAirTime(double airTime)
    {
        this.airTime = airTime;
    }

    /**
     * @return the distance
     */
    public double getDistance()
    {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(double distance)
    {
        this.distance = distance;
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