package main;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;


public class Flight  {

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	public String IATACode, Name, ModelName, DepartureAirport, 
		ArrivalAirport,OriginDate, FlightStatus;
	public Integer FlightNumber; //ArrivalTerminal, DepartureTerminal
	String ArrivalScheduled, ArrivalTerminal, ArrivalGates, ArrivalEstimated;
	String DepartureScheduled, DepartureTerminal, DepartureGates, CheckInLoc,
		CheckInCounter, CheckInTime;
	//Date OriginDate, ArrivalScheduled, ArrivalEstimated, DepartureScheduled, CheckInTime
	
	
	public Flight(String IATACode, Integer FlightNumber) {
		this.IATACode = IATACode;
		this.FlightNumber = FlightNumber;
	}
		
	
	
	
}
