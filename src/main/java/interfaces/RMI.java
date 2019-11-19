package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.LinkedList;
import java.util.List;

import main.Flight;
public interface RMI extends Remote{
	
	//String sayHello() throws RemoteException;
	List<Flight> getFlights() throws RemoteException;
}
