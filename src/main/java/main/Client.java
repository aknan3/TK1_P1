package main;
import java.util.LinkedList;
import java.util.List;
import interfaces.IFlightClient;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import interfaces.RMI;

import java.io.Serializable;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client implements IFlightClient{

	 
	String clientName;
	List<Flight> listOfFlights;// = new LinkedList<Flight>();
	GUIArrivalsDepartures gui;
	
	private Client(String clientName){
		this.clientName = clientName;
	}
	public static void main(String[] args) throws RemoteException, NotBoundException {
		//String host = (args.length < 1) ? null : args[0];
		
		
		try {
			System.err.println("Client ready?");
			Client client = new Client("one");
		//	client.listOfFlights = new LinkedList<Flight>();
			Registry registry = LocateRegistry.getRegistry();
			RMI stub = (RMI) registry.lookup("RMI");
		
			client.receiveListOfFlights(stub.getFlights());
			//System.out.println(client.listOfFlights.get(0).IATACode + client.listOfFlights.get(0).FlightNumber);
			System.out.println(client.listOfFlights.get(1).IATACode + client.listOfFlights.get(1).FlightNumber);
			client.gui = new GUIArrivalsDepartures();
			
			
			
			System.err.println("Client ready");
		}catch (Exception e) {
			System.err.println("Client exception: "+e.toString());
			e.printStackTrace();
		}
		
	}

	@Override
	public void receiveListOfFlights(List<Flight> flights) {
		this.listOfFlights = (LinkedList<Flight>) flights;
	}

	@Override
	public void receiveUpdatedFlight(Flight flight, boolean deleted) {
		
	}
	
}
