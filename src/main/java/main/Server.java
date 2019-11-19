package main;

import java.util.LinkedList;
import java.util.List;

import interfaces.IFlightClient;
import interfaces.IFlightServer;
import interfaces.RMI;

import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.server.*;
import main.Flight;

public class Server implements RMI, IFlightServer {

	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;
	List<Flight> flights;
	
	
	
	public Server(){
	}
	
	/*
	public String sayHello() {
		return "Hello World!";
	}
	*/
	public List<Flight> getFlights(){
		return this.flights;
	}
	
	
	
	public static void main(String[] args) {
		//System.setProperty("java.rmi.server.hostname","127.0.0.1");
		//java.rmi.server.RMISocketFactory.getDefaultSocketFactory();
		
		try {
			System.err.println("Server ready?");
			Server obj = new Server();
			//obj.flights.add(new Flight("LH", 123));
			//obj.flights.add(new Flight("LH", 456));
			//System.err.println(obj.flights.getFirst());
			RMI stub = (RMI) UnicastRemoteObject.exportObject(obj, 0);
			// RMI stub = (RMI) UnicastRemoteObject.exportObject(flights, 0);
			// Bind the remove object's stub in the registry
			LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
			Registry registry = LocateRegistry.getRegistry();
			registry.rebind("RMI", stub);
//			registry.unbind("RMI");
			// rmi://Host:Port/Objektname
			
			System.err.println("Server ready");
			//System.err.println(obj.flights);
			
		} catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}
		
	}	
		
		
	@Override
	public void login(String clientName, IFlightClient client) {
			/*
			new Client(clientName);
			client.receiveListOfFlights(flights);
			*/
	}

	@Override
	public void logout(String clientName) {
		
	}

	@Override
	public void updateFlight(String clientName, Flight flight) {
		
	}

	@Override
	public void deleteFlight(String clientName, Flight flight) {
		
	}
	
	
	
}
