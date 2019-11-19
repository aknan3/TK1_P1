package interfaces;
import java.util.LinkedList;
import java.util.List;

import main.Flight;


public interface IFlightClient {

	void receiveListOfFlights(List<Flight> flights);
	void receiveUpdatedFlight(Flight flight, boolean deleted);
	
	
	
}
